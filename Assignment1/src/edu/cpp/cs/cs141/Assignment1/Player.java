/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 * 
 * Programming Assignment #1
 * 
 * Skeleton for first person shooter video game
 */
package edu.cpp.cs.cs141.Assignment1;

/**
 * @author Miguel Menjivar 
 * This is skeleton code
 */
public class Player {
	/**
	 * The string name will assign a name given to the player
	 */
	private String name;
	/**
	 * The variable health will show how much damage the player
	 * could take throughout the game
	 */
	private int health;
	/**
	 * The position will tell the player where they are located
	 * at in the game
	 */
	private double[] position;
	/**
	 * The default constructor that sets the fields to 
	 * their default settings
	 */
	public Player(){
		name = "";
		health = 0;
		position = new double[0];
	}
	/**
	 * Constructor 
	 * @param name sets name equal to private field name
	 * @param health sets health equal to private field health
	 * @param position sets position equal to private field position
	 */
	public Player(String name, int health, double[] position){
		this.name = name;
		this.health = health;
		this.position = position;
	}
	/**
	 * TODO: this is a skeleton code
	 * @return will return if the weapon fired was
	 * a hit or a miss
	 */
	public boolean shoot(){
		return false;
	}
	/**
	 * TODO: this is skeleton code
	 * @return will return a value that allows user to aim
	 * weapon 
	 */
	public int aim(){
		return 0;
	}
	/**
	 * TODO: this is skeleton code
	 * @return will allow player to move in a given
	 * direction
	 */
	public int move(){
		return 0;
	}
	/**
	 * Setter for String name
	 * @param name will set the value equal to
	 * the private String name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * Setter for integer Health
	 * @param health parameter will set the value
	 * equal to the private Integer health
	 */
	public void setHealth(int health){
		this.health = health;
	}
	/**
	 * Setter for double Position
	 * @param position parameter will set the value
	 * equal to the private double Position
	 */
	public void setPosition(double[] position){
		this.position = position;
	}
	/**
	 * Getter for String name
	 * @return will return the name assigned
	 * to the name String
	 */
	public String getName(){
		return name;
	}
	/**
	 * Getter for integer health
	 * @return will return value associated with
	 * the health variable
	 */
	public int getHealth(){
		return health;
	}
	/**
	 * Getter for double Position
	 * @return will return the value associated with
	 * the double array Position
	 */
	public double[] getPosition(){
		return position;
	}
}
