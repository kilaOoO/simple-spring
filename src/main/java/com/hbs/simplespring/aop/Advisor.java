package com.hbs.simplespring.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by bingsenh on 2019/9/7.
 */
public interface Advisor {
    Advice getAdvice();
}
