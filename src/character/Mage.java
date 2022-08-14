package character;

public class Mage extends CharacterClass {

    //private Damage intDPS;


    public Mage(String name, String characterClass, int level) {
        super(name, characterClass, level, 1, 1, 8);
        //this.intDPS = intDPS;
    }


    @Override
    public int attack() {
        int i = (int) (intelligence * 1.1);
        System.out.println("DPS: " + i);
        return i;
    }

    @Override
    public int defend(){
        return 0;
    }


}
