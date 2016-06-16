/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #3
 *
 * Escape the Dungeon
 *
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

/**
 * @author Miguel Menjivar
 * 
 * This class will inherit the values from the ActiveAgent class
 * This class will solely focus on the player attributes
 */
public class Player extends ActiveAgents {
	/**
	 * The private field health is set to 20 for 
	 * the player 
	 */
	private int health = 20;
	/**
	 * This method will set the value of health
	 * back to 20 to simulate that the person received a health pack
	 */
	public void heal(){
		health = 20;
	}
	/**
	 * This method is used when the player is attacked by the enemy and 
	 * has lost points to his health
	 */
	public void Hit(){
		System.out.println("The Player has been hit");
		setHealth(health);
		System.out.println("The Player has " + health + " health points remaining");
	}
	/**
	 * The setter for the health field
	 * @param health will set the parameter equal to the 
	 * private field health
	 */
	public void setHealth(int health){
		this.health = health;
		this.health--;
	}
	/**
	 * The getter for health
	 * @return will return the value associated with the 
	 * private field health
	 */
	public int getHealth(){
		return health;
	}
}
