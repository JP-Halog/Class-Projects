import java.util.Comparator;


/**
* Sorts by monthly cost.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/13/2019
*/

public class MonthlyCostComparator implements Comparator<WirelessNetwork>
{
   /**
   * Creates a comparison to sort objects.
   * 
   * @param n1 - network 1.
   * @param n2 - network 2.
   * @return int - returns an int.
   */
   public int compare(WirelessNetwork n1, WirelessNetwork n2)
   {
      if (n1.monthlyCost() > n2.monthlyCost()) {
         return -1;
      }
      else if (n1.monthlyCost() < n2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}