import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the Cellular class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 011/08/2019
*/
public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests get and set methods.
   */
   @Test public void gettersAndSettersTest() {
      Cellular n1 = new Cellular("Test", 5, 20, 1200, 2);
      n1.setTime(1300);
      n1.setDataLimit(1);
      
      Assert.assertEquals("getTime and setTime test", 1300, n1.getTime(), 0);
      Assert.assertEquals("getDataLimit and setDataLimit test", 
         1, n1.getDataLimit(), 0);
   }
   
   /**
   * Tests dataUsage method.
   */
   @Test public void dataUsageTest() {
      Cellular n1 = new Cellular("Test", 5, 20, 1200, 2);
      
      Assert.assertEquals("dataUsage test", 0.75, n1.dataUsage(), 0);
   }
   
   /**
   * Tests monthlyCost method.
   */
   @Test public void monthlyCostTest() {
      Cellular n1 = new Cellular("Test", 5, 20, 1200, 2);
      
      Assert.assertEquals("monthlyCost test 1", 20, n1.monthlyCost(), 0);
      
      n1.setDataLimit(0.5);
      Assert.assertEquals("monthlyCost test 2", 20.25, n1.monthlyCost(), 0);
   }
   
   /**
   * Tests toString method.
   */
   @Test public void toStringTest() {
      Cellular n1 = new Cellular("Test", 5, 20, 1200, 2);
      Assert.assertTrue("toString test", 
         n1.toString().contains("Data Limit: 2"));
   }
}
