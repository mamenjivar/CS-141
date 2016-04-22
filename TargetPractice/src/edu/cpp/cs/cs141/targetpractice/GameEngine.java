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
 * takes care of most of the game logic
 * create array of targets, create gun, have methods
 * that shoot weapons at targets, 
 * tells that will show you when you have hit all targets
 * 
 */
public class GameEngine {
	private int targets = 5;
	/**
	 * This method will be in charge of creating the weapons
	 *  used to shoot at the targets
	 *  
	 *  Need to create the targets and how to make it hit
	 */
	
	public void gunCreation(String gun){
		Random dice = new Random();
		
		if (gun.equals("pistol")){
			Gun pistol = new Gun();
			//Random dice = new Random();
			System.out.println("This is the gun class");
			for (int i = 0; i < 5; i++){
				int number = dice.nextInt(10) + 1;
				System.out.println("ammunition: " + pistol.getAmmo());
				System.out.println("The random number: " + number);
				pistol.shoot(number);
			}
			
		}
		else if(gun.equals("rifle")){
			Gun rifle = new Gun(9, 8);
			System.out.println("This is the rifle class");
			for (int i = 0; i < 5; i++){
				int number = dice.nextInt(10) + 1;
				System.out.println("ammunition: " + rifle.getAmmo());
				System.out.println("The random number: " + number);
				rifle.shoot(number);
			}
			
		}
		else if(gun.equals("shotgun")){
			Gun shotgun = new Gun(7, 5);
			System.out.println("This is the shotgun class");
			for (int i = 0; i < 5; i++){
				int number = dice.nextInt(10) + 1;
				System.out.println("ammunition: " + shotgun.getAmmo());
				System.out.println("The random number: " + number);
				shotgun.shoot(number);
			}
		}
		else
			System.out.println("There is no known weapon");
		//pistol.getAmmo();
	}
	public void targetCreation(){
		int[] icons = {1, 2, 3, 4, 5};
	}
	public void hitTargets(){
		
	}
}
