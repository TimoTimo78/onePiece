package com.perso;
/*
 * - Une classe abstraite:
 * - doit avoir au minimum une methode abstraite
 * - n'a pas de getter et de setter
 * - obliges ses enfants à utiliser implementer
 */
abstract public class EtreVivant {
    protected String race;

    public String kezako;
    {
        return race;
    }
    abstract public void respirer();
}