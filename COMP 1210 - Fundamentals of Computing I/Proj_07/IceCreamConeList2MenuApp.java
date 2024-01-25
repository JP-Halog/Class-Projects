import java.io.FileNotFoundException;
import java.util.Scanner;
/**
*Constructor of IceCreamCone.
*
*Proj_06_03
*@author John Peter Halog - COMP1210 - 06
*@version 10-15-19
*/
public class IceCreamConeList2MenuApp
{
   private static String upperCaseFirst(String value) 
   {
        // Convert String to char array.
      char[] array = value.toCharArray();
        // Modify first element in array.
      array[0] = Character.toUpperCase(array[0]);
        // Return string.
      return new String(array);
   }
   /**
    *
    * @param args not used
    * @throws FileNotFoundException in case a file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      String iceListName2 = "*** no list name assigned ***";
      IceCreamCone[] iceList2 = new IceCreamCone[20];
      IceCreamConeList2 iceList3 = new IceCreamConeList2(iceListName2, 
                                                         iceList2, 0);
      String fileName = "no file Name";
      
      String label;
      double radius;
      double height;
      
      String code = "";
      Scanner scan = new Scanner(System.in);
      
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
         code = scan.nextLine();
         
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char userChar = code.charAt(0);
         //?
         
         switch (userChar) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
               
               iceList3 = iceList3.readFile(fileName);
               System.out.println("\tFile read in and IceCreamCone "
                                                   + "List created\n");
               
               break;
               
            case 'P':
               System.out.println(iceList3.toString());
               break;
               
            case 'S':
               System.out.print("\n" + iceList3.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               iceList3.addIceCreamCone(label, radius, height);
               
               System.out.println("\t*** IceCreamCone added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (iceList3.deleteIceCreamCone(label) != null) 
               {
                  System.out.println("\t\"" + upperCaseFirst(label) 
                                       + "\" deleted\n");
               } 
               else 
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (iceList3.findIceCreamCone(label) != null) {
                  System.out.println(
                     upperCaseFirst(iceList3.findIceCreamCone(label).toString())
                        + "\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               if (iceList3.findIceCreamCone(label) != null) {
                  iceList3.editIceCreamCone(label, radius, height);
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
      } while (!code.equalsIgnoreCase("Q"));
   }
}