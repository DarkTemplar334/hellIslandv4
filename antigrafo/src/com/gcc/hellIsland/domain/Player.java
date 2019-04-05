package com.gcc.hellIsland.domain;

public class Player extends Creature {


    private int life;

    @Override
    int setlife(int life) {
        return this.life = life;
    }

    @Override
    int getlife() {
        return(life);
    }

    @Override
    String getaction() {
        return null;
    }

    @Override
    void damage() {
        int lf;
        lf= this.getlife() - 5;
        this.setlife(lf);
    }

    @Override
    void level() {

    }
}