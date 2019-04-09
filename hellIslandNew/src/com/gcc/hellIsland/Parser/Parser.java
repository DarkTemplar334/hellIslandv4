package com.gcc.hellIsland.Parser;

import com.gcc.hellIsland.UI.DisplayMenu;
import com.gcc.hellIsland.UI.MainMenu;
import com.gcc.hellIsland.domain.Map;
import com.gcc.hellIsland.domain.Tasks;

import java.util.Scanner;

public class Parser {

    private String cmd;
    private DisplayMenu dispMenu = new DisplayMenu();
    private static MainMenu mMenu = new MainMenu();
    private Map map = new Map();
    private Tasks tasks = new Tasks();


    ///////////////////////////////////
    //Basic Game Loop Commands
    //////////////////////////////////
    public void basicCommands() {

        System.out.println("\nOption: ");
        Scanner returnInput = new Scanner(System.in);
        cmd = returnInput.nextLine();

        //Basic Available Commands

        if (cmd.equals("up") || cmd.equals("down") || cmd.equals("left") || cmd.equals("right")) {
            map.move(cmd);
            dispMenu.showCurrentLocation();
        }
        else if (cmd.equals("location") || cmd.equals("tasks") || cmd.equals("menu")) {
            info(cmd);
        }
        else if (cmd.equals("use") || cmd.equals("inventory") || cmd.equals("pickup") ||cmd.equals("search")) {
           actions(cmd);
        }
        else if (cmd.equals("stats")) {
            dispMenu.playerStats();
        }
        else {
            System.out.println("Cant do that!");
        }
    }

    public void info(String decision) {
        if (decision.equals("location")) {
            System.out.println("I think i am at: " + map.nameOfCurrentRoom());
        } else if (decision.equals("tasks")) {
            System.out.println("\nTasks Left/Completed!\n================================");
            tasks.showTasks();
            System.out.println("================================");
        } else if (decision.equals("menu")) {
            System.out.println("Showing Main Menu Commands!");
            dispMenu.gotoMainMenu();

        } else {
            System.out.println("Cant do that!");
        }
    }

    public void actions(String decision) {
        if (decision.equals("use")) {
            System.out.println("Using Item!");
            //use.item
        } else if (decision.equals("inventory")) {
            System.out.println("Opening Inventory: !");
            //display.items + amount
        } else if (decision.equals("pickup")) {
            System.out.println("picking up item!");
            //drop.item

        } else if (decision.equals("search")) {
            System.out.println("Searching Current Room!");
            //Room + Inventory

        } else {
            System.out.println("Cant do that!");
        }
    }


    ////////////////////////////////////
    ////Ingame Menu Interaction
    ///////////////////////////////////
    public String gameMenuInput() {
        System.out.println("\nOption: ");
        Scanner returnInput = new Scanner(System.in);
        cmd = returnInput.nextLine();
        return cmd;
    }

    public void ingameMainMenu(String decision) {
        if (decision.equals("Save Game")) {
            System.out.println("Saving...");
            mMenu.saveGame();
        } else if (decision.equals("Load Game")) {
            System.out.println("Loading Previous Save.....");
            mMenu.loadGame();
        } else if (decision.equals("Exit")) {
            System.out.println("Exiting Game.....");
            mMenu.exitGame();

        } else {
            System.out.println("Cant do that!");
        }
    }

    ////////////////////////////////////////////////////////////////////////
    //Extra Commands
    ////////////////////////////////////////////////////////////////////////


    public Parser() {
        map.setStartingRoom(map.getStartingRoom());
    }


}
