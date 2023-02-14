import java.util.Scanner;
public class selfstorage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number of paint cans:");
        int numCans = scan.nextInt();
        final int SQR_FT_PER_CAN = 400;
        final int SQR_FT_PER_DOOR = 80;
        int totalSqrFeet = SQR_FT_PER_CAN/SQR_FT_PER_DOOR * numCans;
        System.out.println("Cans purchased by the manager:" + numCans);
        System.out.print(totalSqrFeet + " doors can be completely painted.");
    }

}