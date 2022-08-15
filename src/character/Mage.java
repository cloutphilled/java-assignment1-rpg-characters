package character;

public class Mage extends CharacterClass {

    //private Damage intDPS;


    public Mage(String name, int level) {
        super(name, "Mage", level, 1, 1, 8);
        //this.intDPS = intDPS;
    }


    @Override
    public int attack() {
        int i = (int) (intelligence * 1.1);
        return i;
    }

    @Override
    public int defend(){
        return 0;
    }


    @Override
    public void levelUp(int i) {
        super.levelUp(i);
        super.strength += 1 * i;
        super.dexterity += 1 * i;
        super.intelligence += 5 * i;
    }
}
