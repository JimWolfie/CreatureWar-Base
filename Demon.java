import java.util.concurrent.ThreadLocalRandom;
/**
 * Write a description of class Demon here.
 *
 * @author lindgren
 * @version 11/10/19
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
            return ThreadLocalRandom.current().nextInt(this.strength)+1+50;
        }
        return ThreadLocalRandom.current().nextInt(this.strength)+1;
    }

}
