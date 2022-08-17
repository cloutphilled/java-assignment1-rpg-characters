package Equipment;

import character.CharacterClass;

public class Armor extends Equipment{


    public Armor(String itemName, int reqLevel, String itemType, double mainStat) {
        super(itemName, reqLevel, itemType, "Body", 0, 0, 0, mainStat);
    }


    public double mainStat(double mainStat){
        return mainStat;
    }

    @Override
    public void getDetails() {
        CharacterClass.printHeading("ITEM INFO");
        System.out.println("Name: " + getItemName());
        System.out.println("Slot: " + getItemSlot());
        System.out.println("Type: " + getItemType());
        System.out.println("** ITEM STATS **");
        System.out.println("Required level: " + getReqLevel());
        System.out.println("Main stat: " + getMainStat());
        System.out.println();
    }
}
