package character;

import Equipment.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterClassTest {
    @Test
    public void createLvl1Warrior() {
        // Arrange
        Warrior Nooes = new Warrior("Nooes", 1);
        int expectedStrength = 5;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;
        // Act
        int actualStrength = Nooes.getStrength();
        int actualDexterity = Nooes.getDexterity();
        int actualIntelligence = Nooes.getIntelligence();
        // Assert
        assertEquals(expectedStrength,actualStrength);
        assertEquals(expectedDexterity,actualDexterity);
        assertEquals(expectedIntelligence,actualIntelligence);
    }

    @Test
    public void lvlUpRogueBy59() {
        // Arrange
        Rogue Phil = new Rogue("Phil",1);
        int levelUp = 59;
        int expectedLevel = 60;
        // Act
        int actualLevel = Phil.levelUp(59);
        // Assert
        assertEquals(expectedLevel,actualLevel);
    }

    @Test
    public void createItemWeapon() {
        //Arrange
        Weapon glaives = new Weapon("Warglaives of Azzinoth", 60, "Sword", 1000, 2);
        //Act
        double expectedDPS = 2000;
        //Assert
        assertEquals(expectedDPS,glaives.getDps());
    }
}