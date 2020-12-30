package com.example.reidsspringboot.gof23.chainofresponsible;
/**
 * The triangle is the most balanced
 */


public class Request {
    private boolean longgeon;
    private boolean frequenton;
    private boolean isPermit;
    private boolean containSensitiveWords;
    private String responsible;

    static class RequestBuilder{
        private boolean longgeon;
        private boolean frequenton;
        private boolean isPermit;
        private boolean containSensitiveWords;
        RequestBuilder loggedOn(boolean longgeon){
            this.longgeon=longgeon;
            return this;
        }
        RequestBuilder frequentOk(boolean frequent){
            this.frequenton=frequent;
            return this;
        }
        RequestBuilder isPermits(boolean isPermit1){
            this.isPermit=isPermit1;
            return this;
        }
        RequestBuilder containSensitiveWords(boolean words){
            this.containSensitiveWords=words;
            return this;
        }
        public  Request build(){
            return new Request(longgeon,frequenton,isPermit,containSensitiveWords);
        }
    }
    private Request(boolean longgeon, boolean frequenton, boolean isPermit, boolean containSensitiveWords) {
        this.longgeon = longgeon;
        this.frequenton = frequenton;
        this.isPermit = isPermit;
        this.containSensitiveWords = containSensitiveWords;
    }

    public boolean isLonggeon(){
        return longgeon;
    }
    public boolean isFrequent(){
        return frequenton;
    }
    public boolean isPermit(){
        return isPermit;
    }
    public boolean containSensitiveWords(){
        return containSensitiveWords;
    }
}