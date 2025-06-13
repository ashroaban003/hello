package com.ashishcodes.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {
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
