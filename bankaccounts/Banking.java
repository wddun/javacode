//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      /*Account acct1 = new Account ("Ted Murphy", 72354, 1000.00);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      Account acct4 = new Account("William Dunning", 12431);

      acct1.deposit (25.85);


      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: " +
                          gomezBalance);

      System.out.println ("Gomez balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));



      double dunningBalance = acct4.deposit (1600.00);
      System.out.println ("Dunning balance after deposit: " +
                          dunningBalance);

      System.out.println ("Dunning balance after withdrawal: " + 
                          acct4.withdraw (100, 1.5));
                  
      

 //     acct3.withdraw (800.00, 0.0);  // exceeds balance

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();
      System.out.println("Dunning account after interest: " + acct4.addInterest());

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      System.out.println (acct4);
      */
      acct1.transfer(100, acct2);
      System.out.println(acct1);
      System.out.println(acct2);
   }
}