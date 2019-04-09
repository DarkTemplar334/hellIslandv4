package com.gcc.hellIsland.UI;


import com.gcc.hellIsland.domain.Map;
import com.gcc.hellIsland.Parser.Parser;

public class DisplayMenu {

    private static Parser parser = new Parser();
    private static String decision="";
    private static Map map = new Map();

    public static void story(){
        String words ="||\tWhile returning home from your business trip by airplane,\t\t\t ||" +
                "\n||\ta terrible storm formed on your way and a thunderbolt hit your plane.||" +
                "\n||\tleaving you alone on a island.                                       ||" +
                "\n||                Can you escape your fate?                              ||";
        int i=0;
        System.out.println("\n\n===========================================================================");
        for(i=0;i<words.length();i++){
            System.out.print(words.charAt(i));
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
        System.out.println("\n===========================================================================");
        System.out.println("\n====To get to main commands at any point just leave it blank====");
        System.out.println("\n====Type the commands after :====");
        availableCmds();
    }

    //Starting Commands

    public static void availableCmds(){
        System.out.println("\n Available Commands:\n======================================");
        System.out.println("|| Move: " + map.possibleDirections());
        System.out.println("|| Info: " + "[location,tasks,menu]");
        System.out.println("|| Actions: "+ "[use,inventory,pickup,search]");
        System.out.println("|| Player Stats: "+"[stats]");
        System.out.println("======================================");
        parser.basicCommands();

    }


    public void playerStats(){
        System.out.println("Your stats are: ");
    }

    public void gotoMainMenu(){
        System.out.println("\n Action Commands:\n==============");
        System.out.println("|| Save Game ||");
        System.out.println("|| Load Game||");
        System.out.println("||   Exit   ||");
        System.out.println("==============");
        decision = parser.gameMenuInput();
        parser.ingameMainMenu(decision);

    }

    public void pathToMove(String direction){
        System.out.println("You move"+ direction+'.');
    }
    public void blockedPath(String direction){
        System.out.println("There is a door that is blocking your path in " +direction + " side");

    }

    public void showCurrentLocation(){
        System.out.println("\n###################################");
        System.out.println("You are at: " + map.nameOfCurrentRoom());
        System.out.println(map.descriptionOfCurrentRoom());
        System.out.println("###################################");
    }
}
