/**
* Creates the FiveG class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/08/2019
*/

public class FiveG extends Cellular
{
// Field
/** The cost factor for 5G. */
   public static final double COST_FACTOR = 5.0;

// Constructor
   /**
   * Creates the FiveG object.
   * 
   * @param nameIn - the name of the object.
   * @param bandwidthIn - the bandwidth of the object.
   * @param monthlyFixedCostIn - the fixed cost of the object.
   * @param timeIn - the time used.
   * @param dataLimitIn - the data limit of the object.
   */
   public FiveG(String nameIn, double bandwidthIn, double monthlyFixedCostIn,   
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
   }

// Methods
   /**
   * The monthly cost of the object.
   * 
   * @return - the cost.
   */
   public double monthlyCost()
   {
      if (dataUsage() > dataLimit) {
         return (monthlyFixedCost + ((dataUsage() - dataLimit) 
            * FiveG.COST_FACTOR * 3));
      }
      return monthlyFixedCost;
   }   
}