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
import java.util.Scanner;
/**
 * @author Miguel Menjivar
 * 
 * The entity in charge of the interactive part of the program:
 * displaying information and obtaining input from the user
 */
public class UserInterface {
	/**
	 * This will be the main method that will be commanding all
	 * other classes to communicate with each other to make the program work
	 */
	public static enum Arma { HANDGUN, SHOTGUN, RIFLE}
	public void intro(){
		
		HandGun pistola = new HandGun();
		Gun weaponType = null;
		Enemy enemy = new Enemy();
		Player player = new Player();
		pistola.setPlayer(player);
		pistola.setEnemy(enemy);
		
		Scanner keyboard = new Scanner(System.in);
		char letter = 0;
		System.out.println("Hello to the game");
		System.out.println("You will be taking 10 steps to exit the cave");
		System.out.println("Choose your weapon: ");
		String weapon = keyboard.nextLine();
		switch (Arma.valueOf(weapon)){
			case HANDGUN:
				System.out.println("This is the pistol class");
				weaponType = new HandGun();
				break;
			case SHOTGUN:
				System.out.println("This is the shotgun class");
				break;
			case RIFLE:
				System.out.println("This is the rifle class");
				break;
		}
		
		for (int i = 1; i <= 10; i++){
			do{
				pistola.shoot(player, enemy);
				System.out.println("shoot or run away\n");
				String name = keyboard.nextLine();
				letter = name.charAt(0);
				if (enemy.getHealth() == 0){
					enemy.heal();
					System.out.println("The enemy has been defeated");
					letter = 'q';
				}
			}while(letter == 's' || letter == 'S');
			
			System.out.println("\n You took " + i + " step(s).\n");
		}
		System.out.println("You have made it out of the dungeon!");
		keyboard.close();
	}
}
