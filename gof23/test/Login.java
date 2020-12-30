package com.example.reidsspringboot.gof23.test;
/**
 * The triangle is the most balanced
 */


public class Login {
    private boolean password;
    private boolean frequent;

    private Login(boolean password, boolean frequent) {
        this.password = password;
        this.frequent = frequent;
    }

    static class Result{
        private boolean password;
        private boolean frequent;
        Result setPassword(boolean password) {
            this.password = password;
            return this;
        }
        Result setFrequent(boolean frequent) {
            this.frequent = frequent;
            return this;
        }
        public Login getLogin(){
            return new Login(password,frequent);
        }
    }
    public boolean isPassword(){
        return password;
    }
    public boolean isFrequent(){
        return frequent;
    }

}