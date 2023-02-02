import java.util.*;
import java.awt.*;

public class testcode1
{
  public static void main(String[] args)
  {
      World habitat = new World(300,300);
      Turtle yertle = new Turtle(habitat);

      yertle.forward();
      yertle.turnLeft();
      yertle.forward();

      habitat.show(true);
  }
}
