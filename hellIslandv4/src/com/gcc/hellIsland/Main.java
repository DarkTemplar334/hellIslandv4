package com.gcc.hellIsland;

import com.gcc.hellIsland.domain.interactionMenu;
import com.gcc.hellIsland.domain.mainMenu;

public class Main {

    private static mainMenu mMenu = new mainMenu();
    private static interactionMenu interMenu = new interactionMenu();
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
