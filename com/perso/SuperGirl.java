package com.perso;

public class SuperGirl extends HommePoisson {
    private int posZ;
    private int posX;
    private int posY;
    public SuperGirl(String name) {
        super(name);
        

    }
    public void move(int x, int y)
    {
        // this.posX = x;
        // this.posY = y;
        
        System.out.println("SuperGirl se déplace en X :" + this.posX + " et en Y : " + this.posY);
    }
    public void swim(int x, int y, int z)
    {
        // this.posX = x;
        // this.posY = y;
        // this.posZ = z;
        
        System.out.println("SuperGirl nage en X :" + this.posX + " et en Y : " + this.posY + " et en Z : " + this.posZ);
    }
    public void fly(int x, int y, int z)
    {
        this.posX = x;
        this.posY = y;
        this.posZ = z;

        System.out.println("SuperGirl vole en X :" + this.posX + " et en Y : " + this.posY + " et en Z : " + this.posZ);
    }
}