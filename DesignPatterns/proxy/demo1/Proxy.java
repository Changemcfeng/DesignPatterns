package com.example.reidsspringboot.gof23.proxy.demo1;

/**
 * The triangle is the most balanced
 */

//代理会增加一些安全限制和功能
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        signContract();
    }
    public void seeHouse(){
        System.out.println("中介找你看房");
    }
    public void  fare(){
        System.out.println("收中介费");
    }
    public void signContract(){
        System.out.println("签合同");
        fare();
    }
}