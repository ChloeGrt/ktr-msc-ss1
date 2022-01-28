import java.util.Objects;

public class Mage extends Character{
    public Mage(String name) {
        super(name, "Mage");
        System.out.println( name + ": May the gods be with me.");
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
    }

    public void attack(String weapon){
        System.out.println(getName() + ": Rrrrrrrrr....");
        if(Objects.equals(weapon, "magic") || Objects.equals(weapon, "wand")){
            System.out.println( getName() + " : Feel the power of my " + weapon + "!");
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
