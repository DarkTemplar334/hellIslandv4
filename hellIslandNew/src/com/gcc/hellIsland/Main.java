package com.gcc.hellIsland;

import com.gcc.hellIsland.UI.DisplayMenu;
import com.gcc.hellIsland.UI.MainMenu;

public class Main {

    private static MainMenu mMenu = new MainMenu();
    private static DisplayMenu interMenu = new DisplayMenu();
    private static boolean gameOver = true;
    private static String decision;

    public static void main(String[] args) {

        decision=mMenu.gameMenu();
        //Menu validation
        while(gameOver) {
            if (decision.equals("New Game")){
                gameOver = false;
                System.out.println("New Game Starting!!");
                interMenu.story();
            }
            else if(decision.equals("Load Game")){
                mMenu.loadGame();
                gameOver = false;
            }
            else if(decision.equals("Exit")){
                mMenu.exitGame();
            }
            else {
                System.out.println("Wrong Option, chose again!");
                decision = mMenu.gameMenu();
            }
        }

        //game Loop
        while(gameOver==false){

            System.out.println("\n====To get to main commands at any point just leave it blank====");
            interMenu.availableCmds();
        }

    }
}
