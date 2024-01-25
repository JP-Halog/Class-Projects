import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
*Bank.
*
*Proj_08_02
*@author John Peter Halog - COMP1210 - 06
*@version 10-22-19
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    *
    */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .1);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }

   /** A test that always fails. **/
   @Test public void defaultTest() {
   }
}