import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
* Tests the BandwidthComparatorTest class.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/22/2019
*/
public class BandwidthComparatorTest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * Tests the bandwith compare method.
   */
   @Test public void compareTest() {
      WirelessNetwork net1 = new WiFi("Testing1", 410, 69, 69);
      WirelessNetwork net2 = new WiFi("Testing2", 460, 50, 50); 
      WirelessNetwork net3 = new WiFi("Testing3", 460, 50, 50);
      
      WirelessNetworkList netlist = new WirelessNetworkList();
      list.addWirelessNetwork(net1);
      list.addWirelessNetwork(net2);
      list.addWirelessNetwork(net3);
      
      Arrays.sort(netlist.getWirelessNetworksArray(), new BandwidthComparator());
   }
}
