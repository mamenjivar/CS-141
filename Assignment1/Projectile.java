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
public class Projectile {
	/**
	 * The speed integer will help show how fast the 
	 * projectile is moving towards its target
	 */
	private int speed;
	/**
	 * The damage integer will track how much damage
	 * the projectile will inflict on its target
	 */
	private int damage;
	/**
	 * The position of the projectile will tell in what direction
	 * the projectile will be heading
	 */
	private double position;
	/**
	 * Default constructor that sets all values to zero
	 */
	public Projectile(){
		speed = 0;
		damage = 0;
		position = 0.0;
	}
	/**
	 * Constructor
	 * @param speed
	 * @param damage
	 * @param position
	 */
	public Projectile(int speed, int damage, double position){
		this.speed = speed;
		this.damage = damage;
		this.position = position;
	}
	/**
	 * TODO: skeleton code
	 * @return Will return how much the projectile has moved
	 * when it was released
	 */
	public int move(){
		return 0;
	}
	/**
	 * TODO: skeleton code
	 * @return will return true or false whether
	 * the projectile has successfully collided with its target
	 */
	public boolean collide(){
		return false;
	}
	/**
	 * Setter for speed integer
	 * @param speed will set the value
	 * with the private integer speed of this class
	 */
	public void setSpeed(int speed){
		this.speed = speed;
	}
	/**
	 * Setter for damage integer
	 * @param damage will set the value
	 * of damage with the private field damage
	 */
	public void setDamage(int damage){
		this.damage = damage;
	}
	/**
	 * Setter for position double
	 * @param position will set the value of
	 * position with the private field position in this class
	 */
	public void setPosition(double position){
		this.position = position;
	}
	/**
	 * Getter for speed integer
	 * @return will return the private
	 * field integer speed
	 */
	public int getSpeed(){
		return speed;
	}
	/**
	 * Getter for damage integer
	 * @return will return the private
	 * field integer damage from this class
	 */
	public int getDamage(){
		return damage;
	}
	/**
	 * Getter for Position double
	 * @return returns private field value
	 * of position from this class
	 */
	public double getPosition(){
		return position;
	}
}
