import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in  = new Scanner(System.in);
      int choice = in.nextInt();
      int flag1 =0,flag2=0;
      int n1=0;
      if(in.hasNext())
      {
         n1 = in.nextInt();
        flag1 =1;
      }
      int n2=0;
      if(in.hasNext())
      {
          n2 = in.nextInt();
          flag2 = 1;
      }
      int res=0;
     // System.out.println("Entering the switch case with choice = "+ choice);
      
      switch(choice)
      {
        case 1://square
                 res = n1*n1;
                System.out.println(res);
          	    break;
        case 2://rectangle
          		 res = n1*n2;
                System.out.println(res);
        		break;
        case 3://triangle
                double result = 0.5*n1*n2;
          	    System.out.println(result);
                break;
        case 4://circle
          		 double res1 = 3.14*n1*n1;
                System.out.println(res1);
                break;
        default:
                break;
      }
    }
}