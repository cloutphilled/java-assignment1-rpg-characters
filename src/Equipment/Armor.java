package Equipment;

public class Armor extends Equipment{

    public Armor(String itemName, int reqLevel, int itemLevel) {
        super(itemName, reqLevel, itemLevel, "Armor", "Body", false, true, 0, 0);
    }

    public double mainStat(){
        double mainStat;
        mainStat = 0;
        return mainStat;
    }

}
