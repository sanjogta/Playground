import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int res = 1;
      for(int i=num;i>0;i--)
      {
        res = res*i;
      }
      System.out.println(res);
	}
}