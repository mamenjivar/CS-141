/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #3
 *
 * Escape the Dungeon
 *
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.EscapetheDungeon;

/**
 * @author Miguel Menjivar
 * 
 * An interface that represents the active agents in the game.
 * The player and enemies are represented with classes that 
 * implements the ActiveAgent interface.
 */
public class ActiveAgents {
	/**
	 * The value is made 5 in order to make sure that all enemies are
	 * going to have only 5 health
	 */
	private final int MAX_HEALTH_ENEMY = 5;
	/**
	 * The user health is set to 20 in order for the player
	 * to survive the journey through the cave
	 */
	private final int MAX_HEALTH_USER = 20;
	
	
}
