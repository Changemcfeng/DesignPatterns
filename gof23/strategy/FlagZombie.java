package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */


public class FlagZombie extends Zombie{
    public FlagZombie(Moveable move, Attackable attack) {
        super(move, attack);
    }

    public FlagZombie() {
        super(new StepToStep(),new HitFlag());
    }

    @Override
    void display() {
        System.out.println("我是旗手僵尸");
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