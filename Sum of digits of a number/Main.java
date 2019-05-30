import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count = 0;
      int copy = num;
      while(copy > 0 )
      {
        copy = copy/10;
        count++;
      }
      int sum = 0;
      copy = num;
      int rem = 0;
      while(count>=0)
      {
        rem = copy%10;
        sum = sum + rem;
        copy = copy/10;
        count--;
      }
      System.out.println(sum);
	}
}