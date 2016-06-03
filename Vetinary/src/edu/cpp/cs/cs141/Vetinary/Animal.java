/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

/**
 * @author User
 *
 */
public class Animal {
	private String petName;
	private int petAge;
	private String[] medicalHistory;
	private String[] vaccinations;
	private String ownerName;
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
