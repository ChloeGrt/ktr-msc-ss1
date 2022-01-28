import java.util.Objects;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        System.out.println( name + ": My name will go down in history !");
        this.life = 100;
        this.agility = 8;
        this.strength = 10;
        this.wit = 3;
    }

    public void attack(String attack){
        System.out.println(getName() + " : Rrrrrrrrr....");
        if(Objects.equals(attack, "hammer") || Objects.equals(attack, "sword")){
            System.out.println(getName() + " : I'll crush you with my " + attack + " !");
        }
    }
    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back like a bad boy.");
    }
}
