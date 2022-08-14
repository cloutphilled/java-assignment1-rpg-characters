package character;

public class Ranger extends CharacterClass{
    public Ranger() {
    }

    public Ranger(String name, String characterClass, int level, int strength, int dexterity, int intelligence) {
        super(name, characterClass, level, 1, 7, 1);
    }

    @Override
    public int attack() {
        return 0;
    }
    @Override
    public int defend(){
        return 0;
    }

}
