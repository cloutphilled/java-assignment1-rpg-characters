package character;

import static java.lang.Double.valueOf;

public class Mage extends CharacterClass {

    //private Damage intDPS;


    public Mage(String name, int level) {
        super(name, "Mage", level, 1, 1, 8);
        allowedArmorType.add("Cloth");
    }


    public double CalculateTotalAttributes(){
        double totalAttributes = 0;
        totalAttributes += this.intelligence;
        totalAttributes += getItems().get("Body").getMainStat();
        return totalAttributes;
    }

    @Override
    public int levelUp(int i) {
        super.level += i;
        super.strength += 1 * i;
        super.dexterity += 1 * i;
        super.intelligence += 5 * i;
        return super.level;
    }

    @Override
    public double attack() {
        double dmg = 1;
        dmg *= 1+(CalculateTotalAttributes() / 100);
        return dmg;
    }
}
