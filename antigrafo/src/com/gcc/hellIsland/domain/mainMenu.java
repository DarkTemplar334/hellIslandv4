package com.gcc.hellIsland.domain;


public class mainMenu {

    private parser input = new parser();
    private String decision;


    public String gameMenu(){
        System.out.println("\n====================");
        System.out.println("\t New Game");
        System.out.println("\t Load Game");
        System.out.println("\t Exit");
        System.out.println("====================\n\n");
        decision = input.input();
        return decision;
    }

    public void loadGame(){

        //input Stream
        System.out.println("You've gone back a bit.....");

    }

    public void saveGame(){

        //output Stream
        System.out.println("Game Saved");

    }

    public void exitGame(){
        System.exit(0);

    }
}
