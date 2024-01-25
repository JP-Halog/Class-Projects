import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the FiveG class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 011/08/2019
*/
public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * Tests the monthlyCost method.
   */
   @Test public void monthlyCostTest() {
      FiveG n1 = new FiveG("Test", 80, 40, 1000, 10);
      Assert.assertEquals("monthlyCost test 1", 40, n1.monthlyCost(), 0);
      
      FiveG n2 = new FiveG("Test", 80, 40, 1200, 5);
      Assert.assertEquals("monthlyCost test 2", 145, n2.monthlyCost(), 0);
   }
}
