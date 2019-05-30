import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb2 = new StringBuilder(" ");
    sb2.setLength(0);
    int val = 0;
    for(int i=0;i<sb.length();i++)
    {
      char ch = sb.charAt(i);
      if(ch>='a' && ch<='z')// (97 - 122)
      {
        val = ch - key;
        if(val < 97)
          val = val + 26;
        ch = (char)val;
        sb2.append(ch);
      }
      if(ch >='A' && ch<='Z')//(65-90)
      {
        val = ch - key;
        if(val<65)
          val = val + 26;
        ch = (char)val;
        sb2.append(ch);
      }
      else  if(ch == ' ')
      {
        sb2.append(ch);
      }
    }
    System.out.print(sb2);
  }
}