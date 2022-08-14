import character.CharacterClass;
import character.Warrior;
import character.Mage;
import character.Rogue;
import character.Ranger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <CharacterClass> characters = new ArrayList<>();
        characters.add(new Mage("Chase", "Mage", 5));
        characters.add(new Warrior("Phil", "Rogue", 30));
        characters.get(0).getDetails();
        characters.get(1).getDetails();
        characters.get(0).attack();



    }
}
