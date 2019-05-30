import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String sb1 = new String(in.nextLine());
      String sb2 = new String(in.nextLine());
      int nop = in.nextInt();
      
     // System.out.println(sb1+" "+sb2+" "+nop);
      
      String arr[] = sb2.split("\\s",nop);
      for(String s:arr)
      System.out.println(s);
      
    }
}