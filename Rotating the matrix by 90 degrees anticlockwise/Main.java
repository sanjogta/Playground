import java.util.*;
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
    
    for(int j=col-1;j>=0;j--)
    {
      for(int i=0;i<row;i++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}