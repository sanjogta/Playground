import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int temp = num;
    if(num<0)
      num = -num;
     intToString(num,temp);
  }
  public static void  intToString(int num,int ori)
  {
    int count = 0,temp = 0;
    int div = 1;
    StringBuilder str = new StringBuilder("");
    temp = num;
    while(temp>0)
    {
      temp = temp/10;
      count++;
    }
   // System.out.println(count+" --");
  
    while(count>1)
    {
      div = div*10;
      count--;
    }
    //System.out.println(div+"==");
      char ch ;
  
    while(num>0)
    {
      temp = num/div;
      ch = (char)(temp + 48);
      str.append(ch);
      num = num%div;
      div = div/10;
    }
    if(ori<0)
      System.out.println("-"+str);
    else
      System.out.println(str);
  }
}