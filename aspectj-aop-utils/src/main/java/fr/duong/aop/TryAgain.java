package fr.duong.aop;


import java.lang.annotation.*;

/**
 * @author van.duong
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface TryAgain {

    Class<?> myClasse() default Object.class;
}
