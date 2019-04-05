package com.gcc.hellIsland.domain;

import java.util.Scanner;

public class parser {

    private String cmd;
    private interactionMenu intMenu = new interactionMenu();
    private static mainMenu mMenu = new mainMenu();
    private Movement movement = new Movement();
    private Tasks tasks = new Tasks();


    public void basicCommands(){

        System.out.println("\nOption: ");
        Scanner returnInput  = new Scanner(System.in);
        cmd = returnInput.nextLine();

        //Basic Available Commands

        if (cmd.equals("Move")) {
            intMenu.moveCommands();
        } else if (cmd.equals("Info")) {
            intMenu.infoCommands();
        } else if (cmd.equals("Actions")) {
            intMenu.actionCommands();

        } else if (cmd.equals("Stats")) {
            intMenu.statCommads();

        } else {
            System.out.println("Cant do that!");
        }
    }
    ////////////////////////////////////////////////////////////////////////
    //Secondary Commands!
    ////////////////////////////////////////////////////////////////////////

    public String input(){
        System.out.println("\nOption: ");
        Scanner returnInput  = new Scanner(System.in);
        cmd = returnInput.nextLine();
        return cmd;
    }

    //Moving Commands

    public void move(String decision){
        if(decision.equals("up")){
            movement.move(decision);
        }
        else if(decision.equals("down")){
            movement.move(decision);
        }
        else if(decision.equals("left")){
            movement.move(decision);
        }
        else if(decision.equals("right")){
            movement.move(decision);
        }
        else{
            System.out.println("Cant do that!");
        }
        System.out.println("You are at: " + movement.nameOfCurrentRoom());
    }

    public void info(String decision){
        if(decision.equals("Help")){
            System.out.println("Opening Map!");
            intMenu.help();
        }
        else if(decision.equals("Location")){
            System.out.println("I think i am at: "+movement.nameOfCurrentRoom());
        }
        else if(decision.equals("Tasks")){
            System.out.println("\nTasks Left/Completed!\n================================");
            tasks.showTasks();
            System.out.println("================================");
        }
        else if(decision.equals("Menu")){
            System.out.println("Showing Main Menu Commands!");
            intMenu.gotoMainMenu();

        }
        else{
            System.out.println("Cant do that!");
        }
    }

    public void action(String decision){
        if(decision.equals("Use")){
            System.out.println("Opening Map!");
            //use.item
        }
        else if(decision.equals("Inventory")){
            System.out.println("I think i am at: !");
            //display.items + amount
        }
        else if(decision.equals("Drop")){
            System.out.println("Tasks Left/Completed!");
            //drop.item

        }
        else if(decision.equals("Search")){
            System.out.println("Searching Current Room!");
            //Room + Inventory

        }
        else{
            System.out.println("Cant do that!");
        }
    }

//    public  void stats(String Decision){
//
//    }


    ////////////////////////////////////////////////////////////////////////
    //3rd Stage Commands!
    ////////////////////////////////////////////////////////////////////////

    public void ingameMainMenu(String decision){
        if(decision.equals("Save Game")){
            System.out.println("Saving...");
            mMenu.saveGame();
        }
        else if(decision.equals("Load Game")){
            System.out.println("Loading Previous Save.....");
            mMenu.loadGame();
        }
        else if(decision.equals("Exit")){
            System.out.println("Exiting Game.....");
            mMenu.exitGame();

        }
        else{
            System.out.println("Cant do that!");
        }
    }

    ////////////////////////////////////////////////////////////////////////
    //Extra Commands
    ////////////////////////////////////////////////////////////////////////


    public parser() {
        movement.setStartingRoom(movement.getStartingRoom());
    }

    public Movement getMovement(){
        return this.movement;
    }



}
