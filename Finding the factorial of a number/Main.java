import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = fact(n);
    System.out.println(res);
  }
  public static int fact(int n)
  {
    if(n==0)
      return 1;
    else
      return n*fact(n-1);
  }
}