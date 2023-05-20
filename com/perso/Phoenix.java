package com.perso;

public final class Phoenix extends HommePoisson {
    public Phoenix (String name)
    {
        // this.name = name
        super(name);
    }
    
    public void fly(int x, int y, int z)
    {
        super.swim(x, y, z);
        System.out.println("Le Phoenix vole en X:" + x + " et en Y : " + y + " et en Z :"  + this.posZ);

    }
}