package Equipment;
import character.*;

public abstract class Equipment {
    private String itemName;
    private int reqLevel;
    private String itemSlot;
   // private boolean isWeapon;
    
   // private boolean isArmor;
    private double baseDamage;
    private double attacksPerSecond;
    private double dps;
    private double mainStat;
    private String itemType;



    public Equipment(String itemName, int reqLevel,String itemType, String itemSlot, double baseDamage, double attacksPerSecond, double dps, double mainStat) {
        this.itemName = itemName;
        this.reqLevel = reqLevel;
        this.itemType = itemType;
        this.itemSlot = itemSlot;
        this.baseDamage = baseDamage;
        this.attacksPerSecond = attacksPerSecond;
        this.dps = baseDamage * attacksPerSecond;
        this.mainStat = mainStat;
    }



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getReqLevel() {
        return reqLevel;
    }

    public void setReqLevel(int reqLevel) {
        this.reqLevel = reqLevel;
    }




    public String getItemSlot() {
        return itemSlot;
    }

    public void setItemSlot(String itemSlot) {
        this.itemSlot = itemSlot;
    }
    

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public double getAttacksPerSecond() {
        return attacksPerSecond;
    }

    public void setAttacksPerSecond(double attacksPerSecond) {
        this.attacksPerSecond = attacksPerSecond;
    }
    public double getMainStat() {
        return mainStat;
    }

    public void setMainStat(double mainStat) {
        this.mainStat = mainStat;
    }
    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = baseDamage*attacksPerSecond;
    }

    public String getItemType() {
        if (itemType.equals("Staff")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Wand")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Bow")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Dagger")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Sword")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Axe")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Hammer")) {
            this.itemType = "Weapon";
        } else if (itemType.equals("Cloth")) {
            this.itemType = "Armor";
        } else if (itemType.equals("Leather")) {
            this.itemType = "Armor";
        } else if (itemType.equals("Mail")) {
            this.itemType = "Armor";
        } else if (itemType.equals("Plate")) {
            this.itemType = "Armor";
        }
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void getDetails() {
        CharacterClass.printHeading("ITEM INFO");
        System.out.println("Name: " + itemName);
        System.out.println("Required level: " + reqLevel);
        System.out.println("** ITEM STATS **");
        System.out.println("Slot: " + itemSlot);
        System.out.println("Type: " + itemType);
        System.out.println();
    }


}
