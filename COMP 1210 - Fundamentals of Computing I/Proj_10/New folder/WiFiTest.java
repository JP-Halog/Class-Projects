import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the WiFi class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 011/08/2019
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
      WiFi n1 = new WiFi("Test", 420, 10, 20);
      n1.setModemCost(69);
      
      Assert.assertEquals("getModemCost test", 69, n1.getModemCost(), 0);
      Assert.assertEquals("getName test", "Test", n1.getName());
      
      n1.setName("Trump 2020");
      Assert.assertEquals("setName test", "Trump 2020", n1.getName());
      
      n1.setBandwidth(40);
      Assert.assertEquals("set/getBandwidth test", 40, n1.getBandwidth(), 0);
      
      n1.setMonthlyFixedCost(69);
      Assert.assertEquals("set/getMonthlyFixedCost test", 69, 
         n1.getMonthlyFixedCost(), 0);
      
      n1.resetCount();
      Assert.assertEquals("set/getCount test", 0, n1.getCount(), 0);
   }
   
   /**
   * Tests the cost method.
   */
   @Test public void monthlyCostTest() {
      WiFi n1 = new WiFi("Test", 420, 10, 20);
      
      Assert.assertEquals("monthlyCost test", 30, n1.monthlyCost(), 0);
   }
}
