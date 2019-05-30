import java.util.Scanner;
class Main{
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       String str2 = sc.nextLine();
       StringBuilder sb = new StringBuilder(str1);
       StringBuilder tmp = new StringBuilder(str2);
    int len1 = sb.length();
    int len2 = tmp.length();
    int count = 0;
    for(int i=0;i<(len1 - len2 +1);i++)
    {
      boolean isMatching = true;
      for(int j=0;j<len2;j++)
      {
        if(sb.charAt(i+j) != tmp.charAt(j))
        {
          isMatching = false;
        }
      }
      if(isMatching == true)
        count++;
     }
    System.out.println(count);
  } 
}