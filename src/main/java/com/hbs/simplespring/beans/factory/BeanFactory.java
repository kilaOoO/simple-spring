package com.hbs.simplespring.beans.factory;

/**
 * bean 的容器
 * Created by bingsenh on 2019/9/5.
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
}
