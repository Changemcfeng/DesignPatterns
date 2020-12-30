package com.example.reidsspringboot.gof23.chainofresponsible;
/**
 * The triangle is the most balanced
 */


public class LoginHandler extends Handler {
    public LoginHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("登录验证");
        if (request.isLonggeon()){
            Handler next = getNext();
            if (next==null){
                return true;
            }
            if (!next.process(request)){
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
}