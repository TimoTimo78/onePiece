
import com.perso.*;

public class App {
    
    public static void main(String[] args) {
        
        // loffi pirate
        // jimbe pirate homme poisson

        Pirate p = new Pirate("Loffi");
        p.move(32, 42);
        HommePoisson hp = new HommePoisson("Jimbe");
        hp.move(45, 24);
        hp.swim(5);
    }
}