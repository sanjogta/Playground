import java.util.*;
class Main
{
  public static void main(String []args)
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    char c[] = new char[str.length()];
     for(int l=0;l<str.length();l++)
    {
        c[l] = '*';
    }
    int k=0;
    for(int i=0;i<str.length();i++)
    {
      char ch =str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        continue;
      }
      else
      {
        c[k] = ch;
        k++;
      }
    }
   
    for(int l=0;l<str.length();l++)
    {
      if(c[l]!='*')
        System.out.print(c[l]);
    }
  }
}