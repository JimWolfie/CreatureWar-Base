import java.util.concurrent.ThreadLocalRandom;

/**
 * cyber demon class extends demon 
 *
 * @author NicholasLindgren
 * @version 11/10/19
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(ThreadLocalRandom.current().nextInt(25,101), ThreadLocalRandom.current().nextInt(20,41));
    }

    
}
