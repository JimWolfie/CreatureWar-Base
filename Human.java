import java.util.concurrent.ThreadLocalRandom;
/**
 * A basic creature 
 *
 * @author NicholasLindgren
 * @version 11/10/19
 */
public class Human extends Creature
{
    /**
     * Constructor 
     */
    public Human()
    {
        super(ThreadLocalRandom.current().nextInt(10,31), ThreadLocalRandom.current().nextInt(5,19));
        
    }
    

    
}
