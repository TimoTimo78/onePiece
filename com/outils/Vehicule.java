package com.outils;

public class Waver extends Vehicule{
    public Waver()
    {
        this.speed = "Noeud";
    }

    public void deplaceXY(int x, int y)
    {
        System.out.println("Le Waver se deplace en X:" + x + " et en Y : " + y);
    }
}