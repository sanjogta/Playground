import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
    String str[] = new String[n];
    for(int i=0;i<n;i++)
    {
      str[i] = in.next();
    }
     /*for(int i=0;i<n;i++)
    {
      System.out.print(str[i]+" ");
    }*/
    String s1,s2;
    
    for(int k=0;k<n;k++)
    {
    for(int i=1;i<str.length;i++)
    {
     int j=0;
     s1 = str[i-1];
     s2 = str[i];
      if(s1.charAt(j)>s2.charAt(j))
      {
          str[i-1] = s2.toLowerCase();
          str[i] = s1.toLowerCase();
      }
      else
      {
          str[i-1] = s1;
          str[i] = s2;
      }
      
    }
    }
    for(int i=0;i<n;i++)
    {
      System.out.println(str[i]);
    }
  }
}