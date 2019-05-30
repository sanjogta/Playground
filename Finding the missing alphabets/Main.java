import java.util.Scanner;
class Main{
    public static void main(String args[]){
     
      Scanner in= new Scanner(System.in);
      String str = in.nextLine();
      str = str.toLowerCase();
      StringBuilder sb = new StringBuilder(str);
      int count[] = new int[26];
      for(int i=0;i<26;i++)
        count[i] = 0;
      char ch = ' ';
      int offset = 0;
      for(int i=0;i<sb.length();i++)
      {
        ch = sb.charAt(i);
      if(ch >= 'a' && ch <= 'z')//97 to 122
      {
       offset = ch - 'a';
       count[offset] = count[offset] + 1;
      }
      }
     ch = ' ';
      for(int i =0 ;i<26;i++)
      {
        if(count[i]==0)
        {
         ch = (char)(i + 97);
          System.out.print(ch+ " ");
        }
       }
    }
}