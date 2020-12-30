package com.example.reidsspringboot.gof23.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The triangle is the most balanced
 */


public class TreeFactory {
    private static Map<String,Tree> map=new ConcurrentHashMap<>();
    public static Tree getTree(String name,String data){
        if (map.containsKey(name)){
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name,tree);
        return tree;
    }
}