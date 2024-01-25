import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* The WirelessNetworksPart2 class.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class WirelessNetworksPart2Test 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * Tests the main method.
   * 
   * @throws FileNotFoundException - throws an exception.
   */
   @Test public void argumentsTests() throws FileNotFoundException 
   {
      String[] argument1 = {};
      WirelessNetworksPart2.main(argument1);
      WirelessNetworksPart2 apps = new WirelessNetworksPart2();
      String[] argument2 = {"wireless_network_data1.csv"};
      WirelessNetworksPart2.main(argument2);
      WirelessNetworkList netList = new WirelessNetworkList();
      netList.readFile(argument2[0]);
      String report = netList.generateReport()
         + netList.generateReportByName() 
         + netList.generateReportByBandwidth()
         + netList.generateReportByMonthlyCost();
      Assert.assertTrue("", report.contains("WiFi"));
   }
}