package com.gcc.hellIsland.domain;

public class Tasks {

    private boolean Tiger;
    private boolean Dragon;
    private boolean doorKey1;
    private boolean doorKey2;
    private boolean doorKey3;

    public Tasks() {
        this.Tiger = false;
        this.Dragon = false;
        this.doorKey1 = false;
        this.doorKey2 = false;
        this.doorKey3 =false;
    }

    //Boolean apo Creature

    public void tigerStatusStatus(boolean killed){

        if(killed == false){
            System.out.println("The Mighty Tiger is still Alive!");
        }
        else{
            System.out.println("The Mighty Tiger Has Been Slain");
        }

    }

    public void dragonStatusStatus(boolean killed){
        if(killed == false){
            System.out.println("The Mighty Dragon is still Alive!");
        }
        else{
            System.out.println("The Mighty Dragon Has Been Slain");
        }

    }

    //Boolean apo Door/Key

    public void doorKey1Status(boolean found){
        if(found == false){
            System.out.println("The 1st Key is still to be seen!");
        }
        else{
            System.out.println("The 1st Key has been found!");
        }

    }

    public void doorKey2Status(boolean found){
        if(found == false){
            System.out.println("The 2nd Key is still to be seen!");
        }
        else{
            System.out.println("The 2nd Key has been found!");
        }

    }

    public void doorKey3Status(boolean found){
        if(found == false){
            System.out.println("The 3rd Key is still to be seen!");
        }
        else{
            System.out.println("The 3rd Key has been found!");
        }

    }

    public void showTasks(){
        tigerStatusStatus(true);
        dragonStatusStatus(false);
        doorKey1Status(true);
        doorKey2Status(false);
        doorKey3Status(true);
    }
}
