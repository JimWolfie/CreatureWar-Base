import java.util.ArrayList;
/**
 * pits creatures vs each other
 *
 * @author NicholasLindgren
 * @version 11/10/19
 */
public class War
{
    public ArrayList<Creature> army1;
    public ArrayList<Creature> army2;
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        army2= new ArrayList<Creature>();
        army1= new ArrayList<Creature>();
        this.set();
    }
    /**
     * set
     * adds army sample to array list
     */
    private void set()
    {
        army1.add(new Human());
        army1.add(new Elf());
        army1.add(new Creature());
        army2.add(new Demon());
        army2.add(new CyberDemon());
        army2.add(new Balrog());
        
    }
    public void fight()
    {
        int a =0; 
        int b =0;
        int q = army1.size();
        int p = army2.size();
        while(army1.get(a).isAlive() && army2.get(b).isAlive()){
        army1.get(a).takeWound(army2.get(b).damage());
        army2.get(b).takeWound(army1.get(a).damage());
        if (!army1.get(a).isAlive())
        {
            a++;
        }
        if (!army2.get(b).isAlive())
        {
            b++;
        }
        //check if army is dead
        if (a>q && b>p) //both
        {
            System.out.println("both army Died");
            return;
        }else if(a>q) //only a
        {
            System.out.println("army a Died");
            return;
        }else if(b>p)//only b
        {
            System.out.println("army b Died");
            return;
        }
    }
        
    }
}
