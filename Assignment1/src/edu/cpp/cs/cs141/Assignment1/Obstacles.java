/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 * 
 * Programming Assignment #1
 * 
 * Skeleton for first person shooter video game
 */
package edu.cpp.cs.cs141.Assignment1;

/**
 * @author Miguel Menjivar
 *
 */
public class Obstacles {
	/**
	 * This variable will decide whether an object is
	 * breakable or not
	 */
	private boolean breakable;
	/**
	 * This variable will tell players whether the object
	 * is 
	 */
	private boolean collideable;
	/**
	 * Default constructor that sets boolean values to false
	 */
	public Obstacles(){
		breakable = false;
		collideable = false;
	}
	/**
	 * TODO: finish commenting
	 * constructor
	 * @param breakable
	 * @param collideable
	 */
	public Obstacles(boolean breakable, boolean collideable){
		this.breakable = breakable;
		this.collideable = collideable;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false if the player
	 * Successfully breaks the object
	 */
	public boolean Broken(){
		return false;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false if the object
	 * is capable of interaction by the player
	 */
	public boolean interaction(){
		return false;
	}
	/**
	 * Setter for Breakable
	 * @param breakable sets the parameter value equal 
	 * to the field value of breakable
	 */
	public void setBreakable(boolean breakable){
		this.breakable = breakable;
	}
	/**
	 * Setter for collideable
	 * @param collideable will set the parameter value equal
	 * to the private field value of collideable
	 */
	public void setCollideable(boolean collideable){
		this.collideable = collideable;
	}
	/**
	 * Getter for breakable
	 * @return will return the value
	 * private field breakable
	 */
	public boolean getBreakable(){
		return breakable;
	}
	/**
	 * Getter for collideable
	 * @return will return value associated
	 * with the private field collideable
	 */
	public boolean getCollideable(){
		return collideable;
	}
}
