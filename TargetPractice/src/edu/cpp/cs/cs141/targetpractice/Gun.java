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
 * Gun object
 * never have a method that is more 15 - 20 lines of code
 * 
 * TODO: ammo count works and shoot method works and decreases
 * weapon capacity by one, just need to fix if target was accurate or not
 */
public class Gun {
	/**
	 * Has a value of 7 that can not be modified
	 * which represents the ammunition capacity of a weapon
	 * which can be used outside of a class
	 * will also be the max capacity for all weapons
	 * shotgun, handgun, and rifle
	 */
	private static final int AMMO_CAPACITY = 7;
	//private static final int AMMO_CAPACITY_SHOTGUN = 8;
	//private static final int AMMO_CAPACITY_RIFLE = 10;
	/**
	 * This has the integer value of 7 which is
	 * the ammunition capacity of a weapon which is capable
	 * of being used within this class only
	 */
	private int ammo;
	//private int ammo = 7;
	/**
	 * This integer has a value of 75 which shows
	 * the accuracy of the weapon provided
	 */
	//private int accuracy = 75;
	private int accuracy;
	/**
	 * Default constructor that will initialize
	 * handgun with only 7 rounds and 85% accuracy
	 */
	public Gun(){
		ammo = 7;
		accuracy = 5;
	}
	/**
	 * Will overload constructor to set values for the rifle
	 * or shotgun
	 * @param accuracy will hold the value associated with the rifle
	 * or shotgun methods
	 * @param ammo will hold the ammunition provided by each weapon which
	 * will be different for each weapon
	 */
	public Gun(int accuracy, int ammo){
		this.ammo = ammo;
		this.accuracy = accuracy;
	}
	/**
	 * This method will return a boolean value whether the weapon shot or not
	 * @return the return value shows whether the weapon
	 * has successfully hit the target or not 
	 */
	public boolean shoot(int rand){

		boolean shot = false;
		int shotSuccess = rand;
		
		if (shotSuccess <= accuracy)
			shot = true;
		//check if there is enough ammo, check game engine and call if there is ammo
		//ammo--;
		if (ammo > 0){
			ammo--;
		}else if(ammo == 0){
			System.out.println("You ran out of ammo");
			UserInterface game = new UserInterface();
			game.reloadWeapon();
		}
		return shot;
	}
	/**
	 * This will be a default method for reload
	 * that will reload the clip to the max capacity
	 *  of the weapon
	 */
	//method shoot and reload
	public void reload(){
		ammo = AMMO_CAPACITY;
	}
	/**
	 * overloaded method for reload that will 
	 * request from user how much ammo they will want
	 */
	public void reload(int ammo){
		this.ammo = ammo;
		
	}
	/**
	 * Setter for ammunition field method
	 * @param ammo will set parameter equal
	 * to private field ammo
	 */
	public void setAmmo(int ammo){
		this.ammo = ammo;
	}
	/**
	 * Setter for accuracy
 	 * @param accuracy will set the parameter
 	 * equal to the private field accuracy
	 */
	public void setAccuracy(int accuracy){
		this.accuracy = accuracy;
	}
	/**
	 * Getter for ammunition
	 * @return will return the value 
	 * inside the ammo field
	 */
	public int getAmmo(){
		return ammo;
	}
	/**
	 * Getter for accuracy
	 * @return will return the value
	 * that is associated with the private field accuracy
	 */
	public int getAccuracy(){
		return accuracy;
	}
}
