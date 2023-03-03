package javacode.playground;
public class playground
{
    public static void main (String[]args)
    {
        int time = 250;
        if (time <= 200)
        {
            System.out.println("Free");
        }
        else if (time < 300)
        {
            System.out.println("$150");
        }
        else if (time > 500)
        {
            System.out.println("Max is 500.");
        }
        else 
        {
            System.out.println("Invalid value");
        }
        
    }
}
