package com.gcc.hellIsland.domain;

public class Door {

    //Inventory inv = new Inventory();

    private int doorId;
    private boolean locked;

    public Door() {
        locked = true;
    }

    public int getdoor() {
        return(doorId);
    }

    public void Lock(boolean key) {
        if(key==false) {
            locked = true;
        }
        else{
            locked = false;
        }
    }

//    public boolean Unlock() {
//        if(door == false ) {
//            locked = false;
//            unlock = true;
//        }
//        return(door = true);
//    }

    public void Show() {
        if (locked == true) {
            System.out.println("Cant go further, this door is locked!");
        }
        else {
            System.out.println("Lets go to new adventures!.... This door is open!");
        }
    }

//    public void CkeckDoor(String item) {
//        if(this.getdoor() == false){
//            if(inv.searchList(item).equals("Key1")) {
//                this.Lock(true);
//            }
//            else if(inv.searchList(item).equals("Key2")){
//                this.Lock(true);
//            }
//            else if(inv.searchList(item).equals("Key3")){
//                this.Lock(true);
//            }
//            else if(inv.searchList(item).equals("Key4")) {
//                this.Lock(true);
//            }
//            else { System.out.println("Υou do not have the key to unlock the door. Find the key!!"); }
//        }
//    }

    public int setDoorId(int doorId){
        return this.doorId= doorId;
    }
}
