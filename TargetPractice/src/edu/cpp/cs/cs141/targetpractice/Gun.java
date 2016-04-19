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
 */
public class Gun {
	/**
	 * Has a value of 7 that can not be modified
	 * which represents the ammunition capacity of a weapon
	 * which can be used outside of a class
	 */
	private static final int AMMO_CAPACITY = 7;
	/**
	 * This has the integer value of 7 which is
	 * the ammunition capacity of a weapon which is capable
	 * of being used within this class only
	 */
	private int ammo = 7;
	/**
	 * This integer has a value of 75 which shows
	 * the accuracy of the weapon provided
	 */
	private int accuracy = 75;
	/**
	 * This 
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
	 * 
	 */
	//method shoot and reload
	public void reload(){
		ammo = AMMO_CAPACITY;
	}
	//check ammo count
	//create a test program that tests the gun class
	public void setAmmo(int ammo){
		this.ammo = ammo;
	}
	/**
	 * 
	 * @param accuracy
	 */
	public void setAccuracy(int accuracy){
		this.accuracy = accuracy;
	}
	/**
	 * 
	 * @return
	 */
	public int getAmmo(){
		return ammo;
	}
	/**
	 * 
	 * @return
	 */
	public int getAccuracy(){
		return accuracy;
	}
}
