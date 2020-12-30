package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */


public class NormalZombie extends Zombie {
    public NormalZombie() {
        super(new StepToStep(),new Hit());
    }

    public NormalZombie(Moveable move, Attackable attack) {
        super(move, attack);
    }

    @Override
    void display() {
        System.out.println("普通僵尸");
    }

    @Override
    void move() {
       moveable.move();
    }

    @Override
    void attack() {
        attackable.attak();
    }
}