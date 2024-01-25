import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Tests the WirelessNetworkList class.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/22/2019
*/
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Tests the invalidRecordsArrayTest.
   * 
   * @throws FileNotFoundException - throws exception.
   */
   @Test public void invalidRecordsTest() throws FileNotFoundException {
      WirelessNetworkList list = new WirelessNetworkList();
      list.readFile("wireless_network_data1.csv");
      Assert.assertEquals("getInvalidRecordsArray test", 
         1, list.getInvalidRecordsArray().length);
   } 
}
