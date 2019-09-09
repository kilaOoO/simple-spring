package com.hbs.simplespring.beans.context;

import com.hbs.simplespring.beans.BeanDefinition;
import com.hbs.simplespring.beans.factory.AbstractBeanFactory;
import com.hbs.simplespring.beans.factory.AutowireCapableBeanFactory;
import com.hbs.simplespring.beans.io.ResourceLoader;
import com.hbs.simplespring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by bingsenh on 2019/9/5.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation,new AutowireCapableBeanFactory());

    }

    public ClassPathXmlApplicationContext(String configLocation,AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry:xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(),beanDefinitionEntry.getValue());
        }
    }
}
