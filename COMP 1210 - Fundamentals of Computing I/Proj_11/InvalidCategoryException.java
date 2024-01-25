/**
* The Exception extension class.
* 
* Proj_11
* @author John Peter Halog - COMP1210-06
* @version 12-07-19
*/
public class InvalidCategoryException extends Exception {
   
   /** Constructor for InvalidCategoryException class.
    *
    * @param categoryIn Input for error message
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}