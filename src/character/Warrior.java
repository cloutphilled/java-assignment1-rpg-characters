package character;

public class Warrior extends CharacterClass{
    public Warrior() {

    }

    public Warrior(String name, int level) {
        super(name, "Warrior", level, 5, 2, 1);
    }

    @Override
    public double attack() {
        return 0;
    }
    @Override
    public int defend(){
        return 0;
    }

    @Override
    public void levelUp(int i) {
        super.levelUp(i);
        super.strength += 3 * i;
        super.dexterity += 2 * i;
        super.intelligence += 1 * i;
    }
}
