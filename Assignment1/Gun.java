/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 * 
 * Programming Assignment #1
 * 
 * Skeleton for first person shooter video game
 */
package edu.cpp.cs.cs141.Assignment1;

/**
 * @author Miguel Menjivar
 *
 */
public class Gun {
	/**
	 * This will display how accurate the weapon is when fired
	 */
	private double accuracy;
	/**
	 * This will keep track how much ammunition is left
	 * when the weapon is fired
	 */
	private int ammo;
	/**
	 * Reload time will show how much time it will take
	 * for the weapon to have full ammunition
	 */
	private int reloadTime;
	/**
	 * Damage will keep track how much pain the 
	 * weapon will inflict on the enemy
	 */
	private int damage;
	/**
	 * default constructor that sets all values to zero
	 */
	public Gun(){
		accuracy = 0.0;
		ammo = 0;
		reloadTime = 0;
		damage = 0;
	}
	/**
	 * Constructor 
	 * @param accuracy
	 * @param ammo
	 * @param reloadTime
	 * @param damage
	 */
	public Gun(double accuracy, int ammo, int reloadTime, int damage){
		this.accuracy = accuracy;
		this.ammo = ammo;
		this.reloadTime = reloadTime;
		this.damage = damage;
	}
	/**
	 * TODO: this is skeleton code
	 * @return will return a value that
	 * whether the weapon shot or not
	 */
	public boolean shoot(){
		return false;
	}
	/**
	 * TODO: skeleton code
	 * @return will return a value that resets ammunition counter
	 * when it runs out
	 */
	public int reload(){
		return 0;
	}
	/**
	 * Setter for Accuracy
	 * @param accuracy will assign the value
	 * to the private double Accuracy
	 */
	public void setAccuracy(double accuracy){
		this.accuracy = accuracy;
	}
	/**
	 * Setter for Ammo
	 * @param ammo will assign the value equal to 
	 * the private integer ammo
	 */
	public void setAmmo(int ammo){
		this.ammo = ammo;
	}
	/**
	 * Setter for Reload Time
	 * @param reloadTime will assign the value equal to
	 * the private integer reload time
	 */
	public void setReloadTime(int reloadTime){
		this.reloadTime = reloadTime;
	}
	/**
	 * Setter for Damage
	 * @param parameter damage will assign the variable 
	 * to the private integer damage 
	 */
	public void setDamage(int damage){
		this.damage = damage;
	}
	/**
	 * Getter for Accuracy
	 * @return will return value 
	 * associated with Accuracy
	 */
	public double getAccuracy(){
		return accuracy;
	}
	/**
	 * Getter for ammo
	 * @return will return value
	 * associated with ammo
	 */
	public int ammo(){
		return ammo;
	}
	/**
	 * Getter for Reload Time
	 * @return will return the value
	 * associated with relaod time
	 */
	public int getReloadTime(){
		return reloadTime;
	}
	/**
	 * Getter for damage
	 * @return will return the value
	 * for damage
	 */
	public int getDamage(){
		return damage;
	}
}
