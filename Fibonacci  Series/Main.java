import java.util.*;
class Fibonacci extends Thread
{
 int limit;
 Fibonacci(int num)
 {
  limit = num;
 }
 public void fib()
 {
         System.out.print("The Fibonacci series is :");
         int prev = 0;
         int curr = 1;
         int next = 0;
         System.out.print(prev+ " "+curr);
         for(int i=2;i<limit;i++)
         {
           next = prev + curr;
           prev = curr;
           curr = next;
           System.out.print(" "+next);
         }
     }
}
class FibException extends Exception
{

}
class Main
{
     public static void main(String[] args) 
     {
       Scanner sc = new Scanner(System.in);
       int limit = sc.nextInt();
         System.out.println("Enter the limit for Fibonacci: "+limit);
      try
      {
       if(limit<=0)
         throw new FibException();
        else
        {
          Fibonacci f = new Fibonacci(limit);
          f.fib();
       
        }
      }
       catch(FibException f)
       {
         System.out.println("Exception occurred");
       }
      
     }
}