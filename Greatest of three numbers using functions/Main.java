import java.util.Scanner;
class Main{
  public static int greatest(int n1,int n2,int n3)
  {
    int max=0;
    if(n1>n2)
      max = n1;
    else
      max = n2;
    if(n3>max)
      max = n3;
    return max;
  }
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
	  int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      System.out.println(" "+greatest(num1,num2,num3));
	}
}