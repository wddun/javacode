import java.util.Scanner;

public class expresscheckout {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int ITEM_LIMIT = 6;
        System.out.println("\n***Welcome to JavaMart!***");
        System.out.println("\nEnter the number of items.");
        int valitemnumber = scan.nextInt();
        while(valitemnumber > ITEM_LIMIT)
        {
            System.out.println("Please remove some items from the cart.");
            valitemnumber = scan.nextInt();
        }
        
        

        System.out.println("THANK YOU for shopping @ JavaMart!");
    }
}
