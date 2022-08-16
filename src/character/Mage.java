package character;

import static java.lang.Double.valueOf;

public class Mage extends CharacterClass {

    //private Damage intDPS;


    public Mage(String name, int level) {
        super(name, "Mage", level, 1, 1, 8);
        //this.intDPS = intDPS;
    }




    @Override
    public int defend(){
        return 0;
    }


    @Override
    public void levelUp(int i) {
        super.levelUp(i);
        super.strength += 1 * i;
        super.dexterity += 1 * i;
        super.intelligence += 5 * i;
    }

    @Override
    public double attack() {
        double dmg = 1;
        System.out.println(super.intelligence);
        dmg *= 1+((double)super.intelligence / 100);
        return dmg;
    }
}
