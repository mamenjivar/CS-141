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
	public void GunCreation(){
		Gun pistol = new Gun();
		pistol.getAmmo();
	}
	

}
