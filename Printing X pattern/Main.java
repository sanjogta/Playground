import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int NumOfSpaces=5;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
           if(j==i)
             System.out.print("*");
          else if((j+i)==(n+1))
             System.out.print("*");
           else 
             System.out.print(" ");
        }
        System.out.println();
      }
	}
}