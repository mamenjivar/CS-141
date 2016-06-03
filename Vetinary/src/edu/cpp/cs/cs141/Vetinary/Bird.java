package edu.cpp.cs.cs141.Vetinary;

import java.util.Arrays;

public class Bird extends Animal{
	
	private String breedBird;
	private String colorBird;
	private int sizeBird;

	public Bird(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName) {
		super(petName, petAge, medicalHistory, vaccinations, ownerName);
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
