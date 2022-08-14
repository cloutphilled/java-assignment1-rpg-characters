package character;

public class Rogue extends CharacterClass{
    public Rogue() {
    }

    public Rogue(String name, String characterClass, int level, int strength, int dexterity, int intelligence) {
        super(name, characterClass, level, 2, 6, 1);
    }

    @Override
    public int attack() {
        return (int) (dexterity * 1.1);
    }
    @Override
    public int defend(){
        return 0;
    }

}
