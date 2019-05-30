import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   
      Scanner in = new Scanner(System.in);
      int count = 0;
      int num = in.nextInt();
      int copy_num = num;
       int first_digit = 0;
      while(copy_num > 0)
      {
        copy_num = copy_num/10;
        count++;
      }
    //  System.out.println(count);
      copy_num = num;
      while(count>1)
      {
        copy_num = copy_num/10;
        first_digit = copy_num;
        count--;
      }
     
      int last_digit = num%10;
     // System.out.println(first_digit);
     int sum = first_digit + last_digit;
      System.out.println(sum);
	}
}