import java.util.Scanner;

public class String_parsing
{
    public static void main (String[] args)
    {
       Scanner s = new Scanner(System.in);
       String num;
       
       System.out.print ("Please type an integer between 1,000 and 999,999");
       num = s.next ();
       
       String sub1 = num.substring(1,4);
       String sub2 = num.substring(5,7);
       
       String new_num = sub1 + sub2;
       
       System.out.println ("Your number was " + new_num);      
    }
}