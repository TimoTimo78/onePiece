package com.perso;

/*
 * Une classe abstraite en Java est une classe qui ne peut pas être instanciée directement,
 *  c'est-à-dire qu'elle ne peut pas être utilisée pour créer des objets. 
 * Elle sert de modèle pour d'autres classes qui héritent d'elle. 
 * Une classe abstraite peut contenir des méthodes abstraites (non implémentées) 
 * ainsi que des méthodes concrètes (implémentées). 
 */

public abstract class EtreVivant {
    private String firstName;
    private int age;
    
    public EtreVivant(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    
    public abstract void seNourrir();
    
    public void respirer() {
        System.out.println("Je respire de l'oxygène.");
    }
    
    public void dormir() {
        System.out.println("Je dors pour me reposer.");
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public int getAge() {
        return age;
    }
}