import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the WiFi class.
* 
* Proj_09
* @author John Peter Halog - COMP1210-06
* @version 11-12-19
*/
public class WiFiTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * Tests the get and set methods.
   */
   @Test public void getAndSetTest() {
      WiFi test1 = new WiFi("Test", 420, 10, 20);
      test1.setModemCost(50);
      
      Assert.assertEquals("getModemCost", 50, test1.getModemCost(), 0);
      Assert.assertEquals("getName", "Test", test1.getName());
      
      test1.setName("42020");
      Assert.assertEquals("setName", "42020", test1.getName());
      
      test1.setBandwidth(40);
      Assert.assertEquals("set/getBandwidth", 40, test1.getBandwidth(), 0);
      
      test1.setMonthlyFixedCost(69);
      Assert.assertEquals("set/getMonthlyFixedCost", 69, 
         test1.getMonthlyFixedCost(), 0);
      
      test1.resetCount();
      Assert.assertEquals("set/getCount", 0, test1.getCount(), 0);
   }
   /**
   * Tests the cost method.
   */
   @Test public void monthlyCostTest() {
      WiFi test1 = new WiFi("Test", 420, 10, 20);
      
      Assert.assertEquals("Cost test", 30, test1.monthlyCost(), 0);
   }
}
