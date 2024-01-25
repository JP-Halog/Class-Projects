/**
* Creates the WiFi class.
* 
* Project 09
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/08/2019
*/

public class WiFi extends WirelessNetwork
{
// Fields
   private double modemCost;
   
// Constructor
   /**
   * Creates the WiFi object.
   * 
   * @param nameIn - the name of the object.
   * @param bandwidthIn - the bandwidth of the object.
   * @param monthlyFixedCostIn - the cost per month.
   * @param modemCostIn - the cost of the modem.
   */
   public WiFi(String nameIn, double bandwidthIn, 
      double monthlyFixedCostIn, double modemCostIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      setModemCost(modemCostIn);
   }

// Methods
   /**
   * Gets the cost of the modem.
   * 
   * @return modemCost - returns modem cost.
   */
   public double getModemCost()
   {
      return modemCost;
   }
   
   /**
   * Sets the cost of the modem.
   * 
   * @param modemCostIn - the cost of the modem.
   */
   public void setModemCost(double modemCostIn)
   {
      modemCost = modemCostIn;
   }
   
   /**
   * Determines the monthly cost.
   * 
   * @return - the fixed monthly cost plus the modem cost.
   */
   public double monthlyCost()
   {
      return monthlyFixedCost + modemCost;
   }
}