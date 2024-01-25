import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the Cellular class.
* 
* Proj_09
* @author John Peter Halog - COMP1210-06
* @version 11-12-19
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
      n1.setTime(1400);
      n1.setDataLimit(1);
      
      Assert.assertEquals("getTime and setTime", 1400, n1.getTime(), 0);
      Assert.assertEquals("getDataLimit and setDataLimit", 
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
      Cellular n1 = new Cellular("Test", 5, 25, 1200, 2);
      
      Assert.assertEquals("monthlyCost 1", 25, n1.monthlyCost(), 0);
      
      n1.setDataLimit(0.5);
      Assert.assertEquals("monthlyCost 2", 25.25, n1.monthlyCost(), 0);
   }
   /**
   * Tests toString method.
   */
   @Test public void toStringTest() {
      Cellular n1 = new Cellular("Test", 5, 25, 1200, 2);
      Assert.assertTrue("toString test", 
         n1.toString().contains("Data Limit: 2"));
   }
}
