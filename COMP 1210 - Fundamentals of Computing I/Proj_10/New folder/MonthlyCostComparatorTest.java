//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
* Tests the MonthlyCostComparator class.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/22/2019
*/
public class MonthlyCostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * Tests the comapre method.
   */
   @Test public void compareTest() {
      WirelessNetwork n1 = new WiFi("Test 1", 420, 69, 69);
      WirelessNetwork n2 = new WiFi("Test 2", 450, 75, 75); 
      WirelessNetwork n3 = new WiFi("Test 3", 450, 75, 75);
      
      WirelessNetworkList list = new WirelessNetworkList();
      list.addWirelessNetwork(n1);
      list.addWirelessNetwork(n2);
      list.addWirelessNetwork(n3);
      
      Arrays.sort(list.getWirelessNetworksArray(), new MonthlyCostComparator());
   }
}
