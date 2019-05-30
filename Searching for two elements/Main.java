import java.util.Scanner;
class Main{
  public static int search(int key,int []arr)
  {
    int index = -1;
    int flag = 0;
    for(int i=0;i<arr.length;i++)
    {
      if(key == arr[i])
      {
        flag = 1;
        index = i;
        break;
      }
    }
    return index;
  }
    public static void main(String args[]){
      
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size ;i++)
        arr[i] = in.nextInt();
      
      int key1 = in.nextInt();
      int key2 = in.nextInt();
      
      int index_key1 = search(key1,arr);
      int index_key2 = search(key2,arr);
      System.out.println(index_key1);
       System.out.println(index_key2);
    }
}