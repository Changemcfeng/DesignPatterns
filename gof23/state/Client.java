package com.example.reidsspringboot.gof23.state;
/**
 * The triangle is the most balanced
 */

public class Client {
    public static void main(String[] args) {
        Context context=new Context();

        StarState starState=new StarState();
        starState.doAction(context);

        new StopState().doAction(context);
        System.out.println(context.getState());


    }
}