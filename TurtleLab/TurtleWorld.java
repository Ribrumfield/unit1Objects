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
        turtle.forward(100);
        turtle2.turn(-90);
        turtle2.forward(100);
        turtle.turn(95);
        turtle.forward(145);
        turtle2.turn(-95);
        turtle2.forward(155);
        turtle.turn(110);
        turtle.forward(95);
        turtle2.turn(-120);
        turtle2.forward(100);
        turtle.turn(65);
        turtle.forward(105);
        turtle.turn(-150);
        turtle.setPenColor(Color.BLUE);
        turtle.forward(180);
    }
}