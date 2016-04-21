/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodr�guez
 * 
 * Programming Assignment #2
 * 
 * <description of assignment>
 * 
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.targetpractice;

/**
 * @author Miguel Menjivar
 * 
 * takes care of most of the game logic
 * create array of targets, create gun, have methods
 * that shoot weapons at targets, 
 * tells that will show you when you have hit all targets
 * 
 */
public class GameEngine {
	private int targets = 5;
	/**
	 * This method will be in charge of creating the weapons
	 *  used to shoot at the targets
	 */
	public void gunCreation(String gun){
		if (gun.equals("pistol")){
			Gun pistol = new Gun();
			System.out.println("This is the gun class");
		}
		else if(gun.equals("rifle")){
			Gun rifle = new Gun(90, 7);
			System.out.println("This is the rifle class");
		} else if(gun.equals("shotgun")){
			Gun shotgun = new Gun(70, 7);
			System.out.println("This is the shotgun class");
		} else
			System.out.println("There is no known weapon");
		//pistol.getAmmo();
	}
	public void targetCreation(){
		int[] targets = new int[5];
	}
	public void hitTargets(){
		
	}
}
