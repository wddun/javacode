import java.util.Scanner;
public class selfstorage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number of paint cans:");
        int numCans = scan.nextInt();
        int numDoors = numCans * 5;
        System.out.println("Cans purchased by the manager:" + numCans);
        System.out.print("# of doors that can be completely painted:" + numDoors);
    }

}