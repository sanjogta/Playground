import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int expo = in.nextInt();
      int res = power(base,expo);
      System.out.println(res);
    }
  public static int power(int b,int e)
  {
    int val = 1;
    for(int i=0;i<e;i++)
    {
      val = val*b;
    }
    return val;
  }
}