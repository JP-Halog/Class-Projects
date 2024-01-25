import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the LTE class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 011/08/2019
*/
public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * Tests the monthlyCost method.
   */
   @Test public void monthlyCostTest() {
      LTE n1 = new LTE("Test", 30, 40, 1200, 5);
      Assert.assertEquals("monthlyCost test 1", 40, n1.monthlyCost(), 0);
      
      LTE n2 = new LTE("Test", 30, 40, 1200, 4);
      Assert.assertEquals("monthlyCost test 2", 44, n2.monthlyCost(), 0);
   }
}
