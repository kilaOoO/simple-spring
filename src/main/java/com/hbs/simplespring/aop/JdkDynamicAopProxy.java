package com.hbs.simplespring.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by bingsenh on 2019/9/7.
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {

    private AdvisedSupport advised;
    public JdkDynamicAopProxy(AdvisedSupport advised){this.advised =advised;}
    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{advised.getTargetSource().getTargetClass()},this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
        return methodInterceptor.invoke(new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(),method,args));
    }
}
