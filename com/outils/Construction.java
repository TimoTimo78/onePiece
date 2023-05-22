
package com.outils;

public abstract class Construction {
    protected int nbrPieces;
    public abstract void materiaux(String mat);
}



// package com.outils;

// public class Chalet extends Construction;
// {
//     public Chalet()
//     {
//         this.nbrPieces = 3;
//     }

//     public void setNbrPieces(int nbr)
//     {
//         this.nbrPieces += nbr;
//     }
//     public int getNbrPieces()
//     {
//         return nbrPieces;
//     }

//     public void materiaux(String mat)
//     {
//         System.out.println("Le chalet est construit en : " + mat);
//     }
// }