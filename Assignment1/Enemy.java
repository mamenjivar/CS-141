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
 *
 */
public class Enemy {
	/**
	 * will assign a name to the enemy when the player
	 * encounters him in the map
	 */
	private String name;
	/**
	 * The enemy will also have health provided in order
	 * to take damage from the player when they engage in combat 
	 */
	private int health;
	/**
	 * The position is necessary in order to know where the enemy is
	 * located on the map at all times
	 */
	private double[] position;
	/**
	 * Default constructor that sets all values to zero/default
	 */
	public Enemy(){
		name = "";
		health = 0;
		position = new double[0];
	}
	/**
	 * Constructor
	 * @param name
	 * @param health
	 * @param position
	 */
	public Enemy(String name, int health, double[] position){
		this.name = name;
		this.health = health;
		this.position = position;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false whether the enemy has
	 * Successfully shot the weapon 
	 */
	public boolean shoot(){
		return false;
	}
	/**
	 * TODO: this is skeleton code
	 * @return will return a value that allows enemy to aim
	 * weapon 
	 */
	public int aim(){
		return 0;
	}
	/**
	 * TODO: this is skeleton code
	 * @return will allow enemy to move in a given
	 * direction
	 */
	public int move(){
		return 0;
	}
	/**
	 * TODO: skeleton code
	 * @return allows enemy whether it has found the player
	 * or not
	 */
	public boolean seekPlayer(){
		return false;
	}
	/**
	 * Setter for String name
	 * @param name will set the parameter name
	 * to the field name of this class
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * Setter for health
	 * @param health will set the parameter health
	 * equal to the field name in this class
	 */
	public void setHealth(int health){
		this.health = health;
	}
	/**
	 * Setter for Position
	 * @param position will set the parameter position
	 * equal to the private field position of this class
	 */
	public void setPosition(double[] position){
		this.position = position;
	}
	/**
	 * Getter for Name
	 * @return will return the value of the 
	 * private field name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Getter for health
	 * @return will return value of 
	 * private field health
	 */
	public int getHealth(){
		return health;
	}
	/**
	 * Getter for position
	 * @return will return the value of
	 * private field position
	 */
	public double[] getPosition(){
		return position;
	}
}
