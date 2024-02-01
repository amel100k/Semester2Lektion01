package Opgave01;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name, level);
    }

    public void addWeapon(Weapon weapon){
        if (!weapons.contains(weapon)){
            weapons.add(weapon);
        }
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
