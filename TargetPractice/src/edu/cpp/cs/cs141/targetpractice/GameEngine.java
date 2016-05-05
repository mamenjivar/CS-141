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
	 * This private field will hold the value for the number of targets when the game begins
	 */
	private int target;
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
		Gun weapon;
		
		if (gun.equals("pistol")){
			weapon = new Gun();
			System.out.println("This is the pistol class");
			return weapon;
		}
		else if(gun.equals("rifle")){
			weapon = new Gun(8, 80);
			System.out.println("This is the rifle class\n");
			return weapon;
		}
		else if(gun.equals("shotgun")){
			weapon = new Gun(6, 60);
			System.out.println("This is the shotgun class\n");
			return weapon;
		}
		else
			System.out.println("There is no known weapon\n");
		return null;
	}
}
