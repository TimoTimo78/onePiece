
import com.perso.*;

public class App {
    
    public static void main(String[] args) {
        
        // loffi pirate
        // jimbe pirate homme poisson
        // danaSpG SuperGirl

        Pirate p = new Pirate("Loffi");
        p.move(32, 42);
        HommePoisson hp = new HommePoisson("Jimbe");
        hp.move(45, 24);
        hp.swim(5);
        SuperGirl sp = new SuperGirl("DanaSpG");
        sp.move(25, 40);
        sp.swim(10, 20, 40);
        sp.fly(24, 30, 25);
    }
}