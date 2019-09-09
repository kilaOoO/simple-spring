package com.hbs.simplespring;

import org.junit.Assert;

/**
 * Created by bingsenh on 2019/9/7.
 */
public class OutputService {
    private HelloWorldService helloWorldService;
    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
