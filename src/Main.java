import character.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <CharacterClass> characters = new ArrayList<>();
        characters.add(new Mage("Chase", 1));
        characters.add(new Rogue("Phil", 1));
        characters.add(new Warrior("Nooes", 1));
        characters.get(0).getDetails();


        characters.get(0).levelUp(8);
        characters.get(0).getDetails();


        Ranger philsranger = new Ranger("Philsranger", 1);




    }
}
