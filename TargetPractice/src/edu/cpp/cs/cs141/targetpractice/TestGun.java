/**
 * 
 */
package edu.cpp.cs.cs141.targetpractice;

import java.util.Random;

/**
 * @author Miguel Menjivar
 * This main class will test to make sure that
 * the Gun class works properly
 */
public class TestGun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gun pistol = new Gun();
		Random dice = new Random(100);
		//for(int i = 5; i < 0; i--){
			System.out.println(pistol.getAmmo());
			pistol.shoot(dice);
			System.out.println(pistol.getAmmo());
			pistol.shoot(dice);
			System.out.println(pistol.getAmmo());
			pistol.reload();
			System.out.println(pistol.getAmmo());
			
		//}
	}

}
