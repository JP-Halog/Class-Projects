/**
* Creates the LTE class.
* 
* Proj_09
* @author John Peter Halog - COMP1210-06
* @version 11-12-19
*/

public class LTE extends Cellular
{
// Field
/** Constant for the cost factor. */
   public static final double COST_FACTOR = 4.0;

// Constructor
   /**
   * Creates the LTE object.
   * 
   * @param nameIn - the name of the object
   * @param bandwidthIn - the bandwidth
   * @param monthlyFixedCostIn - the fixed cost
   * @param timeIn - the time used
   * @param dataLimitIn the limit of the data
   */
   public LTE(String nameIn, double bandwidthIn, double monthlyFixedCostIn,
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
   }

// Methods
   /**
   * Determines the cost.
   * 
   * @return - returns the fixed cost per month.
   */
   public double monthlyCost()
   {
      if (dataUsage() > dataLimit) {
         return (monthlyFixedCost + ((dataUsage() - dataLimit) 
            * LTE.COST_FACTOR * 2));
      }
      return monthlyFixedCost;
   }
}