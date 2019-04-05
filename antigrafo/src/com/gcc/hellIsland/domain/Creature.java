package com.gcc.hellIsland.domain;


abstract class Creature {

    abstract int setlife(int life);
    abstract int getlife();
    abstract String getaction();
    abstract void damage();
    abstract void level();

}
