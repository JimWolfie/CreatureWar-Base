import java.util.Random;
/**
 * creature class for war project. parent class to different race sublcasses
 * 
 * @author nicholas lindgren
 * @version 11/10/19
 */

public class Creature
{
   private int hp;
   private int strength;
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
      Random ran = new Random();
       return ran.nextInt(this.strength)+1;
    }
    
}
