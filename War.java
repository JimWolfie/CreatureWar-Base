import java.util.ArrayList;
/**
 * pits creatures vs each other
 *
 * @author NicholasLindgren
 * @version 11/10/19
 */
public class War
{
    public ArrayList army1;
    public ArrayList army2;
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        army2= new ArrayList<Object>();
        army1= new ArrayList<Object>();
        this.set();
    }
    private void set()
    {
        army1.add(new Human());
        army1.add(new Elf());
        army1.add(new Creature());
        army2.add(new Demon());
        army2.add(new CyberDemon());
        army2.add(new Balrog());
        
    }
    
}
