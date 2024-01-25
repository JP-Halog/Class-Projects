import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
/**
* The WirelessNetworkList class.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class WirelessNetworkList
{
   private WirelessNetwork[] networkList;
   private String[] invalidRecords;
   
   /**
   * This method is the constructor for WirelessNetworkList.
   */
   public WirelessNetworkList()
   {
      networkList = new WirelessNetwork[0];
      invalidRecords = new String[0];
   }
   
   /**
   * This method gets the network list.
   * @return the network list.
   */
   public WirelessNetwork[] getWirelessNetworksArray()
   {
      return networkList;
   }
   
   /**
   * This method gets the invalid records.
   * @return the invalid records.
   */
   public String[] getInvalidRecordsArray()
   {
      return invalidRecords;
   }
   
    /**
    * Adds unrecognized phone to invalid records.
    *
    * @param invRecIn Input for unrecognized invalid
    */
   public void addInvalidRecord(String invRecIn) {
      //Increases capacity of invalidRecords
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invRecIn;
   }
   
   /**
    * Adds network to array of network.
    *
    * @param newNetworkIn Input for network object
    */
   public void addWirelessNetwork(WirelessNetwork newNetworkIn) 
   {
      //Increases size of network array
      WirelessNetwork[] newNetwork 
         = new WirelessNetwork[networkList.length + 1];
      for (int i = 0; i < networkList.length; i++) 
      {
         newNetwork[i] = networkList[i];
      }
      networkList = newNetwork;
      //Adds WirelessNetwork object to network array
      networkList[networkList.length - 1] = newNetworkIn;
   }
   /**
   * This method reads the file.
   * @param fileName is the file title in the project folder.
   * @throws FileNotFoundException for reading the file.
   */
   public void readFile(String fileName) throws FileNotFoundException
   {
      //Reads in file name and creates Scanner object
      Scanner scanFile = new Scanner(new File(fileName));
      //Assigns data from file to different categories
      
      String line = null;
      while (scanFile.hasNextLine()) 
      {
         try {
            line = scanFile.nextLine();
            Scanner scanNetwork = new Scanner(line);
            scanNetwork.useDelimiter(",");
         
            String categoryIn = scanNetwork.next();
            char networkChar = categoryIn.toUpperCase().charAt(0);
            WirelessNetwork network;
         //Assigns phone to different categoryIn
            switch (networkChar) 
            {   
               case 'W':
                  String name = scanNetwork.next();
                  double bandwith = Double.parseDouble(scanNetwork.next());
                  double monthlyFixedCost = Double.parseDouble(
                     scanNetwork.next());
                  double modemCost = Double.parseDouble(
                     scanNetwork.next());
                  network = new WiFi(name, bandwith, monthlyFixedCost, 
                     modemCost);
                  addWirelessNetwork(network);
                  break;
               case 'C':
                  name = scanNetwork.next();
                  bandwith = Double.parseDouble(scanNetwork.next());
                  monthlyFixedCost = Double.parseDouble(scanNetwork.next());
                  double time = Double.parseDouble(scanNetwork.next());
                  double dataLimit = Double.parseDouble(scanNetwork.next());
                  network = new Cellular(name, bandwith, monthlyFixedCost, 
                                             time, dataLimit);
                  addWirelessNetwork(network);
                  break;
               case 'L':
                  name = scanNetwork.next();
                  bandwith = Double.parseDouble(scanNetwork.next());
                  monthlyFixedCost = Double.parseDouble(scanNetwork.next());
                  time = Double.parseDouble(scanNetwork.next());
                  dataLimit = Double.parseDouble(scanNetwork.next());
                  network = new LTE(name, bandwith, monthlyFixedCost,
                         time, dataLimit);
                  addWirelessNetwork(network);
                  break;
               case 'F':
                  name = scanNetwork.next();
                  bandwith = Double.parseDouble(scanNetwork.next());
                  monthlyFixedCost = Double.parseDouble(scanNetwork.next());
                  time = Double.parseDouble(scanNetwork.next());
                  dataLimit = Double.parseDouble(scanNetwork.next());
                  network = new FiveG(name, bandwith, monthlyFixedCost, 
                                             time, dataLimit);
                  addWirelessNetwork(network);
                  break;
               default:
                  String charString = Character.toString(networkChar);
                  throw new InvalidCategoryException(charString);   
            }
         }   
         catch (NumberFormatException e) 
         {
            String nfe = line + "\n" + e;
            addInvalidRecord(nfe);
         }
         catch (NoSuchElementException e) 
         {
            String nsee = line + "\n" + e 
               + "For missing input data";
            addInvalidRecord(nsee);
         }
         catch (InvalidCategoryException e) 
         {
            String ice = line + "\n" + e;
            addInvalidRecord(ice); 
         }
      }
   }
   
   /**
   * This method generates a report.
   * @return the report.
   */
   public String generateReport()
   {
        
      String result = "";
      for (WirelessNetwork network : networkList)
      {
         result += network.toString() + "\n\n";
      }
      return "-------------------------------\n"
            + "Monthly Wireless Network Report"
            + "\n-------------------------------\n" + result;
   }
   
   /**
   * This method generates a report.
   * @return the sorted report.
   */
   public String generateReportByName()
   {
      Arrays.sort(getWirelessNetworksArray());
      
      String result = "";
      for (WirelessNetwork network : networkList)
      {
         result += network.toString() + "\n\n";
      }
      return "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)"
         + "\n-----------------------------------------\n" + result;
   }
   
   /**
   * This method generates a report.
   * @return the sorted report.
   */
   public String generateReportByBandwidth()
   {
      Arrays.sort(getWirelessNetworksArray(),
         new BandwidthComparator());
   
      String result = "";
      for (WirelessNetwork network : networkList)
      {
         result += network.toString() + "\n\n";
      }
      return "--------------------------------------"
         + "--------\n" + "Monthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n" + result;
   }
   
   /**
   * This method generates a report.
   * @return the report.
   */
   public String generateReportByMonthlyCost()
   {
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
   
      String result = "";
      for (WirelessNetwork network : networkList)
      {
         result += network.toString() + "\n\n";
      }
      return "---------------------------------------------"
         + "----\nMonthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n" + result;
   }
   /**
   * This method generates a report.
   * @return the report.
   */
   public String generateInvalidRecordsReport()
   {
        
      String result = "";
      for (String invalid : invalidRecords)
      {
         result += invalid.toString() + "\n\n";
      }
      return "----------------------\n"
            + "Invalid Records Report"
            + "\n----------------------\n" + result;
   }
}