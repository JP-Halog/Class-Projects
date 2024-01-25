import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**
* The BandwithComparator Test.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class WirelessNetworkListTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * Tests the invalidRecordsArray.
   * @throws FileNotFoundException - throws exception.
   */
   @Test public void invalidRecordsTest() throws FileNotFoundException
   {
      WirelessNetworkList netlist = new WirelessNetworkList();
      netlist.readFile("wireless_network_data1.csv");
      Assert.assertEquals("getInvalidRecordsArray test", 
         1, netlist.getInvalidRecordsArray().length);
   }
    /**
   * Tests the validRecordsArray.
   * @throws FileNotFoundException - throws exception.
   */
   @Test public void validRecordsTest() throws FileNotFoundException
   {
      WirelessNetworkList netlist = new WirelessNetworkList();
      netlist.readFile("wireless_network_data2.csv");
   }
}