/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
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
	 * 
	 */
	private static final int AMMO_CAPACITY = 7;
	/**
	 * 
	 */
	private int ammo = 7;
	/**
	 * 
	 */
	private int accuracy = 75;
	/**
	 * 
	 * @return
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
