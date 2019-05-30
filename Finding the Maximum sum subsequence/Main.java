import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    int is_added[]= new int[size];
    int curr_sum=0,max_sum=0,sum=0;
    for(int i=0;i<size;i++)
    {
      arr[i] = in.nextInt();
      is_added[i]=0;
    }
    for(int i=1;i<size;i++)
    {
      if(arr[i-1]<arr[i])
      {
        if(is_added[i-1]==0)
        {
          sum = arr[i-1]+arr[i];
          is_added[i-1]=is_added[i]=1;
        }
        else
        {
          sum = arr[i];
          is_added[i]=1;
        }
        curr_sum = curr_sum + sum;
      }
      else
        sum =curr_sum =0;
        if(max_sum<curr_sum)
        {
          max_sum=curr_sum;
        }
     
    }
    System.out.print(max_sum);
  }
}