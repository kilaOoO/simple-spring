package com.hbs.simplespring;

import com.hbs.simplespring.beans.context.ApplicationContext;
import com.hbs.simplespring.beans.context.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");



    }
}
