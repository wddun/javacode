//********************************************************************
//  RationalNumbers.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************
import java.util.Scanner;
public class RationalNumbers
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the numerator for the first number: ");
      int entered1stNum = scan.nextInt();
      System.out.println("Enter the denominator for the first number: ");
      int entered1stDenom = scan.nextInt();
      System.out.println("Enter the numerator for the second number: ");
      int entered2ndNum = scan.nextInt();
      System.out.println("Enter the denominator for the second number: ");
      int entered2ndDenom = scan.nextInt();
      Rational r1 = new Rational (entered1stNum, entered1stDenom);
      Rational r2 = new Rational (entered2ndNum, entered2ndDenom);
      Rational r3, r4, r5, r6, r7;

      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);

      if (r1.equals(r2))
         System.out.println ("r1 and r2 are equal.");
      else
         System.out.println ("r1 and r2 are NOT equal.");

      r3 = r1.reciprocal();
      System.out.println ("The reciprocal of r1 is: " + r3);

      r4 = r1.add(r2);
      r5 = r1.subtract(r2);
      r6 = r1.multiply(r2);
      r7 = r1.divide(r2);

      System.out.println ("r1 + r2: " + r4);
      System.out.println ("r1 - r2: " + r5);
      System.out.println ("r1 * r2: " + r6);
      System.out.println ("r1 / r2: " + r7);
   }
}
