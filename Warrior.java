public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        System.out.println( name + ": My name will go down in history !");
    }
    protected int life = 100;
    protected int agility = 8;
    protected int strength = 10;
    protected int wit = 3;

    public void attack(String attack){
        System.out.println(getName()+" : Rrrrrrrrr....");
        if(attack =="hammer" || attack =="sword"){
            System.out.println(getName()+" : I'll crush you with my "+ attack +" !");
        }
    }
}
