package com.hbs.simplespring.beans;

/**
 * 用于 bean 的属性注入
 * Created by bingsenh on 2019/9/5.
 */
public class PropertyValue {

    private final String name;
    private final Object value;
    public PropertyValue(String name,Object value){
        this.name = name;
        this.value = value;
    }

    public String getName(){return name;}
    public Object getValue(){return value;}
}
