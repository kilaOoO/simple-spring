package com.hbs.simplespring.beans;

import com.hbs.simplespring.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bingsenh on 2019/9/5.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
