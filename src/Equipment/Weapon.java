package Equipment;

import character.CharacterClass;

public class Weapon extends Equipment {


    public Weapon(String itemName, int reqLevel, String itemType, double baseDamage, double attacksPerSecond) {
        super(itemName, reqLevel, itemType, "Hands", baseDamage, attacksPerSecond, 0, 0);

    }


    @Override
    public void getDetails() {
        CharacterClass.printHeading("ITEM INFO");
        System.out.println("Name: " + getItemName());
        System.out.println("Slot: " + getItemSlot());
        System.out.println("Type: " + getItemType());
        System.out.println("** ITEM STATS **");
        System.out.println("Required level: " + getReqLevel());
        System.out.println("Base damage: " + getBaseDamage());
        System.out.println("Attacks per second: " + getAttacksPerSecond());
        System.out.println("DPS: " + getDps());
        System.out.println();
    }
}
