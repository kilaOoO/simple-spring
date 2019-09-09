package com.hbs.simplespring.beans;

/**
 * Created by bingsenh on 2019/9/5.
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
