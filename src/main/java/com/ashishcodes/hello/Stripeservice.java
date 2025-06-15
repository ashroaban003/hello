package com.ashishcodes.hello;

public class Stripeservice implements PaymentService{
    @Override
    public void processPayment(double amount){
        System.out.println("Stripping " + amount);
    }
}
