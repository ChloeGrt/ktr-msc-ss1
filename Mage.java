public class Mage extends Character{
    public Mage(String name) {
        super(name, "Mage");
        System.out.println( name + ": May the gods be with me.");
    }
    protected int life = 70;
    protected int agility = 10;
    protected int strength = 3;
    protected int wit = 10;

    public void attack(String attack){
        System.out.println(getName()+": Rrrrrrrrr....");
        if(attack =="magic" || attack =="wand"){
            System.out.println( getName()+" : Feel the power of my "+ attack +"!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right like furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left like furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward like furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back like furtively.");
    }
}
