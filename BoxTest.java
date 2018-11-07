import org.junit.*;
// methods for assersion and assuming
import static org.junit.Assert.*;
import static org.junit.Assume.*;

//runner
import org.junit.runner.RunWith;

//Data points and theories
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.DataPoint;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;


/** 
* @author Aster Bodden
* @author Abdullah Alaqeel
* By making general Junit Theories for the three relevant properties of the equals() contract in the Object class
* Running these test will show that **** need explanation on why equals is wrong 
* It was not necessary to include tests for the hashcode since the equals method was wrong 
* Contributions: 
*  Aster Bodden: Class Skeletons, Box equals() and hashcode(). 
*  Abdullah Alaqee: MatchBox equals() and hashcode().
 *  The tests are recycled from assignment 8.
*/


@RunWith(Theories.class)
public class BoxTest{

    @DataPoints public static Box[] boxes = {
            new Box(),
            new Box(6,9,2),
            new Box(2,4,3),
            null
    };

    @DataPoints public static MatchBox[] matchBoxes = {
            new MatchBox(),
            new MatchBox(6,9,2,"cat"),
            new MatchBox(6,9,3,"dog"),
            null
    };

    @Theory
    public void reflexiveTest(Object x){  // general test for reflexive property 
    	assumeTrue(x != null);
    	System.out.println(x);
        assertTrue(x.equals(x));
    }

    @Theory
    public void SymmetryTest(Object x, Object y) { // general test for symmetric property 
        assumeTrue(x != null);
        assumeTrue(y != null);
        assertTrue(y.equals(x) == x.equals(y));
    }

    @Theory
    public void transitiveTest(Object x, Object y , Object z){ // general test for transitive property 
        assumeTrue(x != null);
        assumeTrue(y != null);
        assumeTrue(z != null);

        assumeTrue(x.equals(y));
        assumeTrue(y.equals(z));

        assertTrue(x.equals(z));
    }


    // my IDE does not run the Theories without atleast one @Test
    @Test
    public void test(){

    }

}