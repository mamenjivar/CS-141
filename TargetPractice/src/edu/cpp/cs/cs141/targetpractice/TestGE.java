/**
 * 
 */
package edu.cpp.cs.cs141.targetpractice;

import java.util.Scanner;

/**
 * @author Miguel
 *
 */
public class TestGE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("choose weapon: " );
		String weapon = keyboard.nextLine();
		GameEngine test = new GameEngine();
		//test.gunCreation(weapon);
		//for (int i = 0; i < 3; i++){
		//test.targetCreation();
		//test.hitTargets(true);
		//test.hitTargets(false);
		//test.hitTargets(true);
		//test.hitTargets(false);
		//}
		keyboard.close();
		
	}

}
