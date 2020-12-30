package com.example.reidsspringboot.gof23.test;
/**
 * The triangle is the most balanced
 */

/**
 * @program: reids-springboot
 * @Auther: Mcfeng
 * @Date: 2020/12/6 09:55
 * @Description:
 */
public class BClass extends AbstractA {
    public BClass(AbstractA ab) {
        super(ab);
    }

    @Override
    public boolean precess(Login login) {
        System.out.println("password");
        if (login.isPassword()){
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