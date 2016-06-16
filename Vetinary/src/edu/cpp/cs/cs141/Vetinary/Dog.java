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

public class Dog extends Animal{
	/**
	 * this field will be in charge of tracking what breed is each pet
	 */
	private String breedDog;
	/**
	 * color of the dog is another field that will be utilized to identify each pet
	 */
	private String colorDog;
	private int sizeDog;
	
	/**
	 * constructor that sets all the values inside the argument to those values in the superclass
	 * @param petName
	 * @param petAge
	 * @param medicalHistory
	 * @param vaccinations
	 * @param ownerName
	 */
	public Dog(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
	}
	/**
	 * default constructor that sets all the values to their default settings
	 */
	public Dog(){
		super();
	}
	/**
	 * to string method that prints out what the values are associated with the each field
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
