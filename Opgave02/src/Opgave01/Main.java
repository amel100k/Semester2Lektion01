package Opgave01;

public class Main {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Fofstelr",1);
        Weapon longsword = new Weapon("Longsword");
        barbarian.addWeapon(longsword);

        Spell Fireball = new Spell(150,Duration.INSTANTANEOUS);
        Spellcaster wizard = new Spellcaster("Orlemaex",1);

        Ranged shortbow = new Ranged("Shortbow",80);
        barbarian.addWeapon(shortbow);

        for (Weapon weapon : barbarian.getWeapons()) {
            weapon.getName();
        }

    }
}
