import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class Car
{
    privet int xLeft;
    privet int yTop;
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }


    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft, yTop +10,60,10);
        Ellipse2D.Double frontTire
              = new Ellipse2D.Double(xLeft +10, yTop + 20,10,10):
        Ellipse2D.Double rearTire
              = new Ellipse2D.Double(xLeft +40, yTop +20,10,10);
        
        Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
        Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
        Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
        Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);
        
        Line2D.Double      
          
   