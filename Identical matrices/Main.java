import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr1[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr1[i][j] = in.nextInt();
      }
    }
    
    int arr2[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr2[i][j] = in.nextInt();
      }
    }
    int flag =1;
     for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(arr1[i][j]!=arr2[i][j])
        {
          flag = 0;
        }
      }
     }
    if(flag==1)
      System.out.print("Yes");
    else
      System.out.print("No");
}
}