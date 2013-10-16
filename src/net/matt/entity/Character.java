package net.matt.entity;

import java.util.ArrayList;

public class Character {

	String characterName, playerName, characterClass, characterMisc;
	int dexterity, constitution, intelligence, charisma, strength, wisdom, maxHP, currentHP;
	ArrayList<Item> backpack;
	
	/** Full Constructor
	 * @param characterName - the name of the character
	 * @param playerName - the name of the player controlling this character
	 * @param characterClass - the character's class
	 * @param characterMisc - any miscellaneous information about this character
	 * @param dexterity - stat
	 * @param constitution - stat
	 * @param intelligence - stat
	 * @param charisma - stat
	 * @param strength - stat
	 * @param wisdom - stat
	 * @param maxHP - the characters maximum hit points
	 * @param currentHP - the characters current hit points
	 * @param backpack - the character collection of items
	 */
	public Character(String characterName, String playerName,
			String characterClass, String characterMisc, int dexterity,
			int constitution, int intelligence, int charisma, int strength,
			int wisdom, int maxHP, int currentHP, ArrayList<Item> backpack) {
		this.characterName = characterName;
		this.playerName = playerName;
		this.characterClass = characterClass;
		this.characterMisc = characterMisc;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.charisma = charisma;
		this.strength = strength;
		this.wisdom = wisdom;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.backpack = backpack;
	}

	
	
	/** Default Constructor
	 * @param characterName - the name of the character
	 * @param playerName - the name of the player controlling this character
	 * @param characterClass - the character's class
	 * @param characterMisc - any miscellaneous information about this character
	 * @param dexterity - stat
	 * @param constitution - stat
	 * @param intelligence - stat
	 * @param charisma - stat
	 * @param strength - stat
	 * @param wisdom - stat
	 * @param maxHP - the characters maximum hit points
	 * @param currentHP - the characters current hit points
	 */
	public Character(String characterName, String playerName,
			String characterClass, String characterMisc, int dexterity,
			int constitution, int intelligence, int charisma, int strength,
			int wisdom, int maxHP, int currentHP) {
		this.characterName = characterName;
		this.playerName = playerName;
		this.characterClass = characterClass;
		this.characterMisc = characterMisc;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.charisma = charisma;
		this.strength = strength;
		this.wisdom = wisdom;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
	}



	/* ***************************************
	 * 				Getters
	 * ***************************************/
	
	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @return the characterClass
	 */
	public String getCharacterClass() {
		return characterClass;
	}

	/**
	 * @return the characterMisc
	 */
	public String getCharacterMisc() {
		return characterMisc;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @return the constitution
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @return the charisma
	 */
	public int getCharisma() {
		return charisma;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @return the wisdom
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * @return the maxHP
	 */
	public int getMaxHP() {
		return maxHP;
	}

	/**
	 * @return the currentHP
	 */
	public int getCurrentHP() {
		return currentHP;
	}

	/**
	 * @return the backpack
	 */
	public ArrayList<Item> getBackpack() {
		return backpack;
	}

	/* ***************************************
	 *  			Other methods
	 * ***************************************/
	
	/** Add an item to the player's backpack
	 * @param item - the item to be inserted into the backpack
	 */
	public void addItem(Item item) {
		backpack.add(item);
	}
	
	/** Remove an item from the player's backpack
	 * @param item - the item to be removed from the backpack
	 */
	public void removeItem(Item item){
		backpack.remove(item);
	}
	
	/** Check to see if the player is dead
	 * @return - true: if player's hp is less than 0 | false: if player's hp is greater than 0
	 */
	public boolean isDead(){
		if(currentHP <= 0)
			return true;
		else
			return false;
	}
	
	
}
