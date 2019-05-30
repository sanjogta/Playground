import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    convertToFloat(str);
  }
  public static void convertToFloat(StringBuilder str)
  {
    int temp = 0;
    char ch ;
    int div =1;
    int dotInd=0;
    int len = str.length();
    int flag = 0;
    
    for(int i=0;i<len;i++)
    {
      ch = str.charAt(i);
      if(ch>=48 && ch<=57)
        temp = temp*10 + (ch - 48);
      else if(ch == 46)
      {
        dotInd = i;
        flag = 1;
        continue;
      }
    }
    double s;
    
    if(flag ==1)
    {
     while(dotInd>1)
     {
      div = div*10;
      dotInd--;
     }
      s =(double) (temp/10)/10;
    }
    else
       s = temp;

    System.out.printf("%.6f",s); 
  }
}