import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
	  int count = 0;
      int sum=0;
      int copy = num;
      while(copy>0)
      {
        copy = copy/10;
        count++;
      }
      copy = num;
      while(count>0)
      {
         int fac = 1;
         int digit = copy%10;
         for(int i = digit;i>0;i--)
         {
           fac = fac * i;
         }
         sum = sum + fac;
        copy = copy/10;
        count--;
      }
      if(sum == num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}