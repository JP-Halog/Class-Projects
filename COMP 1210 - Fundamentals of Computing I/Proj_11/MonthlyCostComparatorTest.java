import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
/**
* The MonthlyCostComparator test.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class MonthlyCostComparatorTest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * Tests the monthly compare method.
   */
   @Test public void monthlyCompareTest() {
      WirelessNetwork net1 = new WiFi("Testing1", 410, 69, 69);
      WirelessNetwork net2 = new WiFi("Testing2", 460, 55, 55); 
      WirelessNetwork net3 = new WiFi("Testing3", 460, 55, 55);
      WirelessNetworkList netlist = new WirelessNetworkList();
      netlist.addWirelessNetwork(net1);
      netlist.addWirelessNetwork(net2);
      netlist.addWirelessNetwork(net3);
      Arrays.sort(netlist.getWirelessNetworksArray(),
          new MonthlyCostComparator());
   }
}
