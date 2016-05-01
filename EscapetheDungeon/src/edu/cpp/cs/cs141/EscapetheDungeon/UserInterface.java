/**
 * 
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
	public void intro(){
		HandGun pistola = new HandGun();
		Scanner keyboard = new Scanner(System.in);
		char letter = 0;
		System.out.println("Hello to the game");
		System.out.println("You will be taking 10 steps to exit the cave");
		System.out.println("Choose your weapon: PISTOL ONLY FOR TESTING PURPOSE");
		//String weapon = keyboard.nextLine();
		do{
			pistola.shoot();
			pistola.enemyShoot();
			System.out.println("shoot or run away");
			String name = keyboard.nextLine();
			letter = name.charAt(0);
		}while(letter == 's' || letter == 'S');
	}
}
