package net.matt.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Campaign implements Serializable {

	private static final long serialVersionUID = 1L;
	StringBuilder campaignLog;
	String name, fileName;
	ArrayList<Character> partyList;
	ArrayList<Item> itemList;
	GregorianCalendar date = new GregorianCalendar();

	/**
	 * Full Constructor
	 * 
	 * @param campaignLog
	 *            - the campaigns text log
	 * @param name
	 *            - the name of the campaign
	 * @param fileName
	 *            - the file name for the campaign
	 * @param partyList
	 *            - the list of players engaged in this campaign
	 * @param itemList
	 *            - the list of items that are in this campaign
	 */
	public Campaign(StringBuilder campaignLog, String name, String fileName,
			ArrayList<Character> partyList, ArrayList<Item> itemList) {
		this.campaignLog = campaignLog;
		this.name = name;
		this.fileName = fileName;
		this.partyList = partyList;
		this.itemList = itemList;
	}

	/**
	 * Default Constructor
	 * 
	 * @param name
	 *            - the name of the campaign
	 * @param fileName
	 *            - the file name for the campaign
	 */
	public Campaign(String name, String fileName) {
		this.name = name;
		this.fileName = fileName;
		partyList = new ArrayList<Character>();
		itemList = new ArrayList<Item>();
	}
	
	/** Copy Constructor
	 * @param campaign - the campaign to be copied
	 */
	public Campaign(Campaign campaign){
		this(campaign.getCampaignLog(), campaign.getName(), campaign.getFileName(), campaign.getPartyList(), campaign.getItemList());
	}
	
	

	/**
	 * @return the campaignLog
	 */
	public StringBuilder getCampaignLog() {
		return campaignLog;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the partyList
	 */
	public ArrayList<Character> getPartyList() {
		return partyList;
	}

	/**
	 * @return the itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}

	/**
	 * @return the date
	 */
	public GregorianCalendar getDate() {
		return date;
	}

	/** Adds a player's action to the log
	 * @param log - the action to be logged
	 * @param characterName - the player's character name
	 */
	public void addToLog(String log, String characterName) {
		campaignLog.append(String.format("[%s/%s] %s: %s",
				(date.get(Calendar.MONTH) + 1),
				date.get(Calendar.DAY_OF_MONTH), name, log + "\n"));
	}
	
	/** Adds a general action to the log (A player's death or an event that doesn't contain an individual)
	 * @param log - the action or event to be logged
	 */
	public void addToLog(String log) {
		campaignLog.append(String.format("[%s/%s] %s",
				(date.get(Calendar.MONTH) + 1),
				date.get(Calendar.DAY_OF_MONTH), log + "\n"));
	}
	
	

}
