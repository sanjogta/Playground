import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=(n-(i-1));j>0;j--)
        {
          System.out.print(j);
        }
        System.out.println();
      }
	}
}