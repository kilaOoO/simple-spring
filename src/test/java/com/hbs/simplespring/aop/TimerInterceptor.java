package com.hbs.simplespring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by bingsenh on 2019/9/7.
 */
public class TimerInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long time = System.nanoTime();
        System.out.println("Invocation of Method "+methodInvocation.getMethod().getName() +" start");
        Object proceed = methodInvocation.proceed();
        System.out.println("Invocation of Method "+methodInvocation.getMethod().getName() +" end "+
                (System.nanoTime()-time) +" nanoseconds.");
        return proceed;
    }
}
