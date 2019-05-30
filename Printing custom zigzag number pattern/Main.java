import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if((i%2==1))
          {
            if(j<n)
            System.out.print(i);
           if(j==n)
            System.out.print(i+1);
          }
          else if(i%2==0)
          {
            if(j==1)
            System.out.print(i+1);
           if(j>1)
            System.out.print(i);       
          }
        }
        System.out.println();
      }
	}
}