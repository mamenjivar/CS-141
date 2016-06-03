/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

import java.util.Arrays;

public class Dog extends Animal{

	private String breedDog;
	private String colorDog;
	private int sizeDog;
	
	/**
	 * 
	 * @param petName
	 * @param petAge
	 * @param medicalHistory
	 * @param vaccinations
	 * @param ownerName
	 */
	public Dog(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
	}
	public Dog(){
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
