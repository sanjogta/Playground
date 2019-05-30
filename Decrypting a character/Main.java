import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       char ch = in.next().charAt(0);
       int key = in.nextInt();
       if(ch >= 'a' && ch <= 'z')
       {
         int offset = ch - 'a';
         offset = ((offset - key))%26;
         ch = (char)('z' + offset+1);
       }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - 'A';
         offset = (offset - key)%26;
         ch = (char)('A' + offset);
      }
      System.out.print(ch);
    }
}