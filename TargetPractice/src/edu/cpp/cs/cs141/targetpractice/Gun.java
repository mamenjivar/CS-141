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

/**
 * @author Miguel Menjivar
 * 
 * This is the Gun class that will help with
 * pulling the trigger and subtracting the ammunition count
 * It will also be responsible for reloading each weapon.
 */
public class Gun {
	/**
	 * The ammo capacity for all weapons it will have a max
	 * capacity of 7 bullets. All weapons will have the same
	 * capacity for the sake of the game
	 */
	private static final int AMMO_CAPACITY = 7;
	/**
	 * This will hold the ammo capacity of the weapon when
	 * it is shot from the weapon
	 */
	private int ammo;
	/**
	 * This private field will hold the value
	 * for the accuracy which will help if the target
	 * is hit or not
	 */
	private int accuracy;
	/**
	 * Default constructor that will initialize
	 * hand gun with only 7 rounds and 85% accuracy
	 */
	public Gun(){
		ammo = 7;
		accuracy = 70;
	}
	/**
	 * Will overload constructor to set values for the rifle
	 * or shotgun
	 * @param accuracy will hold the value associated with the rifle
	 * or shotgun methods
	 * @param ammo will hold the ammunition provided by each weapon which
	 * will be different for each weapon
	 */
	public Gun(int ammo, int accuracy){
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
		if (ammo > 0){
			ammo--;
		}else if(ammo == 0){
			reload();
		}
		return shot;
	}
	/**
	 * This will be a default method for reload
	 * that will reload the clip to the max capacity
	 *  of the weapon
	 */
	public void reload(){
		ammo = AMMO_CAPACITY;
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
