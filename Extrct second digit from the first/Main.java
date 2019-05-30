import java.util.Scanner;
class Main
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
      int count = 0;
      int num = in.nextInt();
      int copy_num = num;
       int sec_digit = 0;
      while(copy_num > 0)
      {
        copy_num = copy_num/10;
        count++;
      }
    //  System.out.println(count);
      copy_num = num;
   if(count>2)
   {
      while(count>2)
      {
        copy_num = copy_num/10;
        sec_digit = copy_num;
        count--;
      }
   }
    sec_digit = copy_num;
   sec_digit = sec_digit%10;
     System.out.println(sec_digit);
 }
}

  