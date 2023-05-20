package com.outils;

    public class Bateau extends Vehicule{
        public Bateau(){
            this.speed = "Noeud";
        }
        public void deplaceXY(int x, int y, int z);
        {
            System.out.println("Le bateau se deplace en X:" + x + " et en Y : " + y);
        }
}