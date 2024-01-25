import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
* The BandwidthComparator test.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class BandwidthComparatorTest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   }
   /**
   * Tests the bandwith compare method.
   */
   @Test public void compareTest() {
      WirelessNetwork network1 = new WiFi("Test1", 650, 70, 70);
      WirelessNetwork network2 = new WiFi("Test2", 510, 10, 10); 
      WirelessNetwork network3 = new WiFi("Test3", 510, 10, 10);
      WirelessNetworkList networklist = new WirelessNetworkList();
      networklist.addWirelessNetwork(network1);
      networklist.addWirelessNetwork(network2);
      networklist.addWirelessNetwork(network3);
      
      Arrays.sort(networklist.getWirelessNetworksArray(),
          new BandwidthComparator());
   }
}
