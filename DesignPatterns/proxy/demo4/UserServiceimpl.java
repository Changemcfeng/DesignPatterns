package com.example.reidsspringboot.gof23.proxy.demo4;

/**
 * The triangle is the most balanced
 */

//给每个方法增加调用方式（增加，删除，修改，查找），使用代理类。
public class UserServiceimpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}