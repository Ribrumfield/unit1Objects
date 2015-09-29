import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       double l,w;
       
       System.out.print ("Please enter length of the rectangle");
       l = s.nextDouble ();
       
       System.out.print ("Please enter the width of the rectangle");
       w = s.nextDouble ();
       
       double perimeter = 0;
       perimeter = (w * 2) + ( l *2);
       
       double pythag = 0;
       double halfdone = 0;
       halfdone = (w * w) + (l * l);
       pythag = halfdone / 2;
       
       System.out.println ("perimeter " + perimeter);
       System.out.println ("The diagonal of the rectangle is " + pythag);
    }
}