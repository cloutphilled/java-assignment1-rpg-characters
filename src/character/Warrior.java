package character;

public class Warrior extends CharacterClass{
    public Warrior() {

    }

    public Warrior(String name, int level) {
        super(name, "Warrior", level, 5, 2, 1);
        allowedArmorType.add("Mail");
        allowedArmorType.add("Plate");
        allowedWeaponType.add("Axe");
        allowedWeaponType.add("Hammer");
        allowedWeaponType.add("Sword");
    }

    @Override
    public double attack() {
        double dmg = 1;
        dmg *= 1+(CalculateTotalAttributes() / 100);
        return dmg;
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
        super.strength += 3 * i;
        super.dexterity += 2 * i;
        super.intelligence += 1 * i;
        return super.level;
    }
}
