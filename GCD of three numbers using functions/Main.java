import java.util.Scanner;
public class Main{
  public static int GCDOfThree(int n1,int n2,int n3)
  {
    int min = 0;
    int gcd1=0;
    if(n1<n2)
      min = n1;
    else
      min = n2;
    while(min>0)
    {
       if(n1%min==0 && n2%min==0)
       {
         gcd1 = min;
         break;
       }    
       else
         min--;
    }
    if(gcd1>n3)
      min = gcd1;
    else
      min = n3;
    while(min>0)
    {
       if(n1%min==0 && n2%min==0)
       {
         gcd1 = min;
         break;
       }    
       else
         min--;
    }
    return gcd1;
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int gcd = GCDOfThree(n1,n2,n3);
    System.out.println(gcd);
  }
}