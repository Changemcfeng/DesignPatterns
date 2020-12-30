package com.example.reidsspringboot.gof23.chainofresponsible;
/**
 * The triangle is the most balanced
 */


public class FrequentHandler extends Handler {

    public FrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("访问频率");
        if (request.isFrequent()){
            Handler next = getNext();
            if (null==next) {
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