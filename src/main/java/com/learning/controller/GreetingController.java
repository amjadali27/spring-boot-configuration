package com.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${greeting.message:default message}")
    private String greetingMessage;

    @Value("My static message")
    private String staticMessage;

    @Value("${mylist}")
    private List<String> myList;

    @Value("#{${dbValues}}")
    private Map<String,String> dbValues;

    @RequestMapping("greeting")
    public String greeting(){
        return greetingMessage+"\n"+staticMessage+"  My List:: "+myList;
    }
}
