package exceptions;

import java.util.Objects;

public class Mage extends Character {
    public Mage(String name) {
        super(name, "Mage");
        System.out.println( name + ": May the gods be with me.");
    }
    protected int life = 70;
    protected int agility = 10;
    protected int strength = 3;
    protected int wit = 10;

    public void attack(String weapon){
        System.out.println(getName()+": Rrrrrrrrr....");
        if(weapon =="magic" || weapon =="wand"){
            System.out.println( getName()+" : Feel the power of my "+ weapon +"!");
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

    public void tryToAttack(String weapon) throws WeaponException {
        if(Objects.equals(weapon, "magic") || Objects.equals(weapon, "wand")){
            this.attack(weapon);
        }
        if(Objects.equals(weapon, "")){
            throw new WeaponException( getName()+ ": I refuse to fight with my bare hands.");
        }
        else{
            throw new WeaponException( getName()+ ": A "+weapon+"?? What should I do with this ?!");
        }
    }
}
