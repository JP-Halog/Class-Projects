import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Tests the WirelessNetworksPart2 class.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/22/2019
*/
public class WirelessNetworksPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Tests the main method.
   * 
   * @throws FileNotFoundException - throws an exception.
   */
   @Test public void argsTests() throws FileNotFoundException {
      String[] args1 = {};
      WirelessNetworksPart2.main(args1);
      
      WirelessNetworksPart2 app = new WirelessNetworksPart2();
      
      String[] args2 = {"wireless_network_data1.csv"};
      WirelessNetworksPart2.main(args2);
      WirelessNetworkList list = new WirelessNetworkList();
      list.readFile(args2[0]);
      String report = list.generateReport()
         + list.generateReportByName() 
         + list.generateReportByBandwidth()
         + list.generateReportByMonthlyCost();
      Assert.assertTrue("", report.contains("WiFi"));
   }
}
