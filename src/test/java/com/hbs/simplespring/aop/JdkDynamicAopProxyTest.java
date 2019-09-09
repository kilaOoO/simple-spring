package com.hbs.simplespring.aop;

import com.hbs.simplespring.HelloWorldService;
import com.hbs.simplespring.beans.context.ApplicationContext;
import com.hbs.simplespring.beans.context.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * Created by bingsenh on 2019/9/7.
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception {
        //----------HelloWorldService without AOP
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyspring");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
        //----------HelloWorldService with AOP
        // 1.设置被代理对象(JoinPoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(HelloWorldService.class,helloWorldService);
        advisedSupport.setTargetSource(targetSource);

        // 2.设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3.创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();

        // 4.基于AOP的调用
        helloWorldServiceProxy.helloWorld();
    }
}
