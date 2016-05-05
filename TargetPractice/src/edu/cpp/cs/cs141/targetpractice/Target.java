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

/**
 * @author Miguel Menjivar
 * 
 * Target object
 * has field that says hit or miss
 *
 */
public class Target {
	private static final int TARGET_NUMBERS = 5;

	/**
	 * The private field target will hold the value for the targets that
	 * the weapons will shoot at
	 */
	private int target;
	/**
	 * The method targetCreation will create the five different
	 * targets that the weapons will shoot at when the game begins
	 */
	public void targetCreation(){
		target = 5;
	}
	/**
	 * hitTargets method will keep track when the weapon successfully
	 * hits the target
	 * @param name the parameter name comes from the shoot method in the Gun class
	 */
	public void hitTargets(boolean name){
		if (name == true && target >= 1) {
			target--;
			System.out.println("HIT: " + target + " target(s) still remaining \n");
			
		}
		else if(name == true && target == 0){
			System.out.println("All targets are hit");
			System.exit(0);
		}
		else
			System.out.println("MISSED: " + target + " target(s) remain\n");
	}
	/**
	 * This method is used to reload the targets if the user wants to
	 */
	public void reloadTargets(){
		target = TARGET_NUMBERS;
	}
	/**
	 * Setter for target method
	 * sets value equal to the private field values
	 */
	public void setTarget(int target){
		this.target = target;
	}
	/**
	 * getter for private field
	 * @return will return the value of how much targets throughout the game
	 */
	public int getTarget(){
		return target;
	}

}
