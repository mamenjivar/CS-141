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
import java.util.Random;
/**
 * @author Miguel Menjivar
 *
 *
 * This class will inherit the values from ActiveAgents class
 * This class will solely focus on the attributes of the enemy
 */
public class Enemy extends ActiveAgents{
	private int handGun = 50;
	/**
	 * This will instantiate the rifle class to be used in this class
	 */
	Rifle rifle = new Rifle();
	/**
	 * The random class will be instantiated in order to randomly select 
	 * the rifle to be used when the enemy attacks
	 */
	Random weapon = new Random();
	/**
	 * The private field health is set to 5 because that is the 
	 * enemies health when they spawn to attack the player
	 */
	private int health = 5;
	/**
	 * The method weapon is used to choose which weapon will be chosen
	 * when the enemy spawns to attack the player
	 */
	public void weapon(){
		int choose = weapon.nextInt(100) + 1;
		
		if(choose < handGun){
			//pistol.shoot();
		}
		else if(choose > handGun){
			rifle.shoot();
		}
	}
	/**
	 * This method will be called when the enemy has been hit by the 
	 * user. It will also subtract one point from its health depending on the weapon used
	 */
	public void Hit(){
		System.out.println("The enemy has been hit");
		setHealth(health);
		System.out.println("The enemy has " + health + " health points remaining");
	}
	/**
	 * The setter for the variable health
	 * @param health will set the parameter value of health
	 * to the private field health
	 */
	public void setHealth(int health){
		this.health = health;
		this.health--;
	}
	/**
	 * This getter for the variable health
	 * @return This will return the value associated with the health field
	 * in this class
	 */
	public int getHealth(){
		return health;
	}
}
