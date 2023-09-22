package org.example;

import java.util.HashSet;
import java.util.Set;

public class WashingMachine
{
    private int water;
    private int capacity;
    Set<Washable> loadedObjects = new HashSet<>();

    public WashingMachine(int water, int capacity)
    {
        this.water = water;
        this.capacity = capacity;
    }

    public int getWater()
    {
        return this.water;
    }

    public void setWater(int water)
    {
        this.water = water;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public Set<Washable> getLoadedObjects()
    {
        return this.loadedObjects;
    }

    public void setLoadedObjects(Set<Washable> loadedObjects)
    {
        this.loadedObjects = loadedObjects;
    }

    void load(Washable object)
    {
        this.loadedObjects.add(object);
    }

    Set<Washable> wash()
    {
        for (Washable item : this.loadedObjects) {
            item.onWash();
        }

        Set<Washable> washedItems = new HashSet<>(this.loadedObjects);
        this.loadedObjects = new HashSet<>();
        return washedItems;
    }
}
