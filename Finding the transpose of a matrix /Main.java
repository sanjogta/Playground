import java.util.Scanner;
class Main{
  public static void main(String args[]){
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
    
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        System.out.print(arr1[j][i]+" ");
      }
      System.out.println();
    }
  }
}