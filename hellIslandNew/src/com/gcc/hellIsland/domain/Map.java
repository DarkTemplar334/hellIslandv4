package com.gcc.hellIsland.domain;


import com.gcc.hellIsland.UI.DisplayMenu;

import java.util.Collection;

public class Map {

    private static Room currentRoom;
    private Room room1 = new Room("Mainland","The vast center of the island");
    private Room room2 = new Room("Plane","The debris of the airplane is still warm");
    private Room room3 = new Room("Sea","There is plenty of food in the sea!");
    private Room room4 = new Room("Forrest","Do you hear the strange noises too?!?");
    private Room room5 = new Room("Cave","The might dragon lies ahead!!");
    private DisplayMenu dispMenu = new DisplayMenu();



    public void move(String direction) {
        Room next = currentRoom.roomTo(direction);
        if(next != null){
            currentRoom = next;
            dispMenu.pathToMove(direction);
        }
        else {
            dispMenu.blockedPath(direction);
        }

    }
    public void setStartingRoom(Room startingRoom){
        this.currentRoom = startingRoom;
    }
    public String nameOfCurrentRoom(){
        return currentRoom.getName();
    }
    public String descriptionOfCurrentRoom(){
        return currentRoom.getDescription();
    }

    public Collection<String> possibleDirections(){
        return currentRoom.possibleDirections();
    }

    public Map(){
        room1.leftOf(room2);
        room2.rightOf(room1);
        room1.upOf(room3);
        room3.downOf(room1);
        room1.downOf(room4);
        room4.upOf(room1);
        room5.leftOf(room4);
        room4.rightOf(room5);

    }

    public Room getStartingRoom(){
        return this.room2;
    }

}
