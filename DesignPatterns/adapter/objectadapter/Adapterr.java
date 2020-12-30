package com.example.reidsspringboot.gof23.adapter.objectadapter;
/**
 * The triangle is the most balanced
 */

//对象适配器
public class Adapterr  implements NetToUSB {
    private Adapter adapter;

    public Adapterr(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void handlerRequst() {
        adapter.request();
    }
}