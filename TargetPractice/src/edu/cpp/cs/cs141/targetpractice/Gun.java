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

import java.util.Random;

/**
 * @author Miguel Menjivar
 * 
 * Gun object
 * never have a method that is more 15 - 20 lines of code
 * 
 * check ammo count
 * create test program to make sure this class works properly
 */
public class Gun {
	/**
	 * Has a value of 7 that can not be modified
	 * which represents the ammunition capacity of a weapon
	 * which can be used outside of a class
	 */
	private static final int AMMO_CAPACITY_HANDGUN = 7;
	private static final int AMMO_CAPACITY_SHOTGUN = 8;
	private static final int AMMO_CAPACITY_RIFLE = 10;
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
		accuracy = 85;
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
	public boolean shoot(Random rand){
		boolean shot = false;
		int shotSuccess = rand.nextInt(100);
		
		if (shotSuccess < accuracy)
			shot = true;
		//check if there is enough ammo, check game engine and call if there is ammo
		ammo--;
		return false;
	}
	/**
	 * This will be a default method for reload
	 * that will reload the clip to the max capacity
	 *  of the weapon
	 */
	//method shoot and reload
	public void reload(){
		if(2<3){}
		ammo = AMMO_CAPACITY_HANDGUN;
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
