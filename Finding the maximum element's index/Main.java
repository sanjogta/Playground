import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int j = 0;
    while(in.hasNext())
    {
      a[j] = in.nextInt();
      j++;
    }
    int max = a[0];
    int maxIndex =0;
    for(int i = 0; i<n;i++)
    {
      if(max<a[i])
      {
        max = a[i];
        maxIndex = i;
      }
    }
    System.out.print(maxIndex);
  }
}