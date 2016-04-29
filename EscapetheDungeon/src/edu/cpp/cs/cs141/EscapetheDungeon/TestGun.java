/**
 * 
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

import java.util.Scanner;

/**
 * @author Miguel
 *
 */
public class TestGun {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Shotgun test = new Shotgun();
		HandGun pistol = new HandGun();
		Rifle rifle = new Rifle();
		//Gun amg = new HandGun();
		//test.shoot();
		System.out.println("Please choose your weapon");
		String weapon = keyboard.nextLine();
		
		//change if else orientation to enum switch statement
		if(weapon.equals("handgun")){
			pistol.shoot();
		}
		else if(weapon.equals("shotgun")){
			test.shoot();
		}
		else if (weapon.equals("rifle")){
			rifle.shoot();
		}
	}
}
