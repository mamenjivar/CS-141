/**
 * 
 */
package edu.cpp.cs.cs141.Vetinary;

/**
 * @author Miguel Menjivar
 *
 * Will be in charge of all the heavy work of this program
 */
public class AppEngine {
	UserInterface UI = new UserInterface();

	public void initialize() {
		boolean menuLoop = true;
		while(menuLoop){
			UI.menu();
		}
	}
	public void searchOwner(){
		
	}

}
