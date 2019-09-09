package com.hbs.simplespring.beans.factory;

import com.hbs.simplespring.BeanReference;
import com.hbs.simplespring.beans.BeanDefinition;
import com.hbs.simplespring.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * 自动装配
 * Created by bingsenh on 2019/9/5.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        beanDefinition.setBean(bean);
        applyPropertyValues(bean,beanDefinition);
        return bean;

    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean,BeanDefinition mbd) throws Exception {
        for(PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValues()){
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if(value instanceof BeanReference){
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }

            declaredField.set(bean,value);
        }
    }

}
