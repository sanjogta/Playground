import java.util.Scanner;
class Main{
  public static int func(int num)
  {
    int res = (num*(num+1))/2;
    return res;
  }
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int res = func(num);
      System.out.println(res);
	}
}