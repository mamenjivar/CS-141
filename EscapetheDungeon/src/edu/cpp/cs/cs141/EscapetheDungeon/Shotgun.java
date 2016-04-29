/**
 * 
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
	private int accuracy = 40;
	
	private int damage = 5;
	private int ammo = 5;
	
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

	@Override
	public void reload() {
		ammo = 5;		
	}
}
