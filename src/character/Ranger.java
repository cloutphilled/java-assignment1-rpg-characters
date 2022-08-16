package character;

public class Ranger extends CharacterClass{
    public Ranger() {
    }

    public Ranger(String name, int level) {
        super(name, "Ranger", level, 1, 7, 1);
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
        super.strength += 1;
        super.dexterity += 5;
        super.intelligence += 1;
        super.strength = (1 * i) + strength;
        super.dexterity = (5 * i) + dexterity;
        super.intelligence = (1 * i) + intelligence;
    }
}
