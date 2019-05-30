import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String search = sc.nextLine();
      String str = sc.nextLine();
      Pattern p = Pattern.compile(search);
      Matcher m = p.matcher(str);
      int i=1;
      int flag = 0;
      while(m.find())
      {
          System.out.println("found: "+i+" : "+m.start()+" - "+m.end());
          flag = 1;
          i++;
      }
      
      if(flag==0)
      System.out.println("The given word is not present in the string");
      else
      System.out.println(i-1);
    }
}