package character;

public class Rogue extends CharacterClass{
    public Rogue() {
    }

    public Rogue(String name, int level) {
        super(name, "Rogue", level, 2, 6, 1);

    }

    @Override
    public double attack() {
        int i = (int) (dexterity * 1.1);
        return i;
    }
    @Override
    public int defend(){
        return 0;
    }

    @Override
    public void levelUp(int i) {
        super.levelUp(i);
        super.strength += 2 * i;
        super.dexterity += 4 * i;
        super.intelligence = (1 * i) + intelligence;
    }
}
