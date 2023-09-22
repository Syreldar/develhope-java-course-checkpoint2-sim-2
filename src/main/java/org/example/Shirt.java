package org.example;

public class Shirt implements Washable
{
    private String color;
    private int cleanliness;

    public Shirt(String color)
    {
        this.color = color;
        this.cleanliness = 50;
    }

    public Shirt(String color, int cleanliness)
    {
        this.color = color;
        this.cleanliness = cleanliness;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getCleanliness()
    {
        return this.cleanliness;
    }

    public void setCleanliness(int cleanliness)
    {
        this.cleanliness = cleanliness;
    }

    @Override
    public void onWash()
    {
        this.cleanliness = Math.min(this.cleanliness + 20, 100);
    }

    @Override
    public boolean shouldBeWashed()
    {
        return this.cleanliness < 90;
    }

    @Override
    public String toString()
    {
        return String.format("%n[Color: %s, Cleanliness: %d]", this.color, this.cleanliness);
    }
}
