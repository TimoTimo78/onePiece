package com.outils;

public class Bateau extends Vehicule {
    private String posX;
    private String posY;

    public Bateau(int i) {
        this.speed = "Noeud";
    }

    @Override
    public void deplaceXY(int x, int y) {
        System.out.println("Le Bateau se deplace en X : " + this.posX + " et en Y : " + this.posY);
    }
}