import java.util.*;

/**
* This class defines a box that has a width height and depth
* it has the attribute of calculating its volume 
*/
public class Box {

	int width;
	int height;
	int depth;
	/** creates a new box with 0 width, height and depth  */
	Box() {
	}
	/** 
	* creates a new box with the given width, height and depth
	* @param w width 
	* @param h height 
	* @param d depth 
	*/
	Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

	/**
	calculates the volume by using formula width * height * depth */
	public int getVolume() {
		return width * height * depth;
	}

	@Override
	/**
	* @param other object to compare to 
	* @return true other box has the same dimentions and depth 
	*/
	public boolean equals(Object other){
		if (this == other){ // check if other is the same box 
			return true; 
		}

		if(!(other instanceof Box)){ // check if other is a box 
			return false; 
		}

		Box otherBox = (Box) other; // cast other into a Box object 
		// check if other box has same dimentions as this box 
		return otherBox.width == this.width && otherBox.height == this.height && otherBox.depth == this.depth;

	}
	/**
	* @return this box hashCode/ equal boxes have equal hashCodes 
	*/
	@Override
	public int hashCode(){
		return (width + height + depth) * 31;  // blochs standard recepie add all important fields and multiply by 31 
	}
}