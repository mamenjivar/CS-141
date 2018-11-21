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
public class Appointments extends Animal{
	/**
	 * The date of the appointment in format
	 * MMDDYY no spaces in between
	 */
	private int date;
	/**
	 * The time of the appointment in military time
	 */
	private int time;
	/**
	 * It is the same compared to the name
	 * of the pets owner
	 */
	private String client;
	/**
	 * a boolean that will show true or false whether the appointment is oustanding or not
	 */
	private boolean appointmentStatus;
	/**
	 * default constructor that will set the values to their default settings
	 */
	public Appointments(){
		setDate(0);
		setTime(0);
		setClient(null);
		appointmentStatus = false;
	}
	/**
	 * constructor that takes in values that will set the private fields 
	 * @param date
	 * @param time
	 * @param client
	 */
	public Appointments(int date, int time, String client){
		this.date = date;
		this.time = time;
		this.client = client;
	}
	/**
	 * the setters and getters for the private fields of this class
	 * @return
	 */
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	public String toString(){
		String str = "Date: " + getDate()
					+"\tTime: " + getTime()
					+"\tClient: " + getClient();
		return str;
	}
}
