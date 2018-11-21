/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #4
 *
 * Vetinary program
 *
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.Vetinary;

/**
 * @author Miguel Menjivar
 *
 * Will be in charge of all the heavy work of this program
 */
public class AppEngine {
	UserInterface UI = new UserInterface();
	/**
	 * this method is called from the main method and initalizes the game
	 */
	public void initialize() {
		boolean menuLoop = true;
		while(menuLoop){
			UI.menu();
		}
	}

}
