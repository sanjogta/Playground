import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    StringBuilder sb1 = new StringBuilder(str1);
    StringBuilder sb2 = new StringBuilder(str2);
    
    for(int i=0;i<str2.length();i++)
    {
      for(int j=0;j<str1.length();j++)
      {
        if(sb2.charAt(i)==sb1.charAt(j))
        {
          sb1.setCharAt(j,'$');
        }
      }
    }
    for(int i=0;i<sb1.length();i++)
    {
      if(sb1.charAt(i)!='$')
        System.out.print(sb1.charAt(i));
    }
  } 
}