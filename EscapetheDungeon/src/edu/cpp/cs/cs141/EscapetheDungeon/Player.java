/**
 * 
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

/**
 * @author Miguel Menjivar
 * 
 * This class will inherit the values from the ActiveAgent class
 * This class will solely focus on the player attributes
 */
public class Player extends ActiveAgents {
	
	private int health = 20;
	/**
	 * 
	 */
	public void attack(){
		
	}
	/**
	 * 
	 */
	public void heal(){
		health = 20;
	}
	public void Hit(){
		System.out.println("The Player has been hit");
		setHealth(health);
		System.out.println("The Player has " + health + " health points remaining");
	}
	public void setHealth(int health){
		this.health = health;
		health--;
	}
	public int getHealth(){
		return health;
	}
}
