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

import java.util.Random;
import java.util.Scanner;

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
	/**
	 * This integer will hold the final amount of 5 that will be used to reload the
	 * ammunition when it depletes
	 */
	private static final int TARGET_NUMBERS = 5;
	/**
	 * This private field will hold the value for the number of targets when the game begins
	 */
	private int target;
	/**
	 * This method will be in charge of creating the weapons
	 *  used to shoot at the targets
	 *  
	 *  gunCreation method creates the gun objects ranging from
	 *  rifles, hand guns, and shotguns
	 *  each have their own attributes
	 */
	
	Target bullseye = new Target();
	
	public void gunCreation(String gun){
		Scanner keyboard = new Scanner(System.in);
		bullseye.targetCreation();
		//Gun shotgun = new Gun(7, 5);
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
			//if (choice.equals("s"))
			for(int i = 0; i < 5; i++){
				int number = dice.nextInt(10) + 1;
				System.out.println("ammunition: " + rifle.getAmmo());
				System.out.println("The random number: " + number);
				rifle.shoot(number);
			}
		}
		else if(gun.equals("shotgun")){
			char letter = 0;
			Gun shotgun = new Gun(6, 5);
			Target bullseye = new Target();
			System.out.println("This is the shotgun class");
			bullseye.targetCreation();
			System.out.println("Enter s to shoot or q to quit");
			do{
				for(int i = 2; i > 0; i--){
					int number = dice.nextInt(10) + 1;
					System.out.println("ammunition: " + shotgun.getAmmo());
					bullseye.hitTargets(shotgun.shoot(number));
					
					System.out.println("Enter s to shoot or q to quit");
					String name = keyboard.nextLine();
					letter = name.charAt(0);
				}
			} while(letter == 's');
		}
		else
			System.out.println("There is no known weapon");
	}
}
