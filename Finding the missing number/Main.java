import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     int size =in.nextInt();
     int arr[] = new int[size];
     for(int i=0;i<size;i++)
     {
       arr[i] = in.nextInt();
     }
      int flag = 1;
      int count = 1;
      for(int i=0;i<size;i++)
      {
        flag = 0;
        count = i+1;
        for(int j=0;j<size;j++)
        {
         if(count==arr[j])
         {
           flag = 1;
           continue;
         }
        }
        if(flag==0)
          System.out.print(count);
      }
    }
}