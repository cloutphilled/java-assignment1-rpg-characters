package character;

public class Rogue extends CharacterClass{
    public Rogue() {
    }

    public Rogue(String name, int level) {
        super(name, "Rogue", level, 2, 6, 1);
        allowedArmorType.add("Leather");
        allowedArmorType.add("Mail");
        allowedWeaponType.add("Dagger");
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
        totalAttributes += this.dexterity;
        totalAttributes += getItems().get("Body").getMainStat();
        return totalAttributes;
    }

    @Override
    public int levelUp(int i) {
        super.level += i;
        super.strength += 2 * i;
        super.dexterity += 4 * i;
        super.intelligence += 1 * i;
        return super.level;
    }
}
