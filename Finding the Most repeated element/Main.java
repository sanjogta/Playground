import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[]= new int[size];
    int copy[] = new int[size];
    for(int i=0;i<size;i++)
    {
      arr[i] = in.nextInt();
    }
    int freq[] = new int[size];
    int count=0;
      for(int i=0;i<size;i++)
      {
       count=0;
       for(int j=i+1;j<size;j++)
       {
        if(arr[i]==arr[j]&&arr[j]!=-1)
        {
         arr[j]=-1;
         count++;
         }
        }
        freq[i]=count;
       }
    int ind=0, max = 0;
    for(int i=0;i<size;i++)
    {
      if(max<freq[i])
      {
        max = freq[i];
        ind=i;
      }
    }
    System.out.println(arr[ind]);
    
  }
}