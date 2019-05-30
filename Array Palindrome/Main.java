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
      int i =0;
      int j = size-1;
     while(i<=j)
     {
       if(arr[i]==arr[j])
       {
         i++;
         j--;
       }
       else
       {
         flag = 0;
         break;
       }
     }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}