package com.gcc.hellIsland.domain;



public class interactionMenu {

    private static parser input = new parser();
    private static String decision="";

    public static void story(){
        String words ="||\tWhile returning home from your business trip by airplane,\t\t\t ||" +
                "\n||\ta terrible storm formed on your way and a thunderbolt hit your plane.||" +
                "\n||\tleaving you alone on a island.                                       ||" +
                "\n||                Can you escape your fate?                              ||";
        int i=0;
        System.out.println("\n\n===========================================================================");
        for(i=0;i<words.length();i++){
            System.out.print(words.charAt(i));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\n===========================================================================");
        System.out.println("\n====To get to main commands at any point just leave it blank====");
        availableCmds();
    }

    //Starting Commands

    public static void availableCmds(){
        System.out.println("\n Available Commands:\n====================");
        System.out.println("|| Move\t\tInfo  ||\n|| Actions\tStats ||");
        System.out.println("====================");
        input.basicCommands();

    }

    ////////////////////////////////////////
    //Secondary Menu Commands
    ////////////////////////////////////////

    public void moveCommands(){
        System.out.println("\n Available Directions:\n=======================");
        System.out.println(input.getMovement().possibleDirections());
        //System.out.println("|| go up\tgo down  ||\n|| go left\tgo right ||");
        System.out.println("=======================");
        decision = input.input();
        input.move(decision);
    }

    public void infoCommands(){
        System.out.println("\n Info Commands:\n====================");
        System.out.println("|| Help\tLocation ||\n|| Tasks\tMenu ||");
        System.out.println("====================");
        decision = input.input();
        input.info(decision);
    }

    public void actionCommands(){
        System.out.println("\n Action Commands:\n====================");
        System.out.println("|| Use\tInventory ||\n|| Drop\tSearch \t  ||");
        System.out.println("====================");
        decision = input.input();
        input.action(decision);
    }

    public void statCommads(){
        System.out.println("Dont have much to show but your stats are: ");
        //////
        //stats/
        /////
    }

    ////////////////////////////////////////
    //3rd Stage Commands!
    ////////////////////////////////////////

    public void gotoMainMenu(){
        System.out.println("\n Action Commands:\n==============");
        System.out.println("|| Save Game ||");
        System.out.println("|| Load Game||");
        System.out.println("||   Exit   ||");
        System.out.println("==============");
        decision = input.input();
        input.ingameMainMenu(decision);

    }

    public void help(){
        System.out.println("\nHow to Use: \n ===========");
        System.out.println("Use: ");
        System.out.println("Drop: ");
    }


}
