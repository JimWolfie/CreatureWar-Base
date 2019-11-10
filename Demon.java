import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
       super(10,10);
    }
    /**
     * constructor for demon
     * @param hp
     * @param strength 
     */
    public Demon(int hp, int strength)
    {
        super(hp, strength);
    }
    /**
     * damage 
     * @return - random number
     */
    public int damage()
    {
        if(ThreadLocalRandom.current().nextInt(0,100) >5)
        {
            return super.damage()+50;
        }
        return super.damage();
    }

}
