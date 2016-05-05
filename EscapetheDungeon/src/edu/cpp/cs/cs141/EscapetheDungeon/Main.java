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

/**
 * @author Miguel Menjivar
 * 
 * The class where main resides, 
 * from which the program is launched
 */
public class Main {

	/**
	 * This is the main program and will call the User Interface class
	 * and make the whole program run as a whole
	 */
	public static void main(String[] args) {
		UserInterface test = new UserInterface();
		test.intro();
	}

}
