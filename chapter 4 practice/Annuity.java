public class Annuity
{
    public static void main (String []args)
    {
      double i = .08;
      double n = 20;
      double pvann = 10000;
      double top = Math.pow ((1 + i),(n-1)) - 1;
      double bot = Math.pow ((1 + i),(n - 1));
      double frac = top / bot;
      double secondtolast = frac + 1;
      double finaL = secondtolast * pvann;
      System.out.println(finaL);
    }
}
    