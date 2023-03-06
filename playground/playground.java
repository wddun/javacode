import java.util.Scanner;

public class playground 
{

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int SENTINEL = 0;
        System.out.print("Enter integer (0 to stop):");
        int entry = scan.nextInt();
        while (entry != SENTINEL)
        {
            System.out.print("Enter another (0 to stop):");
            entry = scan.nextInt();
        }
        // assertion: To get to here, last entry MUST be 0
        System.out.println("You just put in a 0. Program exiting.");

    }
    
}
