package TaskOne;

import java.util.ArrayList;

public class Dog {


    private ArrayList<Dog> offSpring;
    private String name;
    private Owner owner;
    private boolean isHungry;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String feedDog() {
        String s;
        if (isHungry) {
            s = name + " is fed ";
            isHungry = false;
        } else {
            s = name + "is not hungry";
        }
        return s;
    }

    public Dog(ArrayList<Dog> offSpring) {
        this.offSpring = offSpring;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(Dog d) {
        offSpring.add(d);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public String getDogName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

