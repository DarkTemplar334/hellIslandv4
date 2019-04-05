package com.gcc.hellIsland.domain;

import java.util.Scanner;

public class Tiger extends Creature {

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
    void damage() {
        int lf;
        if(this.getaction().equals("firewood")) {
            lf = this.getlife() - 15;
            this.setlife(lf);
        }
        else if(this.getaction().equals("wood")) {
            lf = this.getlife() - 5;
            this.setlife(lf);
        }
    }

    @Override
    void level() {

    }

    @Override
    String getaction() {
        Scanner  act = new Scanner(System.in);

        System.out.println("Enter action for Tiger");
        String action = act.nextLine();
        //System.out.println("Action is: " + action);
        return action;
    }

}