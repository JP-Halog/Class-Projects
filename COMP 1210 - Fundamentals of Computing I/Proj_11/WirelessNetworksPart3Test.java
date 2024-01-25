import org.junit.Test;

/** 
 * Tests methods of WirelessNetworksPart3 class. 
 *
 * Proj_11
* @author John Peter Halog - COMP1210-06
* @version 12-07-19
 */
public class WirelessNetworksPart3Test {
   /** Test for good file name. **/
   @Test public void mainTest() {
      String[] array = new String[1];
      array[0] = "wireless_network_data2.exceptions.csv";
      WirelessNetworksPart3 cp = new WirelessNetworksPart3();
      WirelessNetworksPart3.main(array);
   }
   
   /** Test for unrecognized file name. **/
   @Test public void mainTest2() {
      String[] array = new String[1];
      array[0] = "wireless_network_data2.exceptions.txt";
      WirelessNetworksPart3 cp = new WirelessNetworksPart3();
      WirelessNetworksPart3.main(array);
   }
   
   /** Test for no file input. **/
   @Test public void mainTest3() {
      String[] array = new String[0];
      WirelessNetworksPart3 cp = new WirelessNetworksPart3();
      WirelessNetworksPart3.main(array);
   }
}