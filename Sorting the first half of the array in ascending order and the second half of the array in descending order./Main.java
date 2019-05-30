import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr []= new int[n];
    
    for(int i=0;i<n;i++)
      arr[i] = in.nextInt();
    
    int s= n/2;
    int l1=0,h1=s-1;
    int l2=s,h2=n-1;
    for(int i=l1;i<h1;i++)
    {
      for(int j=l1+1;j<=h1;j++)
      {
        if(arr[j-1]>arr[j])
        {
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i=l2;i<h2;i++)
    {
      for(int j=l2+1;j<=h2;j++)
      {
        if(arr[j-1]<arr[j])
        {
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
     
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}