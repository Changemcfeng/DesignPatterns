package com.example.reidsspringboot.gof23.breaker;

import java.util.Date;

/**
 * The triangle is the most balanced
 */


public class ChatRoom {
    public static void sendMessage(User user,User receiver,String message){
        System.out.println(new Date().toString()+"\n"+user.getName()+":"+"\n"+receiver.getName()+"  ,  "+message);
    }
}