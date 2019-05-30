import java.util.Scanner;

class Main
{
  public static void fun(int base,int expo)
  {
    int res=1;
    while(expo>0)
    {
      res = res*base;
      expo--;
    }
    System.out.println(res);
  }
  public static void main(String []args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    fun(base,exponent);
  }
}