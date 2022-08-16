package Equipment;

public class Weapon extends Equipment {


    public Weapon(String itemName, int reqLevel, int itemLevel, String itemType, String itemSlot, boolean isWeapon, boolean isArmor, double baseDamage, double attacksPerSecond) {
        super(itemName, reqLevel, itemLevel, itemType, itemSlot, isWeapon, isArmor, baseDamage, attacksPerSecond);
    }

    public double dps(){
        double dps;
        dps = super.getBaseDamage() * super.getAttacksPerSecond();
        return dps;
    }
}
