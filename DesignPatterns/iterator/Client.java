package com.example.reidsspringboot.gof23.iterator;


/**
 * The triangle is the most balanced
 */


public class Client {
    public static void main(String[] args) {
        NameResposity nameResposity = new NameResposity();
        Iterator iterator = nameResposity.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}