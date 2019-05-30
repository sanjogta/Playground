import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.nextLine());
    
    left_rotate(str);
  }
  
  public static void left_rotate(StringBuilder str)
  {
    int rot = str.length()/2;
    int k=0;
    for(int i=0;i<rot;i++)
    {
      char temp = str.charAt(0);
      k=0;
      while(k<=str.length()-2)
      {
        str.setCharAt(k,str.charAt(k+1));
        k++;
      }
      str.setCharAt(k,temp);
    }
    StringBuilder newstr = new StringBuilder(str);
   // System.out.print(newstr);
    drawPattern(newstr);
  }
  public static void drawPattern(StringBuilder str)
  {
    int len = str.length();
    for(int i=0;i<len;i++)
    {
      for(int k=1;k<len-i;k++)
      {
        System.out.print(' ');
      }
      for(int j=0;j<=i;j++)
        System.out.print(str.charAt(j));
      System.out.println();
    }
  }
}