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
import java.util.Scanner;
/**
 * @author Miguel Menjivar
 * user interaction: print statements
 * keyboard input
 */
public class UserInterface {
	Scanner keyboard = new Scanner(System.in);
	public void Intro(){
		System.out.println("Welcome to Target Practice");
		System.out.println("Please choose: pistol, shotgun, rifle");
		String weapon = keyboard.nextLine();
		System.out.println("Enter s to shoot, or q to quit");
		String choice = keyboard.nextLine();
		Gun pistol = new Gun();
		System.out.println(pistol.getAmmo());
		
		
	}
	public String toString(){
		//System.out.println("Welcome to the target practice");
		String str = "";
		return str;
	}

}
