
public class playground
{
    public static void main(String[] args) {
        int i = 7;         String s = "Be Clever.";
        System.out.println("BEFORE --->\ti: " + i + "\ts: " + s);
        tryToChange(i);    tryToChange(s);
        System.out.println("AFTER ---->\ti: " + i + "\ts: " + s);
    }
    
    public static void tryToChange(int i) { i = 1000; }
    
    public static void tryToChange(String s) { s = "Be Different!"; }
}

