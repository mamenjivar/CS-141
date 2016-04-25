/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodr�guez
 * 
 * Programming Assignment #2
 * 
 * This assignment is based off target practice. The purpose is that the user will
 * be able to choose a weapon ranging from hand guns, rifles, and shotguns. They also
 * have to shoot at five targets.
 * 
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.targetpractice;

import java.util.Random;

/**
 * @author Miguel Menjivar
 * 
 * takes care of most of the game logic
 * create array of targets, create gun, have methods
 * that shoot weapons at targets, 
 * tells that will show you when you have hit all targets
 */
public class GameEngine {
	/**
	 * This integer will hold the final amount of 5 that will be used to reload the
	 * ammunition when it depletes
	 */
	private static final int TARGET_NUMBERS = 5;
	/**
	 * This private field will hold the value for the number of targets when the game begins
	 */
	private int target;
	/**
	 * This method will be in charge of creating the weapons
	 *  used to shoot at the targets
	 *  
	 *  gunCreation method creates the gun objects ranging from
	 *  rifles, hand guns, and shotguns
	 *  each have their own attributes
	 */
	
	Target bullseye = new Target();
	/**
	 * gunCreation method will create the weapon that the 
	 * user chooses when the program initializes
	 * 
	 * @param gun is the value that is initialized from the 
	 * UserInterface class when the user types what weapon 
	 * he/she will use
	 * 
	 * @return will return the value initialized when creating the value
	 * for the weapon
	 */
	public Gun gunCreation(String gun){
		Random dice = new Random();
		if (gun.equals("pistol")){
			Gun pistol = new Gun();
			System.out.println("This is the gun class");
			return pistol;
		}
		else if(gun.equals("rifle")){
			Gun rifle = new Gun(9, 8);
			System.out.println("This is the rifle class");
			return rifle;
		}
		else if(gun.equals("shotgun")){
			Gun shotgun = new Gun(6, 5);
			System.out.println("This is the shotgun class");
			return shotgun;
		}
		else
			System.out.println("There is no known weapon");
		return null;
	}
}
