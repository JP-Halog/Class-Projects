import java.io.FileNotFoundException;
/**
* The WirelessNetworksPart2 class.
* 
* Proj_10
* @author John Peter Halog - COMP1210-06
* @version 11-25-19
*/
public class WirelessNetworksPart2
{
/**
* Main method that accepts the command line arguments.
* 
* @param args - standard commandline arguments.
* @throws FileNotFoundException - throws error.
*/
   public static void main(String[] args) throws FileNotFoundException
 
   {
      if (args.length == 0) {
         String invalid = "File name expected as command line argument."
            + "\nProgram ending.";
         System.out.println(invalid);
      }
      else {
         String fileName = args[0];
         WirelessNetworkList netlist = new WirelessNetworkList();
         netlist.readFile(fileName);
         String reports = netlist.generateReport();
         reports += netlist.generateReportByName();
         reports += netlist.generateReportByBandwidth();
         reports += netlist.generateReportByMonthlyCost();
         System.out.println(reports);
      }
   }
}