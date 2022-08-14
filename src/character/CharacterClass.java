package character;

public abstract class CharacterClass {
    public String name;
    public String characterClass;
    public int level;
    public int strength, dexterity, intelligence;

    public abstract int attack();
    public abstract int defend();







    // Constructor
    public CharacterClass() {

    }

    // Constructor
    public CharacterClass(String name, String characterClass, int level, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.strength = strength * level;
        this.dexterity = dexterity * level;
        this.intelligence = intelligence * level;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {

        return dexterity;
    }

    public void setDexterity(int dexterity) {

        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }





    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public void getDetails() {
        printHeading("CHARACTER INFO");
        System.out.println("Name: " + name);
        System.out.println("Class: " + characterClass);
        System.out.println("Level: " + level);
        System.out.println("** ATTRIBUTES **");
        System.out.println("Strength: " +strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println();
    }
}
