import java.util.*;
import java.awt.*;

public class Main
{
  public static void main(String[] args)
  {
      World world = new World(400,400);
      Turtle yertle = new Turtle(world);
      yertle.penUp();  // move a little to the left
      yertle.moveTo(100,200);
      yertle.penDown();
      yertle.setColor(Color.blue);
      int n = 75;
      // Add your loop here!
      for(int turns = 1; turns <= n; turns++)
      {
          yertle.forward(5);
          yertle.turn(360/n);
      }
      
      world.show(true);
  }
}
