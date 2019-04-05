package com.gcc.hellIsland.domain;


import java.util.Collection;

public class Movement{

    private Room currentRoom;
    private Room room1 = new Room("Mainland");
    private Room room2 = new Room("Plane");
    private Room room3 = new Room("Sea");
    private Room room4 = new Room("Forrest");
    private Room room5 = new Room("Cave");




    public void move(String direction) {
        Room next = currentRoom.roomTo(direction);
        if(next != null){
            currentRoom = next;
            System.out.println("You move "+ direction+'.');
        }
        else {
            System.out.println("There is a door that block is blocking your path in " +direction + " side");
        }

    }
    public void setStartingRoom(Room startingRoom){
        this.currentRoom = startingRoom;
    }
    public String nameOfCurrentRoom(){
        return currentRoom.getName();
    }

    public Collection<String> possibleDirections(){
        return currentRoom.possibleDirections();
    }

    public Movement(){
        room1.leftOf(room2);  //room1 = Plane
        room2.rightOf(room1); //room2= MainLand
        room1.upOf(room3);
        room3.downOf(room1); //room3=sea
        room1.downOf(room4);
        room4.upOf(room1).hasDoor(1);//room4=forrest
        room5.leftOf(room4);//room5=cave
        room4.rightOf(room5);

    }

    public Room getStartingRoom(){
        return this.room2;
    }

}
