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
 * hand gun class will inherit the values
 * associated with the Gun class
 */
public class HandGun extends Gun{
	
	UserInterface UI = new UserInterface();
	/**
	 * Will instantiate the random class
	 * for when the hand gun is a hit or a miss
	 */
	Random rand = new Random();
	/**
	 * The accuracy of the pistol
	 */
	private int accuracy = 75;
	/**
	 * The max ammunition of the pistol
	 */
	private int ammo = 15;
	/**
	 * Created the max ammo for the second pistol that
	 * will be used for the enemy when it shoots at the player
	 */
	private int ammo2 = 15;
	/**
	 * Creates the enemy class to be used to attack the enemy when the weapon
	 * is fired
	 */
	Enemy enemy = new Enemy();
	/**
	 * This creates the player class to be used when the enemy attacks the player
	 * to take away damage
	 */
	Player player = new Player();
	/**
	 * This method is created in order for the enemy to have a chance to shoot at
	 * the player and inflict damage
	 */
	public void shoot(Player player, Enemy enemy){
		int create = rand.nextInt(100) + 1;
		if (create < accuracy){
			player.Hit();
			enemy.Hit();
		}
		else
			System.out.println("It was a miss");
	ammo2--;
	System.out.println("Enemy has: " + ammo2 + " rounds left");
	}
	/**
	 * The method shoot will be used when the user or enemy
	 * fires the pistol and checks whether it was a hit or a miss
	 */
/*	public void playerShoot(){
		int number = rand.nextInt(100) + 1;
		if (number < accuracy){
			System.out.println("It was a hit");
			enemy.Hit();
		}
		else
			System.out.println("It was a miss");
		ammo--;
		System.out.println("You have: " + ammo + " rounds left");
	}*/
	/**
	 * The reload method is used to reload the pistol to max capacity	
	 */
	public void reload(){
		ammo = 15;
	}
	public void setPlayer(Player player){
		this.player = player;
	}
	public void setEnemy(Enemy enemy){
		this.enemy = enemy;
	}
}
