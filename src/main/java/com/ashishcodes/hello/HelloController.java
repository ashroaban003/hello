package com.ashishcodes.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {
    @Value("${spring.application.name}")
    private String appname;
    @RequestMapping("/")
    public String requestMethodName() {
        return appname;
    }
    
    @RequestMapping("/hello")  
    public String hello(){
        String viewName = getViewName();
        System.out.println(viewName);
        return viewName;
    }
    private String getViewName(){
        return "index";
    }
}
