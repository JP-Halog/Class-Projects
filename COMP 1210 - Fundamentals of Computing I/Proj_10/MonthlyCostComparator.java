import java.util.Comparator;
/**
* The MonthlyCostComparator class.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/

public class MonthlyCostComparator implements Comparator<WirelessNetwork>
{
   /**
   * Creates a comparison to sort objects.
   * 
   * @param net1 - network 1.
   * @param net2 - network 2.
   * @return int - returns an int.
   */
   public int compare(WirelessNetwork net1, WirelessNetwork net2)
   {
      if (net1.monthlyCost() > net2.monthlyCost()) {
         return -1;
      }
      else if (net1.monthlyCost() < net2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}