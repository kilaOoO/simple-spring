package com.hbs.simplespring.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by bingsenh on 2019/9/8.
 */
public class AspectExpressionPointAdvisor implements PointcutAdvisor {
    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    private Advice advice;

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public void setPointcut(AspectJExpressionPointcut pointcut) {
        this.pointcut = pointcut;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice ;
    }
}
