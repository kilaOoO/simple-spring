package com.hbs.simplespring.aop;

/**
 * Created by bingsenh on 2019/9/7.
 */
public interface ClassFilter {
    boolean matches(Class targetClass);
}
