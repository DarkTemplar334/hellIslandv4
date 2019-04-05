package com.gcc.hellIsland.domain;

import java.util.*;
public class Inventory {

    List<Item> list = new ArrayList<>();

    public void addList(Item Name)
    {
        this.list.add(Name);
    }

    public void remove(Item item)
    {
        this.list.remove(item);
    }

    public List<Item> getList() {
        return list;
    }

    public void removeLastItem() {
        int i=list.size();
        this.list.remove(i-1);
    }

    public boolean pickable()
    {
        return true;
    }

    public boolean ifFullInventory()
    {
        return list != null && list.size() >=10;
    }

    public String getListItem()
    {
        return this.list.toString();
    }

    public String searchList(String item) {
        if(list.contains(item))
        {
            return item;
        }
        else
        {
            return item;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventory)) return false;
        Inventory that = (Inventory) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}