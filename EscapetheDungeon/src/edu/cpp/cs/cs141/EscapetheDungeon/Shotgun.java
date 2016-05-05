/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #3
 *
 * Escape the Dungeon
 *
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

import java.util.Random;

/**
 * @author Miguel Menjivar
 *
 * shotgun class will inherit the values
 * by the gun class
 */
public class Shotgun extends Gun{
	/**
	 * The accuracy of this weapon that will affect the outcome
	 * when the weapon is used
	 */
	private int accuracy = 40;
	/**
	 * The damage that is necessary to inflict damage to both the user or
	 * the enemy
	 */
	private int damage = 5;
	/**
	 * the ammunition is the max capacity of this weapon
	 */
	private int ammo = 5;
	/**
	 * The shoot method is used to show whether the weapon is
	 * a hit or a miss
	 */
	public void shoot(){
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;
		if (number < accuracy){
			System.out.println("It was a hit");
		}
		else
			System.out.println("It was a miss");
		ammo--;
		System.out.println("You have: " + ammo + " rounds left");
	}
	/**
	 * The reload method is used to reload the weapon when the reload power up is acquired
	 * after killing the enemy
	 */
	@Override
	public void reload() {
		ammo = 5;		
	}
}
