package com.ashishcodes.hello;

public class OrderService {
    public void placeOrder(){
        var paymentservice = new Stripeservice();
        paymentservice.processPayment(10.0);
        //tightly couble with stripservice
        //we use interface to decouple them
    }
}
