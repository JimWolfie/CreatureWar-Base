import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

    
}
