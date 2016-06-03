/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

import java.util.Arrays;

/**
 * 
 * @author User
 *
 */
public class Fish extends Animal{
	private String breedFish;
	private String colorFish;
	private int sizeFish;
	
	public Fish(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
	}
	public Fish(){
		super();
	}
	public String toString(){
		String str = "Pet name: " + getPetName()
				+ "\nPet age: " + getPetAge()
				+ "\nMedical History: " + Arrays.toString(getMedicalHistory())
				+ "\nVaccinations: " + Arrays.toString(getVaccinations())
				+ "\nOwner name: " + getOwnerName();
		return str;
	}
}
