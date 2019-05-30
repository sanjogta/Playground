import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count = 0;
      int copy = num;
      while(copy>0)
      {
        copy = copy/10;
        count++;
      }
     
      copy = num;
      int last_digit = 0,x = 1,sum=0;
      while(copy>0)
      {
        x = 1;
        last_digit = copy%10;
        for(int i = count;i>=1;i--)
        {
          x = x*last_digit;
        }
        sum = sum + x;
        copy = copy/10;
      }
      if(sum == num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}