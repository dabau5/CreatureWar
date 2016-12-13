
/**
 * Abstract class Creature - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Creature
{
    private int str;
    private int max_hp;
    private int hp;
    
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    public Creature (int str, int hp) {
        this.str = str;
        this.hp=hp;
        max_hp = hp;
    }
    
    public String getHP()
    {
        String hpHolder = "" + hp;
        return hpHolder;
    }
    
    public int damage(){
        return Randomizer.nextInt(str) + 1;
    }
    
    public boolean isAlive() {
        return hp > 0;
    }
    
    public boolean isDead() {
        return !isAlive();
    }
    
    public void takeDamage(int damage) {
        hp -= damage;
    }
    
}
