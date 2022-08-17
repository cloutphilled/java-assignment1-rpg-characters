package character;

public class Ranger extends CharacterClass{
    public Ranger() {
    }

    public Ranger(String name, int level) {
        super(name, "Ranger", level, 1, 7, 1);
        allowedArmorType.add("Leather");
        allowedArmorType.add("Mail");
        allowedWeaponType.add("Bow");
    }

    public double CalculateTotalAttributes(){
        double totalAttributes = 0;
        totalAttributes += this.intelligence;
        totalAttributes += getItems().get("Body").getMainStat();
        return totalAttributes;
    }
    @Override
    public double attack() {
        double dmg = 1;
        dmg *= 1+(CalculateTotalAttributes() / 100);
        return dmg;
    }


    @Override
    public int levelUp(int i) {
        super.level += i;
        super.strength += 1;
        super.dexterity += 5;
        super.intelligence += 1;
        return super.level;
    }
}
