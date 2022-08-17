package character;
import Equipment.*;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class CharacterClass{
    public String name;
    public String characterClass;
    public int level;
    public int strength, dexterity, intelligence;


    public abstract double attack();


    ArrayList<String> allowedArmorType = new ArrayList<>();
    ArrayList<String> allowedWeaponType = new ArrayList<>();



    private HashMap<String, Equipment> Items = new HashMap<String, Equipment>();


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
        this.intelligence = intelligence* level;

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



    public int levelUp(int i) {
        level = level + i;
        setLevel(level);
        return i;
    }






    public HashMap<String, Equipment> getItems() {
        return Items;
    }
    public void setItems(HashMap<String, Equipment> items) {
        Items = items;
    }


    /*
    public void checkItemRequirement(Equipment item)throws InvalidArmorException, InvalidWeaponException{
        if (item.getReqLevel() >= this.getLevel()){
            throw new InvalidWeaponException("You do not meet the level requirement");
        }
        if(item.getClass()==Armor.class) {
            for (String armorType: this.allowedWeaponType) {
                if(((Armor) item).getItemType().equalsIgnoreCase(armorType)){
                    return;
                }
            }
            throw new InvalidArmorException("You do not meet the class requirement for this armor");
        } else if (item.getClass()==Weapon.class) {
            for (String weaponType: this.allowedWeaponType) {
                if((Weapon)item.getItemType().equalsIgnoreCase(weaponType)){
                    return;
                }
            }
            throw new InvalidWeaponException("You do not meet the class requirement for this weapon");
        }
    }

    public void EquipItem(Equipment item)throws InvalidArmorException,InvalidWeaponException{
        checkItemRequirement(item);
        if(item.getClass() == Weapon.class){
            Items.put(item.getItemSlot(), item);
        } else if (item.getClass()== Armor.class) {
            Items.put(item.getItemSlot(), item);
        }
    }
*/




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
        System.out.println("DPS: " + attack());
        System.out.println();
    }

    /*
    public void checkItemReqAndChar() throws InvalidLevelException {
        if (Equipment.getReqLevel() > this.getLevel()) {
            throw new InvalidLevelException("You do not meet the required level");
        }
        if (Equipment.getItemType() != ) {

                }

            }
     */


}
