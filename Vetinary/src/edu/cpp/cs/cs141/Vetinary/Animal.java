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

/**
 * @author Miguel Menjivar
 *
 */
public class Animal {
	/**
	 * field that will hold value for pet's name
	 */
	private String petName;
	/**
	 * private field that will hold value for pet's age
	 */
	private int petAge;
	/**
	 * private array that will hold medical history of the pet
	 */
	private String[] medicalHistory;
	/**
	 * private array that will hold Strings of vaccinations of the pet
	 */
	private String[] vaccinations;
	/**
	 * this private field will hold the value of the pet's owner name
	 */
	private String ownerName;
	/**
	 * this private field will hold value for the appointments for each pet
	 */
	private Appointments appointment;

	/**
	 * Constructor that sets default field values
	 */
	public Animal(){
		setPetName(null);
		setPetAge(0);
		setMedicalHistory(null);
		setVaccinations(null);
		setOwnerName(null);
		setAppointment(null);
	}
	/**
	 * constructor that sets values to fields
	 * @param petName
	 * @param petAge
	 * @param medicalHistory
	 * @param vaccinations
	 * @param ownerName
	 */
	public Animal(String petName, int petAge, String[] medicalHistory, String[] vaccinations, String ownerName){
		this.petName = petName;
		this.petAge = petAge;
		this.medicalHistory = medicalHistory;
		this.vaccinations = vaccinations;
		this.ownerName = ownerName;
	}
	/**
	 * setters and getters for all of the fields of this class
	 * @return
	 */
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String[] getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String[] medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String[] getVaccinations() {
		return vaccinations;
	}

	public void setVaccinations(String[] vaccinations) {
		this.vaccinations = vaccinations;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Appointments getAppointment() {
		return appointment;
	}
	
	public void setAppointment(Appointments appointment) {
		this.appointment = appointment;
	}
}
