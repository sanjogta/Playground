import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j] = in.nextInt();
      }
    }
     int sizeOfUT =0;
    sizeOfUT = col*(col+1)/2;
   // System.out.println(sizeOfUT);
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(i == j)
          System.out.print(arr[i][j]+" ");
      }  
    }
    
    for(int j=0;j<col;j++)
    {
      for(int i=0;i<row;i++)
      {
        if(j-i==1)
          System.out.print(arr[i][j]+" ");
      }
    }
    for(int j=0;j<col;j++)
    {
      for(int i=0;i<row;i++)
      {
        if(j-i>1)
          System.out.print(arr[i][j]+" ");
      }
    }
    
  }
}