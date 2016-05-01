/**
 * 
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

import java.util.Random;

/**
 * @author Miguel Menjivar
 *
 * hand gun class will inherit the values
 * associated with the Gun class
 */
public class HandGun extends Gun{
	Random rand = new Random();
	private int accuracy = 75;
	
	//private int damage = 1;
	
	private int ammo = 15;
	private int ammo2 = 15;
	Enemy enemy = new Enemy();
	Player player = new Player();
	public void enemyShoot(){
		int create = rand.nextInt(100) + 1;
		if (create < accuracy){
			System.out.println("It was a hit");
			player.Hit();
		}
		else
			System.out.println("It was a miss");
	ammo2--;
	System.out.println("Enemy has: " + ammo2 + " rounds left");
	}
	
	public void shoot(){
		int number = rand.nextInt(100) + 1;
		if (number < accuracy){
			System.out.println("It was a hit");
			enemy.Hit();
		}
		else
			System.out.println("It was a miss");
		ammo--;
		System.out.println("You have: " + ammo + " rounds left");
	}
	

	
	public void reload(){
		ammo = 15;
	}
}
