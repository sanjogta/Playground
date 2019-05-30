import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++)
      arr[i] = in.nextInt();
    
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]<arr[j])
          System.out.print(arr[i]+","+arr[j]+"\n");
      }
    //  System.out.println();
    }
  }
}