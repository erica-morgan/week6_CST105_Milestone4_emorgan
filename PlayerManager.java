package draftProject;
/**
 * Program: NFL Draft Project
 * File: PlayerManager.java
 * Summary: This is my final project program (PlayerManager class).
 * Author: Erica Morgan
 * Date: 3/30/2018 (revised)
 */
import java.util.*;

public class PlayerManager { //Begin PlayerManager class

	//Create ArrayList
	private static ArrayList <NFLPlayer> PLAYER_LIST = new ArrayList<NFLPlayer>();
	
	//Create PlayerManager method
	public PlayerManager() {
		createPlayers();
	}
	//List of players and statistics and add to ArrayList
	public static void createPlayers() {
		NFLPlayer tbrady = new OffensivePlayer("Tom Brady", "QB", 40, 1.9304, 102.058, "Michigan", 2000, 19, "San Mateo, CA", "New England Patriots", 488, 17, 102);
		NFLPlayer khunt = new OffensivePlayer("Kareem Hunt", "RB", 22, 1.778, 97.976, "Toledo", 2017, 2, "Elyria, OH", "Kansas City Chiefs", 0, 8, 66);
		NFLPlayer abrown = new OffensivePlayer("Antonio Brown", "WR", 29, 1.778, 82.1002, "Central Michigan", 2010, 9, "Miami, FL", "Pittsburgh Steelers", 1, 0, 392);
		
		NFLPlayer pbrown = new DefensivePlayer("Preston Brown", "LB", 25, 1.8542, 113.852, "Louisville", 2014, 5, "Cincinnati, Oh", "Cincinnati Bengals", 512, 2, 3);
		NFLPlayer cjones = new DefensivePlayer("Chandler Jones", "LB", 28, 1.9558, 120.202, "Syracuse", 2012, 7, "Rochester, NY", "Arizona Cardinals", 319, 16, 1);
		NFLPlayer kbyard = new DefensivePlayer("Kevin Byard", "S", 24, 1.8034, 96.1616, "Middle Tennessee", 2016, 3, "Lithonia, GA", "Tennessee Titans", 145, 0, 8);
		
		PLAYER_LIST.add(tbrady);
		PLAYER_LIST.add(khunt);
		PLAYER_LIST.add(abrown);
		PLAYER_LIST.add(pbrown);
		PLAYER_LIST.add(cjones);
		PLAYER_LIST.add(kbyard);
		
	}
	//create toString method
	public String toString() {
		String playerList = "";
		for(NFLPlayer player : PLAYER_LIST)
			playerList += (player.getName() + " " + "\n");
		return playerList; 
	}
	//Add main method and test string, getter, and setter
	public static void main(String[] args) {
		PlayerManager test = new PlayerManager();
		System.out.println("String Test:\n\nThe players I've selected so far include: \n" + test.toString());
		System.out.println("Getter Test:\nTom Brady is " + PlayerManager.PLAYER_LIST.get(0).getAge() + " years old. He is currently in his " + PlayerManager.PLAYER_LIST.get(0).getExperience() + "th season. He was " + PlayerManager.PLAYER_LIST.get(0).getAgeStarted() + " years old when he started with the NFL.");
	
		PlayerManager.PLAYER_LIST.get(2).setName("Kareem Hunt");
		PlayerManager.PLAYER_LIST.get(2).setPosition("RB");
		PlayerManager.PLAYER_LIST.get(2).setCurrentTeam("Kansas City Chiefs");
		System.out.println("\nSetter Test:\n" + PlayerManager.PLAYER_LIST.get(2).getName() + " is currently a " + PlayerManager.PLAYER_LIST.get(2).getPosition() + " for the " + PlayerManager.PLAYER_LIST.get(2).getCurrentTeam() + ". His BMI is " + PlayerManager.PLAYER_LIST.get(2).getBmi() + ".");
		
	}
}
