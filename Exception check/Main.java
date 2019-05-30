import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     int num;
    Scanner in = new Scanner(System.in);
    try
    {
       num = in.nextInt();
      System.out.println(num);
    }
     catch(Exception e)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
     
   }
}