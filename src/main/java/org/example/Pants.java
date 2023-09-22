package org.example;

import java.util.Random;

public class Pants implements Washable
{
    private String material;
    private int cleanliness;
    private boolean isRipped;

    public Pants(String material)
    {
        this.material = material;
        this.cleanliness = 50;
        this.isRipped = false;
    }

    public Pants(String material, int cleanliness, boolean isRipped)
    {
        this.material = material;
        this.cleanliness = cleanliness;
        this.isRipped = isRipped;
    }

    public Pants(String material, boolean isRipped)
    {
        this.material = material;
        this.cleanliness = 50;
        this.isRipped = isRipped;
    }

    public String getMaterial()
    {
        return this.material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public int getCleanliness()
    {
        return this.cleanliness;
    }

    public void setCleanliness(int cleanliness)
    {
        this.cleanliness = cleanliness;
    }

    public boolean isRipped()
    {
        return this.isRipped;
    }

    public void setRipped(boolean ripped)
    {
        this.isRipped = ripped;
    }

    @Override
    public boolean shouldBeWashed()
    {
        return this.cleanliness < 90 && !this.isRipped;
    }

    @Override
    public void onWash()
    {
        this.cleanliness = Math.min(this.cleanliness + 20, 100);
        this.isRipped = this.isRipped || new Random().nextBoolean();
    }

    @Override
    public String toString()
    {
        return String.format("%n[Material: %s, Cleanliness: %d, Ripped: %b]", this.material, this.cleanliness, this.isRipped);
    }
}
