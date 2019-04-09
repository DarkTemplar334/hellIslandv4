package com.gcc.hellIsland.UI;


import com.gcc.hellIsland.Parser.Parser;

public class MainMenu {

    private Parser input = new Parser();
    private String decision;


    public String gameMenu(){
        System.out.println("\n====================");
        System.out.println("\t New Game");
        System.out.println("\t Load Game");
        System.out.println("\t Exit");
        System.out.println("====================\n\n");
        System.out.println("\n====Type Command as you see them!!====");
        decision = input.gameMenuInput();
        return decision;
    }

    public void loadGame(){
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
