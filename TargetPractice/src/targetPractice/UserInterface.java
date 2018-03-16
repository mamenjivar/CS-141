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
 * user interaction: print statements
 * keyboard input
 */
public class UserInterface {
	Scanner keyboard = new Scanner(System.in);
	/**
	 * This is the user interface where most of the gaming interaction takes place.
	 * It is also the introduction where you can choose your weapon of choice before the game begins 
	 */
	public void Intro(){
		GameEngine test = new GameEngine();
		System.out.println("Welcome to Target Practice");
		System.out.println("Please choose: pistol, shotgun, rifle");
		String weapon = keyboard.nextLine();
		gameTime(test.gunCreation(weapon));

	}
	/**
	 * The gameTime method is in charge of prompting the user to shoot
	 * or quit the game. This method is the main interaction that will
	 * occur throughout the game.
	 * 
	 * @param weapon The parameter is used when the Gun class is instantiated
	 * with the specific weapon that it was called with
	 */
	public void gameTime(Gun weapon){
		char letter = 0;
		Random dice = new Random();
		Target bullseye = new Target();
		bullseye.targetCreation();
		
		System.out.println("Enter s to shoot or q to quit");
		do{
			int number = dice.nextInt(100) + 1;
			System.out.println("SHOT: " + weapon.getAmmo() + " rounds remaining");
			bullseye.hitTargets(weapon.shoot(number));
			
			System.out.println("Enter s to shoot or q to quit");
			String name = keyboard.nextLine();
			letter = name.charAt(0);
			
		} while(letter == 's' || letter == 'S');
	}
}