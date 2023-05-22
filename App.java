// import com.perso.*;
import com.outils.*;

public class App{
    public static void main(String[] args)
    {
    //    Pirate p = new Pirate("Luffi");
    //    p.move(32, 47);
    //    HommePoisson hp = new HommePoisson("Jimbe");
    //    hp.move(42, 35);
    //    hp.swim(10);
    //    SuperBoy sb = new SuperBoy("spb", "Hero", 20);
    //    sb.fly(20, 10, 40);
    //    Phenix ph = new Phenix("Marco");
    //    ph.fly(4, 80, 30);
    //    sb.respirer();
    //    sb.dormir();
    //    sb.seReproduire();
    //    Bateau bt = new Bateau(2);
    //    bt.deplaceXY(5, 10);
        Chalet ch = new Chalet();
        System.out.println(ch.getNbrPieces());
        ch.setNbrPieces(4);
        System.out.println(ch.getNbrPieces());
    }
}