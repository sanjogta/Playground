import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int div = 1;
      for(int i=1;i<=num;i++)
      {
        if(num%div == 0)
          System.out.println(div);
        div++;
      }
	}
}