import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
   Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int arr1[][]= new int[r][c];
    for(int i=0;i<arr1.length;i++)
    {
      for(int j=0;j<arr1.length;j++)
      {
        arr1[i][j] = in.nextInt();
      }
    }
    int arr2[][]= new int[r][c];
    for(int i=0;i<arr2.length;i++)
    {
      for(int j=0;j<arr2.length;j++)
      {
        arr2[i][j] = in.nextInt();
      }
    }
    subtract(arr1,arr2);
  }
  public static void subtract(int arr1[][],int arr2[][])
  {
    int temp[][] = new int[arr1.length][arr2.length];
 
    for(int i=0;i<arr1.length;i++)
    {
      for(int j=0;j<arr1.length;j++)
      {
        temp[i][j] = arr1[i][j]-arr2[i][j];
      }
    }
   
    for(int i=0;i<arr1.length;i++)
    {
      for(int j=0;j<arr1.length;j++)
      {
        System.out.print(temp[i][j]+" ");
      }
      System.out.println();
    }
  }
}