import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i =0 ;i<size;i++)
        arr[i] = in.nextInt();
      func(size,arr);
      for(int i =0 ;i<size;i++)
        System.out.print(arr[i] + " ");  
    }
  public static void func(int n,int arr[])
  {
    int a[] = new int[n];
    int b[] = new int [n];
    int i=0,j=0,k=0;
    int zeroes=0,non_zeroes=0;
    for(i=0;i<n;i++)
    {
      if(arr[i]==0)
      {
        a[k] = arr[i];
        zeroes++;
        k++;
      }
      else
      {
        b[j] = arr[i];
        non_zeroes++;
        j++;
      }
    }
    int size = n;
    i = 0;
    while(non_zeroes>0)
    {
      arr[i] = b[i];
      non_zeroes--;
      i++;
    }
    k=0;
    while(zeroes>0)
    {
      arr[i] = a[k];
     zeroes--;
      k++;
      i++;
    }
  }
}