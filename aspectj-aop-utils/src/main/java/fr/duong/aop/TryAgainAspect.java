package fr.duong.aop;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

/**
 * @author van.duong
 */
public class TryAgainAspect {

    private final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    @Around("@annotation(tryagain)")
    public Object performOperation(ProceedingJoinPoint pjp, TryAgain tryAgain) throws Throwable {
        Class[] exceptionClass = tryAgain.exceptions();
        int retries = -1;
        if (!(retries > 0)) {
            retries = this.maxRetries;
        }
        int numAttempts = 0;
        do {
            numAttempts++;
            try {
                return pjp.proceed();
            } catch (Throwable ex) {
                if (!exceptionClass.equals(ex)) {
                    throw ex;
                }

                if (numAttempts > retries) {
                    System.out.println("Caught {} and exceeded maximum retries ({}), rethrowing.");
                    throw ex;
                }
            }
        } while (numAttempts <= retries);
        return null;
    }


}
