import java.io.FileNotFoundException;
/**
* The WirelessNetworksPart3 class.
* 
* Proj_11
* @author John Peter Halog - COMP1210-06
* @version 12-07-19
*/

public class WirelessNetworksPart3 {
   
   /** 
    * Reads file and prints methods from WirelessNetwork class. 
    *
    * @param args Reads in file
    */
   public static void main(String[] args) {
      //Prints error message if nothing in command line argument
      if (args.length == 0) 
      {
         System.out.println("File name expected as"
            + " command line argument.");
         System.out.println("Program ending.");
      }
      else 
      {
         //Reads in file from command line
         String fileName = args[0];
         WirelessNetworkList wifiObj = new WirelessNetworkList();
      
         try 
         {
            //Invokes readFile method from WirelessNetworkList
            wifiObj.readFile(fileName);
                        
            //Prints out report
            System.out.print(wifiObj.generateReport());
            System.out.print(wifiObj.generateReportByName());
            System.out.print(wifiObj.generateReportByBandwidth());
            System.out.print(wifiObj.generateReportByMonthlyCost());
            System.out.print(wifiObj.generateInvalidRecordsReport());
         }   
         catch (FileNotFoundException e) 
         {
            System.out.println("*** Attempted to read file: " + fileName 
               + " (No such file or directory)");
         }
      }   
   }
}