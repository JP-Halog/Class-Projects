import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.NoSuchElementException;

/**
* Creates a list and some strings.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/13/2019
*/

public class WirelessNetworkList
{
// Fields
   private WirelessNetwork[] objects;
   private String[] invalidRecords;

// Constructor
   /**
   * Creates the object.
   */
   public WirelessNetworkList()
   {
      objects = new WirelessNetwork[0];
      invalidRecords = new String[0];
   }

// Methods
   /**
   * gets the network array.
   * 
   * @return objects - returns the network objects.
   */
   public WirelessNetwork[] getWirelessNetworksArray()
   {
      return objects;
   }
   
   /**
   * gets the invalid objects.
   * 
   * @return invalidRecords - bad data.
   */
   public String[] getInvalidRecordsArray()
   {
      return invalidRecords;
   }
   
   /**
   * Adds an object.
   * 
   * @param objectIn - the object
   */
   public void addWirelessNetwork(WirelessNetwork objectIn)
   {
      objects = Arrays.copyOf(objects, objects.length + 1);
      objects[objects.length - 1] = objectIn;
   }
   
   /**
   * Adds invalid records to the array.
   * 
   * @param invalidRecordsIn - bad data.
   */
   public void addInvalidRecord(String invalidRecordsIn)
   {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn;
   }
   
   /**
   * Reads the file.
   * 
   * @param fileName - the name of the file.
   * @throws FileNotFoundException - keeps it from failing
   */
   public void readFile(String fileName) throws FileNotFoundException
   {
      
      Scanner scanFile = new Scanner(new File(fileName));
      try {
         while (scanFile.hasNext()) {
            String line = scanFile.nextLine();
            Scanner scanData = new Scanner(line);
            scanData.useDelimiter(",");
            char first = scanData.next().charAt(0);
            String name = scanData.next();
            double bandwidth = Double.parseDouble(scanData.next());
            double monthlyCost = Double.parseDouble(scanData.next());
            WirelessNetwork object;
            switch (first) {
               case 'W': 
                  double modemCost = Double.parseDouble(scanData.next());
                  object = new WiFi(name, bandwidth, monthlyCost, modemCost);
                  addWirelessNetwork(object);
                  break;
               case 'C':
                  double time = Double.parseDouble(scanData.next());
                  double dataLimit = Double.parseDouble(scanData.next());
                  object = new Cellular(name, bandwidth, monthlyCost,
                     time, dataLimit);
                  addWirelessNetwork(object);
                  break;
               case 'L':
                  double time2 = Double.parseDouble(scanData.next());
                  double dataLimit2 = Double.parseDouble(scanData.next());
                  object = new LTE(name, bandwidth, monthlyCost,
                     time2, dataLimit2);
                  addWirelessNetwork(object);
                  break;
               case 'F':
                  double time3 = Double.parseDouble(scanData.next());
                  double dataLimit3 = Double.parseDouble(scanData.next());
                  object = new FiveG(name, bandwidth, monthlyCost,
                     time3, dataLimit3);
                  addWirelessNetwork(object);
                  break;
               default: 
                  addInvalidRecord(name);
                  break;
            }
         
         }
      }
      //catch(InvalidCategoryException invalidObj) {
      
      //}
      catch(NumberFormatException formatObj) {
      
      }
      catch(NoSuchElementException elementObj) {
      
      }
   }
   
   /**
   * Generates the report string.
   * 
   * @return - report.
   */
   public String generateReport()
   {
      String reportHeader = "-------------------------------\n"
         + "Monthly Wireless Network Report\n"
         + "-------------------------------\n";
      String reportBody = "";
      for (WirelessNetwork object : objects) {
         reportBody += object.toString() + "\n\n";
      }
      return reportHeader + reportBody;
   }
   
    /**
   * Generates the report string.
   * 
   * @return - report.
   */
   public String generateReportByName()
   {
      Arrays.sort(getWirelessNetworksArray());
      String nameReportHeader = "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)\n"
         + "-----------------------------------------\n";
      String nameReportBody = "";
      for (WirelessNetwork object : objects) {
         nameReportBody += object.toString() + "\n\n";
      } 
      return nameReportHeader + nameReportBody;
   }
   
    /**
   * Generates the report string.
   * 
   * @return - report.
   */
   public String generateReportByBandwidth()
   {
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());
      
      String bandwidthReportHeader = "--------------------------------------"
         + "--------\nMonthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n";
         
      String bandwidthReportBody = "";
      for (WirelessNetwork object : objects) {
         bandwidthReportBody += object.toString() + "\n\n";
      }
      return bandwidthReportHeader + bandwidthReportBody; // placeholder
   }
   
   /**
   * Generates the report string.
   * 
   * @return - report.
   */
   public String generateReportByMonthlyCost()
   {
      String costReportHeader = "---------------------------------------------"
         + "----\nMonthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
      
      String costReportBody = "";
      
      for (WirelessNetwork object : objects) {
         costReportBody += object.toString() + "\n\n";
      }
      return costReportHeader + costReportBody; // placeholder
   }
}