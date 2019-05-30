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
      int s = (n/2);
    //if(n%2!=0)
    //  s = s-1;
    for(int i=0;i<s-1;i++)
    {
       for(int j=1;j<s;j++)
       {
         if(arr[j-1]>arr[j])
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