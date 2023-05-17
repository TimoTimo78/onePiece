package com.perso;
public class HommePoisson extends Pirate {
    public HommePoisson(String name)
    {
        super(name);
        this.posZ = 42;
    }
    // public void move(int x, int y)
    // {
    //     this.posX = x;
    //     this.posY = y;
    //     System.out.println("Le pirate se deplace en X:" + this.posX + " en Y : " + this.posY);
    // }

    public void swim(int z)
    {
        this.posZ = z;
        System.out.println("Le pirate se deplace en Z:"  + this.posZ);
    }

    private int posZ;
}