import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      
      for(int i=0;i<size;i++)
        arr[i] = in.nextInt();
      
      int k = in.nextInt();
      
      int max = 0;
      while(k>0)
      {
      for(int i=0;i<size;i++)
      {
        if(arr[max]<arr[i])
        {
          max = i;
        }
      }
           k--;
        if(k>0)
          arr[max]=0;
      }
      System.out.print(arr[max]);
    }   
}