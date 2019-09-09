package com.hbs.simplespring.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by bingsenh on 2019/9/8.
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
