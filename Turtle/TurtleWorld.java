import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(80);
        turtle.forward(30);
        turtle.setPenWidth(3);
        turtle.setPenColor(Color.GREEN);
        turtle.turn(108);
        turtle.forward(100);
        turtle.turn(-250);
        turtle.setPenWidth(9);
        turtle.setPenColor(Color.RED);
        turtle.forward(300);
        turtle.turn(150);
        turtle.setHeight(100);
        turtle.setPenColor(Color.YELLOW);
        turtle.forward(100);
    }
}
