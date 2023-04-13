// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print the number of salespeople: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        double average = 0.0;
        int max = 0;
        int maxperson = 0;
        int minperson = 0;
        int min;
        int numExceededLimit = 0;
        for (int i=1; i<=sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i) + ": ");
            sales[i-1] = scan.nextInt();
        }
        min = sales[0];
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=1; i<=sales.length; i++)
        {
            System.out.println(" " + (i) + " " + sales[i-1]);
            sum += sales[i-1];
            if(max < sales[i-1])
            {
                max = sales[i-1];
                maxperson = i;
            }
            if(min > sales[i-1])
            {
                min = sales[i-1];
                minperson = i;
            }
        }
        average = (double)sum / SALESPEOPLE;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + average);
        System.out.println("Salesperson " + maxperson + " had the highest sale with $" + max + ".");
        System.out.println("Salesperson " + minperson + " had the lowest sale with $" + min + ".");
        System.out.print("Enter a value: ");
        int limit = scan.nextInt();
        System.out.println("The ids and amounts of the salespeople who exceeded the amount are: ");
        for (int i=1; i<=sales.length; i++)
        {
            if (sales[i-1] > limit)
            {
                System.out.print(i + "  ");
                System.out.println("$" + sales[i-1]);
                numExceededLimit++;
            }
        }
        System.out.println();
        System.out.println("The number of people that exceeded the limit is " + numExceededLimit);
    }
}