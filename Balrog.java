import java.util.concurrent.ThreadLocalRandom;

/**
 * extends demon
 *
 * @author NicholasLindgren
 * @version 11/10/19
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
       super(ThreadLocalRandom.current().nextInt(80,201), ThreadLocalRandom.current().nextInt(50,101));
    }
    /**
     * damage 
     * @return - 2 random numbers
     */
    public int damage()
    {
        
        return super.damage() + super.damage();
    }

}
