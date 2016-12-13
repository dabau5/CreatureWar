
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 50;
    private static final int MAX_DEMON_STR = 75;
    private static final int MIN_DEMON_STR = 25;

    /**
     * Constructor for objects of class DEMON
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP
        );
          
    }
    
    public Demon(int str, int hp) {
           super(str, hp);
    }
    
    public int damage() {
           int tempdamage;
           tempdamage = super.damage();
           
           if (Randomizer.nextInt(20)==0) {
               System.err.println("DEMONIC STRENGTH!");
               tempdamage +=50;
            }
           
            return tempdamage;
    }
}
