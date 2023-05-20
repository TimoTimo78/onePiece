package com.perso;

public class HommePoisson extends Pirate {
    public HommePoisson(String name)
    {
        super(name);
        this.posZ = 42;
    }

    public void swim(int x, int y, int z)
    {
        move(x, y);
        this.posZ = z;
        System.out.println("L'homme poisson se deplace en X:" + x + " et en Y : " + y + " et en Z :"  + this.posZ);
    }

    protected int posZ;
}