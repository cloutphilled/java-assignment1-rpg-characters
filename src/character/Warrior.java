package character;

public class Warrior extends CharacterClass{
    public Warrior() {

    }

    public Warrior(String name, String characterClass, int level) {
        super(name, characterClass, level, 5, 2, 1);
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
