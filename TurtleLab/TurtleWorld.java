import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.penDown();
        turtle2.penDown();
        turtle.forward(50);
        turtle2.forward(50);
        turtle.turn(60);
        turtle2.turn(-60);
        turtle.setPenColor(Color.RED);
        turtle.forward(100);
        turtle2.setPenColor(Color.GREEN);
        turtle2.forward(100);
        turtle.turn(90);
        turtle.setPenWidth(5);
        turtle.forward(100);
        turtle2.turn(-90);
        turtle2.setPenWidth(5);
        turtle2.forward(100);
    }
}