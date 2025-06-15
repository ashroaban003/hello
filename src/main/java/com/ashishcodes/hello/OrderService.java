package com.ashishcodes.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {
    @RequestMapping("/order")
    public String placeOrder(){
        var paymentservice = new Stripeservice();
        paymentservice.processPayment(10.0);
        return "FF";
        //tightly couble with stripservice
        //we use interface to decouple them
    }
}
