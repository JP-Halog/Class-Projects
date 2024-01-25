import java.io.FileNotFoundException;
/**
* Uses command line arguments to test the code.
* 
* Project 10
* @author Jacob Dewey - COMP 1210 - 004
* @version 11/13/2019
*/

public class WirelessNetworksPart2
{
/**
* Main method that accepts the command line arguments.
* 
* @param args - standard commandline arguments.
* @throws FileNotFoundException - throws error.
*/
   public static void main(String[] args) throws FileNotFoundException; 
   {
      if (args.length == 0) {
         String exception = "File name expected as command line argument."
            + "\nProgram ending.";
         System.out.println(exception);
      }
      else {
         String fileName = args[0];
         WirelessNetworkList list = new WirelessNetworkList();
         list.readFile(fileName);
         
         String report = list.generateReport();
         report += list.generateReportByName();
         report += list.generateReportByBandwidth();
         report += list.generateReportByMonthlyCost();
         System.out.println(report);
      }
   }
}