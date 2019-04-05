package com.gcc.hellIsland.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Room{


    private final String name;
    private final Map<String, Room> possibleDirections = new HashMap<>();
    private Door door = new Door();

    //Something like inventory here

    public Room(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Room rightOf(Room sideRoom){
        sideRoom.possibleDirections.put("right",this);
        return this;
    }

    public Room leftOf(Room sideRoom){
        sideRoom.possibleDirections.put("left",this);
        return this;
    }

    public Room upOf(Room sideRoom){
        sideRoom.possibleDirections.put("up",this);
        return this;
    }

    public Room downOf(Room sideRoom){
        sideRoom.possibleDirections.put("down",this);
        return this;
    }

    public Collection<String> possibleDirections(){
        return Collections.unmodifiableCollection(possibleDirections.keySet());
    }

    public Room roomTo(String direction){
        return possibleDirections.get(direction);
    }

//    public String location(){
//        return this.possibleDirections.get(getName()).toString();
//    }

    public void hasDoor(int doorId){
        door.setDoorId(doorId);
    }
}
