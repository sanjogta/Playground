import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
          str = str.toLowerCase();
      StringBuilder sb = new StringBuilder(str);
      int count[] = new int[26];
  
     
      for(int i=0;i<26;i++)
      {
        count[i]=0;
      }
      char ch = ' ';
      int offset = 0;
    for(int i=0;i<sb.length();i++)
    {
      ch = sb.charAt(i);
      offset = 0;
     //   System.out.print(ch+" ");
      if(ch >= 'a' && ch <= 'z')//97 to 122
      {
       offset = ch - 'a';
       if(count[offset]>=1)
           {
               sb.setCharAt(i,'$');
              // System.out.println(sb);
           }
         
       count[offset] = count[offset] + 1;
        
      }
     } 
      ch = ' ';
     
       for(int i=0;i<str.length();i++)
       {
        ch = sb.charAt(i);
         offset = ch - 'a';
         if(ch >='a'&& ch<='z')
           System.out.print(ch+""+count[offset]+" ");
       }
      
    }
}