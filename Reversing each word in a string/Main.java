import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   String str = in.nextLine();
   StringBuilder sb1 = new StringBuilder(str);
   StringBuilder sb2 = new StringBuilder(" ");
   sb1.append(" ");
   int len1 = sb1.length();
   StringBuilder temp = new StringBuilder(" ");
   temp.setLength(0);
   sb2.setLength(0);

   for(int i=0;i<len1;i++)
   {
         if(sb1.charAt(i)!=' ')
         {
           temp.append(sb1.charAt(i));
         }
         else 
         {
            sb2.append(reverse(temp)+" ");
            temp.setLength(0);
         }
   }
   System.out.print(sb2);
  }
  public static StringBuilder reverse(StringBuilder temp)
  {
      StringBuilder rev_str = new StringBuilder() ;
  
      for(int j=temp.length()-1;j>=0;j--)
      {
          rev_str.append(temp.charAt(j));
      }
      
      return rev_str;
  }
}