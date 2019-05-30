import java.util.Scanner;
class Main
{
  public static int squareFunc(int num)
  {
    int res = num*num;
    return res;
    //System.out.println(res);
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
	 int num = in.nextInt();  
      int res = squareFunc(num);
      System.out.println(res);
	} 
}