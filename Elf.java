import java.util.concurrent.ThreadLocalRandom;
/**
 * magical creature 
 *
 * @author Lindgren
 * @version 11/10/19
 */
public class Elf extends Creature
{


    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
       super(ThreadLocalRandom.current().nextInt(8,25), ThreadLocalRandom.current().nextInt(5,19));
        
    }
    /**
     * Damage 
     * @override super
     */
    public int damage ()
    {
        if(ThreadLocalRandom.current().nextInt(0, 10) == 1)
        {
            return super.damage() *2 ;
            
        }
        return super.damage();
    }

    
}
