package com.example.reidsspringboot.gof23.test;
/**
 * The triangle is the most balanced
 */


public class AClass extends AbstractA{
    public AClass(AbstractA ab) {
        super(ab);
    }
    @Override
    public boolean precess(Login login) {
        System.out.println("frequent");
        if (login.isFrequent()){
            AbstractA ab = getAb();
            if (ab==null){
                return true;
            }
            else {
                if (ab.precess(login)){
                    return true;
                }
                return false;
            }
        }
        return false;

    }
}