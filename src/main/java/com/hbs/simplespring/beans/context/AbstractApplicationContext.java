package com.hbs.simplespring.beans.context;

import com.hbs.simplespring.beans.factory.AbstractBeanFactory;

/**
 * Created by bingsenh on 2019/9/5.
 */
public class AbstractApplicationContext implements ApplicationContext{
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory){
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception{

    }

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }
}
