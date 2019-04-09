package com.gcc.hellIsland.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Room{


    private String name;
    private String description;
    private final Map<String, Room> possibleDirections = new HashMap<>();
    //Something like inventory here

    public Room(String name,String description){
        this.name = name;
        this.description = description;
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

    public String getDescription(){
        return description;
    }





}
