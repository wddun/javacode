public class BoxCars {
    
    public static void main(String[]args)
    {
        final int ROLLS = 1000;
        int boxCars = 0;
        PairOfDice gameDice = new PairOfDice();
    
        for(int count = 0; count < ROLLS; count++)
        {
            gameDice.roll();
            if((gameDice.getDie1() == 1) && gameDice.getDie2() == 1)
            {
                boxCars++;
            }
        }
    
    
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of box cars: " + boxCars);
        System.out.println("Ratio: " + + (double)boxCars/ROLLS);
    }

}
