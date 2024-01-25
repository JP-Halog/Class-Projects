import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
*Constructor of IceCreamCone.
*
*Proj_06_03
*@author John Peter Halog - COMP1210 - 06
*@version 10-15-19
*/
public class IceCreamConeMenuApp 
{
   /**
    *
    * @param args not used
    * @throws FileNotFoundException in case a file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      String listName = "*** no list name assigned ***";
      ArrayList<IceCreamCone> ice = new ArrayList<IceCreamCone>();
      IceCreamConeList iceList = new IceCreamConeList(listName, ice);
      String fileName = "no file Name";
      
      String userInput = "";
      Scanner scanInput = new Scanner(System.in);
      
      System.out.println("IceCreamCone List System Menu\n"
                       + "R - Read File and Create IceCreamCone List\n"
                       + "P - Print IceCreamCone List\n" 
                       + "S - Print Summary\n"
                       + "A - Add IceCreamCone\n"   
                       + "D - Delete IceCreamCone\n"   
                       + "F - Find IceCreamCone\n"
                       + "E - Edit IceCreamCone\n"
                       + "Q - Quit");   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         //?
         String label = "";
         double radius = 0;
         double height = 0;
         int index;
         
         userInput = scanInput.nextLine();
         if (userInput.length() == 0) {
            continue;
         }
         userInput = userInput.toUpperCase();
         char userChar = userInput.charAt(0);
         //?
         
         switch (userChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scanInput.nextLine();
               
               iceList = iceList.readFile(fileName);
               System.out.println("\tFile read in and IceCreamCone "
                                                   + "List created\n");
               
               break;
               
            case 'P':
               System.out.println(iceList.toString());
               break;
               
            case 'S':
               System.out.println("\n" + iceList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
               
               iceList.addIceCreamCone(label, radius, height);
               
               System.out.println("\t*** IceCreamCone added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               
               if (iceList.deleteIceCreamCone(label) != null) {
                  iceList.deleteIceCreamCone(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               
               if (iceList.findIceCreamCone(label) != null) {
                  System.out.println(iceList.findIceCreamCone(label)
                                                      .toString() + "\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
               
               if (iceList.findIceCreamCone(label) != null) {
                  iceList.editIceCreamCone(label, radius, height);
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q': case 'q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!userInput.equalsIgnoreCase("Q"));
   }
}