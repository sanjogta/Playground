import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int k = in.nextInt();
      
      for(int i=0;i<size;i++)
        arr[i] = in.nextInt();
      int count[] = new int[k];
       for(int i=0;i<k;i++)
         count[i]=0;
      
      int num = 1;
      
      while(num<=k)
      {
        for(int i = 0;i<size;i++)
        {
          if(num==arr[i])
            count[num-1]++;
        }
        num++;
      }
      num=1;
      for(int i=0;i<k;i++)
      {
        System.out.print(num+" " +count[i]);
        num++;
        System.out.println();
      }
    }
}