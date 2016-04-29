/**
 * Assignment #3
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

import java.util.Random;

/**
 * @author Miguel Menjivar
 * 
 * An abstract class representing the gun objects
 * Each type of gun is represented by a respective subclass
 * that is a subtype of the Gun class
 */
public abstract class Gun {
	public abstract void shoot();
	public abstract void reload();

	public Gun(){
		
	}
}
