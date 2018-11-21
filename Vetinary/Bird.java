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

public class Bird extends Animal{
	/**
	 * this field will hold the value for the breed of the bird
	 */
	private String breedBird;
	/**
	 * This field will hold the value for the color of the bird
	 */
	private String colorBird;
	/**
	 * this value will hold the size of the bird in an integer
	 */
	private int sizeBird;
	/**
	 * constructor that sets the private fields of this class to default settings
	 * @param petName
	 * @param petAge
	 * @param medicalHistory
	 * @param vaccinations
	 * @param ownerName
	 */
	public Bird(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
	}
	/**
	 * prints the string of the values associated with the private fields of this class
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
