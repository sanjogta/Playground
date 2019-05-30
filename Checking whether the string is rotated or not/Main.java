import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
      StringBuilder sb1 = new StringBuilder(sc.nextLine());
      StringBuilder sb2 = new StringBuilder(sc.nextLine());
      sb1.append(sb1);
      //System.out.println(sb1);
      int len1 = sb1.length();
      int len2 = sb2.length();
      int j=0;
      int flag=1;
        while(sb2.charAt(0)!=sb1.charAt(j))
              j++;
      j++;
      for(int i=1;i<len2;)
      {
        if(sb2.charAt(i)==sb1.charAt(j) && j<len1)
        {
          j++;
          i++;
        }
        else
        {
          flag=0;
          break;
        }
      }
      if(flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}