/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #4
 *
 * Vetinary program
 *
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.Vetinary;

import java.util.Arrays;

/**
 * 
 * @author Miguel Menjivar
 *
 */
public class Fish extends Animal{
	/**
	 * this string will hold value for breed of the fish
	 */
	private String breedFish;
	/**
	 * this value will hold what color the fish will be
	 */
	private String colorFish;
	/**
	 * this field will hold the value for the size of the fish
	 */
	private int sizeFish;
	/**
	 * constructor that takes in an argument and sets the vales inside this class
	 * @param petName
	 * @param petAge
	 * @param medicalHistory
	 * @param vaccinations
	 * @param ownerName
	 */
	public Fish(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
	}
	/**
	 * default constructor that sets all the values to their default settings
	 */
	public Fish(){
		super();
	}
	/**
	 * prints a string that shows user what the values are associated with
	 */
	public String toString(){
		String str = "Pet name: " + getPetName()
				+ "\nPet age: " + getPetAge()
				+ "\nMedical History: " + Arrays.toString(getMedicalHistory())
				+ "\nVaccinations: " + Arrays.toString(getVaccinations())
				+ "\nOwner name: " + getOwnerName();
		return str;
	}
}
