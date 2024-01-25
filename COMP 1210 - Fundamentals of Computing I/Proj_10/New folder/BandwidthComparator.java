import java.util.Comparator;

/**
* Sorts by bandwidth.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/13/2019
*/

public class BandwidthComparator implements Comparator<WirelessNetwork>
{
   /**
   * Compares networks.
   * 
   * @param n1 - network 1.
   * @param n2 - network 2.
   * @return int - returns an int.
   */
   public int compare(WirelessNetwork n1, WirelessNetwork n2) 
   {
      if (n1.getBandwidth() > n2.getBandwidth()) {
         return 1;
      }
      else if (n1.getBandwidth() < n2.getBandwidth()) {
         return -1;
      } 
      else {
         return 0;
      }
   }
}