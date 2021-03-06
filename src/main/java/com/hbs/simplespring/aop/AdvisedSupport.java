package com.hbs.simplespring.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.Method;

/**
 * 代理相关的元数据
 * Created by bingsenh on 2019/9/7.
 */
public class AdvisedSupport {
    private TargetSource targetSource;
    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }
}
