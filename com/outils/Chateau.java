package com.outils;

public class Chateau extends Construction {
    public Chateau()
    {
        this.nbrPieces = 34;
    }
    public void materiaux(String mat)
    {
        System.out.println("Le chateau est construit" + mat);
    }
}