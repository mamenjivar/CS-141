/**
 * 
 */
package edu.cpp.cs.cs141.targetpractice;

import java.util.Random;

/**
 * @author Miguel Menjivar
 * 
 * This main class will test to make sure that
 * the Gun class works properly
 */
public class TestGun {

	/**
	 * The reload method and the shooting method both work
	 * just need to find out how to test whether the object
	 * hits its target or misses it
	 */
	public static void main(String[] args) {
		Gun pistol = new Gun();
		Random dice = new Random();
		//int number = dice.nextInt(10) + 1;
		for(int i = 0; i < 5; i++){
			int number = dice.nextInt(10) + 1;
			System.out.println("ammunition: " + pistol.getAmmo());
			System.out.println("The random number: " + number);
			pistol.shoot(number);
			//System.out.println(pistol.getAmmo());
			//System.out.println(number);
			//pistol.shoot(number);
			//System.out.println(pistol.getAmmo());
			//System.out.println(number);
			//pistol.reload();
			//System.out.println(pistol.getAmmo());
			
			
			
		}
		//for(int i = 0; i < 10; i++){
			//int number = dice.nextInt(10) +1;
		//}
	}

}
