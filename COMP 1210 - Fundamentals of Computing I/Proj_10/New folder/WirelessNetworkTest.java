//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the WirelessNetwork class.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/22/2019
*/
public class WirelessNetworkTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Tests the compareTo method.
   */
   @Test public void compareToTest() {
      WirelessNetwork n1 = new WiFi("Test1", 420, 69, 69);
      WirelessNetwork n2 = new WiFi("Test2", 450, 75, 75); 
      WirelessNetwork n3 = new WiFi("Test3", 450, 75, 75);
      
      WirelessNetworkList list = new WirelessNetworkList();
      list.addWirelessNetwork(n1);
      list.addWirelessNetwork(n2);
      list.addWirelessNetwork(n3);
      
      list.generateReportByName();
   }
}
