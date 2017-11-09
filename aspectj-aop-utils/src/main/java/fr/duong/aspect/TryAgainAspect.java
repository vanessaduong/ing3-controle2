package fr.duong.aspect;

import fr.duong.aop.TryAgain;

/**
 * @author van.duong
 */
public class TryAgainAspect {

    @TryAgain()
    public void myMethod(){
        System.out.println("Test");
    }
}
