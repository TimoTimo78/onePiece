
import com.perso.*;
import com.outils.*;

public class App {
    
    public static void main(String[] args) {
        
//         // loffi pirate
//         // jimbe pirate homme poisson
//         // danaSpG SuperGirl

//         // Pirate p = new Pirate("Loffi");
//         // p.move(32, 42);
//         // HommePoisson hp = new HommePoisson("Jimbe");
//         // hp.move(45, 24);
//         // hp.swim(5, 15, 25);
//         // SuperGirl sp = new SuperGirl("DanaSpG");
//         // sp.move(25, 40);
//         // sp.swim(10, 20, 40);
//         // sp.fly(24, 30, 25);
//         // Phoenix ph = new Phoenix("Marco");
//         // ph.fly(20, 40, 35);
//         // Combattant c = new Combattant();
//         // System.out.println(c.kezako());
            Chalet ch = new Chalet();
            System.out.println(ch.getNbrPieces());
            ch.setNbrPieces(nbr:4);
            System.out.println(ch.get());

    }
}