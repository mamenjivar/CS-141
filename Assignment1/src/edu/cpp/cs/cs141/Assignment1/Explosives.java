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
 * 
 * @author Miguel Menjivar
 *
 */
public class Explosives {
	/**
	 * How much damage was inflicted by the explosive
	 */
	private int damage;
	/**
	 * How fast the explosive traveled
	 * when detonated
	 */
	private int speed;
	/**
	 * The radius shows how wide the damage will
	 * inflict on nearby enemies
	 */
	private int radius;
	/**
	 * The position will tell where the explosive will
	 * be located when it detonates
	 */
	private int position;
	/**
	 * The timer will tell how much time it takes
	 * before the explosive detonates and does damage
	 */
	private int timer;
	/**
	 * Default constructor that sets all values to zero
	 */
	public Explosives(){
		damage = 0;
		speed = 0;
		radius = 0;
		position = 0;
	}
	/**
	 * TODO: do the comments for this javadoc
	 * Constructor
	 * @param damage
	 * @param speed
	 * @param radius
	 * @param position
	 */
	public Explosives(int damage, int speed, int radius, int position){
		this.damage = damage;
		this.speed = speed;
		this.radius = radius;
		this.position = position;
	}
	/**
	 * TODO: skeleton code
	 * @return will return a value how much 
	 * the explosive moved from its current position
	 */
	public int move(){
		return 0;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false whether
	 * the object exploded or not
	 */
	public boolean explode(){
		return false;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false whether the
	 * object was successfully destroyed or not
	 */
	public boolean destroyObstacles(){
		return false;
	}
	/**
	 * Setter for damage
	 * @param damage will set the parameter
	 * equal to the private field damage
	 */
	public void setDamage(int damage){
		this.damage = damage;
	}
	/**
	 * Setter speed
	 * @param speed will set the parameter
	 * equal to the private field damage
	 */
	public void setSpeed(int speed){
		this.speed = speed;
	}
	/**
	 * Setter for radius
	 * @param radius will set the parameter
	 * equal to the private field radius
	 */
	public void setRadius(int radius){
		this.radius = radius;
	}
	/**
	 * Setter for position
	 * @param position will set the parameter
	 * equal to the private field radius
	 */
	public void setPosition(int position){
		this.position = position;
	}
	/**
	 * Setter for timer
	 * @param timer will set the parameter
	 * equal to the private field timer
	 */
	public void setTimer(int timer){
		this.timer = timer;
	}
	/**
	 * Getter for damage
	 * @return will return the value of the
	 * private field damage
	 */
	public int getDamage(){
		return damage;
	}
	/**
	 * Getter for Speed
	 * @return will return the value
	 * of the private field speed 
	 */
	public int getSpeed(){
		return speed;
	}
	/**
	 * Getter for radius
	 * @return will return value
	 * for private field radius
	 */
	public int getRadius(){
		return radius;
	}
	/**
	 * Getter for position
	 * @return will return value for 
	 * private field position
	 */
	public int getPosition(){
		return position;
	}
	/**
	 * Getter for timer
	 * @return will return value for
	 * private field timer
	 */
	public int getTimer(){
		return timer;
	}
}
