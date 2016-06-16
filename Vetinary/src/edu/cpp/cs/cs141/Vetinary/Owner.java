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
public class Owner extends Animal{
	/**
	 * A private field that holds value for the pet's owner name
	 */
	private String ownerName;
	/**
	 * this field holds the value for phone numbers by the owner of the pet
	 */
	private int ownerPhoneNumber;
	/**
	 * this field wil hold the address where the owner will be located
	 */
	private String ownerAddress;
	/**
	 * default constructor that sets values to their default settings
	 */
	public Owner(){
		setName(null);
		setPhoneNumber(0);
		setAddress(null);
	}
	/**
	 * constructor that sets the values in the argument to those values in this class
	 * @param ownerName
	 * @param phoneNumber
	 * @param address
	 */
	public Owner(String ownerName, int phoneNumber, String address){
		this.ownerName = ownerName;
		this.ownerPhoneNumber = phoneNumber;
		this.ownerAddress = address;
		
	}
	/**
	 * setters and getters for each private field in this class
	 * @return
	 */
	public String getName() {
		return ownerName;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.ownerName = name;
	}
	/**
	 * 
	 * @return
	 */
	public int getPhoneNumber() {
		return ownerPhoneNumber;
	}
	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.ownerPhoneNumber = phoneNumber;
	}
	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return ownerAddress;
	}
	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.ownerAddress = address;
	}
}
