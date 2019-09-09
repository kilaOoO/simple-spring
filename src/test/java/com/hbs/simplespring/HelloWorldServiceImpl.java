package com.hbs.simplespring;

/**
 * Created by bingsenh on 2019/9/7.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    private String text;
    private OutputService outputService;


    @Override
    public void helloWorld() {
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
