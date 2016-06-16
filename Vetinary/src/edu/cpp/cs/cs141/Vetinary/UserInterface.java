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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Miguel Menjivar
 */
public class UserInterface {
	
	//private Animal[] pet;
	private Dog[] dog;
	private Fish[] fish;
	private Bird[] bird;
	/**
	 * private field that initializes the Appointment array class to store values
	 */
	private Appointments[] appoint;
	
	Scanner keyboard = new Scanner(System.in);
	/**
	 * This method will be executed by the AppEngine class which will start the program
	 */
	public void menu() {
		this.appoint = createAppointments(appoint);
		this.dog = createDog(dog);
		this.fish = createFish(fish);
		this.bird = createBird(bird);
		int choose = 0;
		System.out.println("Please select from the following list");
		System.out.println("1) List all appointments"
				+ "\n2) Search appointments by owner and date"
				+ "\n3) Search appointments by medical records"
				+ "\n4) Exit Program");
		try{
			choose = keyboard.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Please enter a number, not a letter");
			e.getMessage();
		}
		
		keyboard.nextLine();
		System.out.println();
		
		switch (choose){
		case 1:
			System.out.println("APPOINTMENTS");
			viewAppointments(appoint);
			System.out.println();
			break;
		case 2:
			System.out.print("Enter name of owner or date: ");
			String ownerName = keyboard.nextLine();
			searchAppt(ownerName, appoint);
			System.out.println();
			break;
		case 3:
			System.out.print("Enter Medical record by animal name, owner, or animal kind: ");
			String medRecord = keyboard.nextLine();
			searchMed(medRecord, dog, fish, bird);
			System.out.println();
			break;
		case 4:
			System.out.println("Program will exit");
			System.exit(0);
		}
	}
	
	/**
	 * Searches the appointments by name
	 * @param medRecord
	 * @param appointed
	 */
	private void searchAppt(String ownerAppt, Appointments[] appointed) {
		for (int i = 0; i < appointed.length; i++){
			if(appointed[i].getClient().equals(ownerAppt)){
				System.out.println(appointed[i].toString() + "\n");
			}
		}
		System.out.println("The information provided did not match our records");
	}
	public void searchMed(String nameMed, Animal[] dogs, Animal[] fishs, Animal[] birds){
		for (int i = 0; i < dogs.length; i++){
			if(dogs[i].getPetName().equals(nameMed)){
				System.out.println(dogs[i].toString());
			}
		}
		for (int i = 0; i < fishs.length; i++){
			if(fish[i].getPetName().equals(nameMed)){
				System.out.println(fishs[i].toString());
			}
		}
		for (int i = 0; i < birds.length; i++){
			if(birds[i].getPetName().equals(nameMed)){
				System.out.println(birds[i].toString());
			}
		}
	}
	/**
	 * method creates an object that will initialize an array of dogs
	 * @param pet
	 */
	public Dog[] createDog(Dog[] pet){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pet = new Dog[3];
		pet[0] = new Dog("perro", 25, pet0, pet01, "Jose");
		pet[1] = new Dog("chucho", 31, pet0, pet01, "Carlos");
		pet[2] = new Dog("retreiver", 4, pet0, pet01, "Michaelangelo");
		/*System.out.println(pet[0].toString() + "\n");
		System.out.println(pet[1].toString() + "\n");
		System.out.println(pet[2].toString() + "\n");*/
		return pet; 
	}
	/**
	 * method that creates an object that initializes an array of fishes
	 * @param pescado
	 */
	public Fish[] createFish(Fish[] pescado){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pescado = new Fish[3];
		pescado[0] = new Fish("fishy", 3, pet0, pet01, "Jackson");
		pescado[1] = new Fish("pescao", 99, pet0, pet01, "Tyson");
		pescado[2] = new Fish("Nemo", 67, pet0, pet01, "Polock");
		return pescado;
		
		/*for (int i = 0; i < pescado.length; i++){
			System.out.println(pescado[i].toString() + "\n");
		}*/
	}
	/**
	 * method that creates an object that initializes an array of birds
	 * @param pajaro
	 */
	public Bird[] createBird(Bird[] pajaro){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pajaro = new Bird[3];
		pajaro[0] = new Bird("paloma", 36, pet0, pet01, "Michael");
		pajaro[1] = new Bird("peludo", 20, pet0, pet01, "Zealand");
		pajaro[2] = new Bird("pato", 0, pet0, pet01, "yama");
		
		/*for (int i = 0; i < pajaro.length; i++){
			System.out.println(pajaro[i].toString() + "\n");
		}*/
		return pajaro;
	}
	/**
	 * method that creates an object that initializes an array of appointments
	 * @param setAppointments
	 * @return
	 */
	public Appointments[] createAppointments(Appointments[] setAppointments){
		
		setAppointments = new Appointments[9];
		setAppointments[0] = new Appointments(102116, 1200, "Michaelangelo");
		setAppointments[1] = new Appointments(021016, 1500, "Carlos");
		setAppointments[2] = new Appointments(112516, 2030, "Michael");
		setAppointments[3] = new Appointments(112516, 1550, "Zealand");
		setAppointments[4] = new Appointments(112516, 1750, "Yama");
		setAppointments[5] = new Appointments(112516, 2000, "Jackson");
		setAppointments[6] = new Appointments(112516, 1800, "Tyson");
		setAppointments[7] = new Appointments(112516, 1630, "Polock");
		setAppointments[8] = new Appointments(112516, 1230, "Jose");
		return setAppointments;
	}
	/**
	 * method that will print out all values associated with appointments object
	 * @param appoint
	 */
	public void viewAppointments(Appointments[] appoint){
		this.appoint = appoint;
		int count = 1;
		for (int i = 0; i < appoint.length; i++){
			System.out.println(count + ") " + appoint[i].toString());
			count++;
		}
	}
}
