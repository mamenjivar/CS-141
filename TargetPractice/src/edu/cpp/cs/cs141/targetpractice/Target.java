/**
 * Miguel Menjivar
 */
package edu.cpp.cs.cs141.targetpractice;

/**
 * @author Miguel Menjivar
 * 
 * Target object
 * has field that says hit or miss
 *
 */
public class Target {
	/**
	 * This field keeps track of whether the target has
	 * ben hit by a bullet. Initially {@code false}, this
	 * field can only be changed by the {@link #hitTarget()} method
	 * from {@code false} to {@code true}, modeling the action 
	 * of hitting the target
	 */
	private boolean isHit = false;
	/**
	 * This method allows clients to query whether this target
	 * has been hit
	 * 
	 * @return  
	 */
	public boolean isTargetHit(){
		return isHit;
	}
	/**
	 * 
	 */
	public void hitTarget() {
		isHit = true;
	}

}
