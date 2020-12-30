package com.example.reidsspringboot.gof23.strategy;
/**
 * The triangle is the most balanced
 */


public abstract class Zombie {
     Moveable moveable;
     Attackable attackable;
    abstract void display();
    abstract void move();
    abstract void attack();

    public Zombie(Moveable move, Attackable attack) {
        this.moveable = move;
        this.attackable = attack;
    }

    public Moveable getMove() {
        return moveable;
    }

    public void setMove(Moveable move) {
        this.moveable = move;
    }

    public Attackable getAttack() {
        return attackable;
    }

    public void setAttack(Attackable attack) {
        this.attackable = attack;
    }
}