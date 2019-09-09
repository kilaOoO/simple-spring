package com.hbs.simplespring.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装一个对象的所有PropertyValue
 * 不直接使用 list,可以封装一些操作
 * Created by bingsenh on 2019/9/5.
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();
    public PropertyValues(){

    }

    public void addPropertyValue(PropertyValue pv){
        // 判重
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues(){return this.propertyValueList;}
}
