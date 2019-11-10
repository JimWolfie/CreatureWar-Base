import java.util.concurrent.ThreadLocalRandom;
/**
 * creature class for war project. parent class to different race sublcasses
 * 
 * @author nicholas lindgren
 * @version 11/10/19
 */

public class Creature
{
   protected int hp;
   protected int strength;
   
   /**
    * constructor 
    */
   public Creature()
   {
       
       this.hp=10;
       this.strength =10;
       
   }
   /**
    * Constructor 
    * @param hp
    * @param strength 
    */
   public Creature(int hp, int strength)
   {
       this.hp = hp; 
       this.strength = strength;
    }
   /**
    * damage
    * @return - a random number between 1 and strength
    */ 
   public int damage()
   {
      
       return ThreadLocalRandom.current().nextInt(this.strength)+1;
   }
   public boolean isAlive()
   {
       if(hp >0)
       {
           return true;
       }
       return false;
   }
    
}
