/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Miguel Menjivar
 *
 */
public class UserInterface {
	
	private Animal[] pet;
	private Appointments[] appoint;
	
	Scanner keyboard = new Scanner(System.in);

	public void menu() {
		this.appoint = createAppointments(appoint);
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
			System.out.print("Enter owner name: ");
			String ownerName = keyboard.nextLine();
			searchMed(ownerName, appoint);
			System.out.println();
			break;
		case 3:
			System.out.print("Enter Medical record number: ");
			String medRecord = keyboard.nextLine();
			System.out.println();
			break;
		case 4:
			System.out.println("Program will exit");
			System.exit(0);
		}
	}
	
	private void searchMed(String medRecord, Appointments[] appointed) {
		for (int i = 0; i < appointed.length; i++){
			//System.out.println(appointed[i].getClient());
			if(appointed[i].getClient().equals(medRecord)){
				System.out.println(appointed[i].toString());
			}
		}
	}

	public void createDog(Animal[] pet){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pet = new Dog[3];
		pet[0] = new Dog("perro", 25, pet0, pet01, "Jose");
		pet[1] = new Dog("chucho", 31, pet0, pet01, "Carlos");
		pet[2] = new Dog("retreiver", 4, pet0, pet01, "Michaelangelo");
		System.out.println(pet[0].toString() + "\n");
		System.out.println(pet[1].toString() + "\n");
		System.out.println(pet[2].toString() + "\n");
	}
	
	public void createFish(Animal[] pescado){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pescado = new Fish[3];
		pescado[0] = new Fish("fishy", 3, pet0, pet01, "Jackson");
		pescado[1] = new Fish("pescao", 99, pet0, pet01, "Tyson");
		pescado[2] = new Fish("Nemo", 67, pet0, pet01, "Polock");
		
		for (int i = 0; i < pescado.length; i++){
			System.out.println(pescado[i].toString() + "\n");
		}
	}
	public void createBird(Animal[] pajaro){
		String[] pet0 = {"aids", "hepatitis"};
		String[] pet01 = {"vax1", "vax2"};
		pajaro = new Bird[3];
		pajaro[0] = new Bird("paloma", 36, pet0, pet01, "Michael");
		pajaro[1] = new Bird("peludo", 20, pet0, pet01, "Zealand");
		pajaro[2] = new Bird("pato", 0, pet0, pet01, "yama");
		
		for (int i = 0; i < pajaro.length; i++){
			System.out.println(pajaro[i].toString() + "\n");
		}
	}

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
	
	public void viewAppointments(Appointments[] appoint){
		this.appoint = appoint;
		int count = 1;
		for (int i = 0; i < appoint.length; i++){
			System.out.println(count + ") " + appoint[i].toString());
			count++;
		}
	}
	
	/**
	 * setters and getters for pet and appointment
	 * @return
	 */	
}
