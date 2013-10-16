package net.matt.entity;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Campaign {
	
	StringBuilder campaignLog;
	String name, fileName;
	ArrayList<Character> characters;
	ArrayList<Item> items;
	
	/** Full Constructor 
	 * @param campaignLog - the full text log of the campaign
	 * @param name
	 * @param fileName
	 * @param characters
	 * @param items
	 */
	public Campaign(StringBuilder campaignLog, String name, String fileName,
			ArrayList<Character> characters, ArrayList<Item> items) {
		this.campaignLog = campaignLog;
		this.name = name;
		this.fileName = fileName;
		this.characters = characters;
		this.items = items;
	}
	

	
	
	
	

	
	
}
