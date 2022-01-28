package exceptions;

import java.util.Objects;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, "Warrior");
        System.out.println( name + ": My name will go down in history !");
    }
    protected int life = 100;
    protected int agility = 8;
    protected int strength = 10;
    protected int wit = 3;

    public void attack(String weapon){
        System.out.println(getName() + " : Rrrrrrrrr....");
        if(Objects.equals(weapon, "hammer") || Objects.equals(weapon, "sword")){
            System.out.println(getName() + " : I'll crush you with my "+ weapon +" !");
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

    public void tryToAttack(String weapon) throws WeaponException {
        if (Objects.equals(weapon, "")){
            throw new WeaponException( getName()+ ": I refuse to fight with my bare hands.");
        }
        if (Objects.equals(weapon, "hammer") || Objects.equals(weapon, "sword")){
            this.attack(weapon);
        } else {
            throw new WeaponException(": A " + weapon + "?? What should I do with this ?!");
        }
    }
}
