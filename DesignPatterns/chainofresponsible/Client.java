package com.example.reidsspringboot.gof23.chainofresponsible;
/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        Request build = new Request.RequestBuilder().frequentOk(false).loggedOn(true).build();
        FrequentHandler frequentHandler = new FrequentHandler(new LoginHandler(null));
        if (frequentHandler.process(build)){
            System.out.println("normal");
        }
        else{
            System.out.println("errer");
        }
    }
}