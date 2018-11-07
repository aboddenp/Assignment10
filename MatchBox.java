import java.util.*;
/**
* This class defines a named Marchbox that has a width height and depth
* it has the attribute of calculating its volume 
*/
public class MatchBox extends Box {

	String name;
	/** creates a new box with 0 width, height and depth and null name */
	MatchBox() {
	}
	/** 
	* creates a new box with the given width, height and depth
	* @param w width 
	* @param h height 
	* @param d depth 
	* @param n name 
	*/
	MatchBox(int w, int h, int d, String n) {
		super(w, h, d);
		name = n;
	}
	/**
	* gets the this box's name 
	* @return this box's name 
	*/
	public String getName() { return name; }

	@Override
	/**
	* @param other object to compare to 
	* @return true if other box has the same dimentions and depth and name 
	*/
	public boolean equals(Object other){
		return false; // need to implement using regular recepie 
	}

	/**
	* @return this Matchbox hashCode/ equal Machboxes have equal hashCodes 
	*/
	@Override
	public int hashCode(){
		return 0; // need to implement using bloch standard recepie ... you can call super.hash and add the hash for the string *31
	}

}