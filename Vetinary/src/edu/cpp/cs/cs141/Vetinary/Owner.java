/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

/**
 * @author User
 *
 */
public class Owner extends Animal{
	/**
	 * 
	 */
	private String ownerName;
	/**
	 * 
	 */
	private int ownerPhoneNumber;
	/**
	 * 
	 */
	private String ownerAddress;
	/**
	 * 
	 */
	public Owner(){
		setName(null);
		setPhoneNumber(0);
		setAddress(null);
	}
	/**
	 * 
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
	 * 
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
