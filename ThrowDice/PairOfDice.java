public class PairOfDice {
    private Die die1;
    private Die die2;

    public PairOfDice()
    {
        die1 = new Die();
        die2 = new Die();
    }

    public int roll()
    {
        return die1.roll() + die2.roll();
    }
    
    public int getFaceValue()
    {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public int getDie1()
    {
        return die1.getFaceValue();
    }

    public int getDie2()
    {
        return die2.getFaceValue();
    }
}
