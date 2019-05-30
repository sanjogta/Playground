import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[][] = new int[n][n];
      int rmin = n-1, cmin = n-1;
      int rmax = 0, cmax = 0;
      int val = 1;
      while(rmin>=rmax && cmin>=cmax)
      {
        for(int i= cmin ;i>=cmax;i--)
        {
          arr[rmax][i] = val++;
        }
        for(int i=rmax+1;i<=rmin;i++)
        {
          arr[i][cmax] = val++;
        }
        for(int i=cmax+1;i<=cmin;i++)
        {
          arr[rmin][i] = val++;
        }
        for(int i= rmin-1;i>rmax;i--)
        {
          arr[i][cmin] = val++;
        }
        rmin--; rmax++;
        cmin--; cmax++;
      }
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(arr[i][j]+" ");
         }
         System.out.println();
       }
    }
}