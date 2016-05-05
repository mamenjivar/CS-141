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
 * An abstract class representing the gun objects
 * Each type of gun is represented by a respective subclass
 * that is a subtype of the Gun class
 */
public abstract class Gun {
/**
 * The pistol field is set to 15 because that is the max
 * capacity of this weapon when used throughout the game
 */
	private int pistol = 15;
	/**
	 * The rifle field is set to 10 because
	 * that is the max capaacity of this weapon
	 */
	private int rifle = 10;
	/**
	 * The shotgun field is set to 5 because it 
	 * is the max capacity of this weapon and is considered
	 * the strongest weapon in the game, but with bad accuracy
	 */
	private int shotgun = 5;
	/**
	 * This method is abstract as it will be used for each
	 * subclass in the Gun class
	 */
	public abstract void reload();

	/*public void Gunz(String gunzilla){
		if(gunzilla.equals("pistol")){
			//pistola.shoot();
		}
	}*/
}
