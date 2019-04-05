package com.gcc.hellIsland.domain;

public class Item
{
    private String itemName;
    private int lifePoints;
    private boolean onList;
    private boolean pickable;
    private boolean drinkable;
    private boolean eatble;


    public Item(String itemName,int lifePoints)
    {
        this.itemName = itemName;
        this.lifePoints = lifePoints;
        this.onList = true;
        this.pickable = true;
        this.drinkable = true;
        this.eatble = true;
    }

    public boolean isEatble() {
        return eatble;
    }

    public void setEatble(boolean eatble) {
        this.eatble = eatble;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public boolean isOnList() {
        return onList;
    }

    public void setOnList(boolean ownIt) { this.onList = ownIt;
    }

    public boolean isPickable() {
        return pickable;
    }

    public boolean isDrinkable() {
        return drinkable;
    }

    public void setDrinkable(boolean drinkable) {
        this.drinkable = drinkable;
    }

    public void setPickable(boolean pickable)
    {
        this.pickable = pickable;
    }
}
