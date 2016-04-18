/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodíguez
 * 
 * Programming Assignment #1
 * 
 * Skeleton for first person shooter video game
 * 
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.Assignment1;

/**
 * @author Miguel Menjivar
 * 
 */
public class Map {
	/**
	 * spawn points will be randomized for the enemies and 
	 * the players will use throughout the map
	 */
	private int[] spawnPoints;
	/**
	 * Where the buildings will be located and obstacles
	 * that users will encounter when the play the map
	 */
	private int[] buildings;
	/**
	 * Will tell players the size of the maps
	 */
	private int size;
	/**
	 * default constructor that sets all values to zero
	 */
	public Map(){
		spawnPoints = new int[0];
		buildings = new int[0];
		size = 0;
	}
	/**
	 * TODO: finish commenting
	 * Constructor
	 * @param spawnPoints
	 * @param buildings
	 * @param size
	 */
	public Map(int[] spawnPoints, int[] buildings, int size){
		this.spawnPoints = spawnPoints;
		this.buildings = buildings;
		this.size = size;
	}
	/**
	 * TODO: skeleton code
	 * @return will return what kind of weather conditions
	 * will be present when the map initializes
	 */
	public String Weather(){
		return null;
	}
	/**
	 * TODO: skeleton code
	 * @return will show if the map has been initialized
	 * for the user to play
	 */
	public boolean initialize(){
		return false;
	}
	/**
	 * setter for spawn points
	 * @param spawnPoints will set the value of the parameter
	 * to the private variable in this class
	 */
	public void setSpawnPoints(int[] spawnPoints){
		this.spawnPoints = spawnPoints;
	}
	/**
	 * setter for the integer buildings
	 * @param buildings will set the value of the parameter
	 * equal to what the 
	 */
	public void setBuildings(int[] buildings){
		this.buildings = buildings;
	}
	/**
	 * setter for integer size
	 * @param size sets the parameter
	 * equal to the private field size
	 */
	public void setSize(int size){
		this.size = size;
	}
	/**
	 * Getter for spawn points
	 * @return will return the value
	 * associated with the private field spawn points
	 */
	public int[] getSpawnPoints(){
		return spawnPoints;
	}
	/**
	 * Getter for Buildings
	 * @return will return the value
	 * in the private field buildings
	 */
	public int[] getBuildings(){
		return buildings;
	}
	/**
	 * Getter for size
	 * @return will return the value
	 * for the private field size
	 */
	public int getSize(){
		return size;
	}
}
