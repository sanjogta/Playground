import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String str2 = "";
       StringBuilder sb = new StringBuilder(str);
       //StringBuilder tmp = new StringBuilder("");
      for(int i=sb.length()-1;i>=0;i--)
      {
        //tmp.append(sb.charAt(i));
        str2 = str2+sb.charAt(i);
      }
     if(str.equals(str2))
       System.out.println("Yes");
      else
        System.out.println("No");
    } 
}