/**
*Has user info.
*
*Activity_04A
*@author John Peter Halog - COMP1210 - 06
*@version 09-16-19
*/

public class UserInfo
{
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   /**
   * Creates a user.
   * @param firstNameIn is the name entered by the user.
   * @param lastNameIn is the last name given by the user.
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
      
   }
   // methods
   /**
   * Creates string.
   * @return returns string
   */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      
      return output;
   }
   
   /**
   * Sets the location.
   * @param locationIn is the location.
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
   * Sets the location.
   * @param ageIn is the location.
   * @return returns boolean.
   */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * Gets the age.
   * @return returns int.
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   * Gets the location.
   * @return returns string.
   */
   public String getLocation()
   {
      return location;
   }
   
   /**
   * Sets the status.
   */
   public void logOff()
   {
      status = OFFLINE;
   }
   
   /**
   * Sets the status.
   */
   public void logOn()
   {
      status = ONLINE;
   }
  
   
}
