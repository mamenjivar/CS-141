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
 * This rifle class will inherit the values
 * from the superclass Gun
 */
public class Rifle extends Gun{
	private int accuracy = 65;
	private int damage = 2;
	private int ammo = 10;
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
	 * This is the method that is automatically created when the Gun class is abstract
	 */
	@Override
	public void reload() {
		ammo = 10;		
	}
}
