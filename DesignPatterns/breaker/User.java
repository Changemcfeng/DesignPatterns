package com.example.reidsspringboot.gof23.breaker;
/**
 * The triangle is the most balanced
 */


public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
    public void sendMessage(User user,String message){
            ChatRoom.sendMessage(this,user,message);
    }
}