import java.util.Scanner;
class Main{
  public static void fun(int n)
  {
    int i;
    int num = 2;
    int flag=0;
    while(num < n)
    {
       flag = 0;
     for(i=2;i<=num/2;i++)
     {
        if(num%i==0)
        {
            flag = 1;
            break;
        }
     }
     if(flag == 0)
     {
      System.out.println(num);
     }
     
      num++;
      
    }
  }
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      fun(num);
	}
}