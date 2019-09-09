package com.hbs.simplespring.aop;

import java.lang.reflect.Method;

/**
 * Created by bingsenh on 2019/9/7.
 */
public interface MethodMatcher {

    boolean matches(Method method,Class targetClass);
}
