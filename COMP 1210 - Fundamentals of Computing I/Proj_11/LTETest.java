import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the LTE class.
* 
* Proj_09
* @author John Peter Halog - COMP1210-06
* @version 11-12-19
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
      LTE n1 = new LTE("Test", 30, 50, 1200, 5);
      Assert.assertEquals("monthlyCost test 1", 50, n1.monthlyCost(), 0);
      
      LTE n2 = new LTE("Test", 30, 40, 1200, 4);
      Assert.assertEquals("monthlyCost test 2", 44, n2.monthlyCost(), 0);
   }
}
