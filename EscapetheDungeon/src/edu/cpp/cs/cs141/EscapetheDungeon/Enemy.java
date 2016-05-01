/**
 * 
 */
package edu.cpp.cs.cs141.EscapetheDungeon;
import java.util.Random;
/**
 * @author Miguel Menjivar
 *
 *
 * This class will inherit the values from ActiveAgents class
 * This class will solely focus on the attributes of the enemy
 */
public class Enemy extends ActiveAgents{
	private int handGun = 50;
	//HandGun pistol = new HandGun();
	Rifle rifle = new Rifle();
	Random weapon = new Random();
	
	private int health = 5;
	
	public void weapon(){
		int choose = weapon.nextInt(100) + 1;
		
		if(choose < handGun){
			//pistol.shoot();
		}
		else if(choose > handGun){
			rifle.shoot();
		}
	}
	public void Hit(){
		System.out.println("The enemy has been hit");
		setHealth(health);
		System.out.println("The enemy has " + health + " health points remaining");
	}
	public void setHealth(int health){
		this.health = health;
		this.health--;
	}
	public int getHealth(){
		return health;
	}
}
