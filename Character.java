import java.sql.SQLOutput;

public abstract class Character {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String rpgClass;

    public Character(String name, String rpgClass){
        this.name = name;
        this.rpgClass = rpgClass;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRpgClass() {
        return rpgClass;
    }
    public void attack(String attack){
        System.out.println( "["+getName()+"] : Rrrrrrrrr....");
    }
}
