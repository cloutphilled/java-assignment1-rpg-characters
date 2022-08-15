package Equipment;

public abstract class Equipment {
    private String itemName;
    private int reqLevel;
    private int itemLevel;
    private String itemType;
    private String itemSlot;
    private boolean isWeapon;
    private boolean isArmor;

    public Equipment(String itemName, int reqLevel, int itemLevel, String itemType, String itemSlot, boolean isWeapon, boolean isArmor) {
        this.itemName = itemName;
        this.reqLevel = reqLevel;
        this.itemLevel = itemLevel;
        this.itemType = itemType;
        this.itemSlot = itemSlot;
        this.isWeapon = isWeapon;
        this.isArmor = isArmor;
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

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getItemSlot() {
        return itemSlot;
    }

    public void setItemSlot(String itemSlot) {
        this.itemSlot = itemSlot;
    }


    public boolean isWeapon() {
        return isWeapon;
    }

    public void setWeapon(boolean weapon) {
        isWeapon = weapon;
    }

    public boolean isArmor() {
        return isArmor;
    }

    public void setArmor(boolean armor) {
        isArmor = armor;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
