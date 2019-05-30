import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      Set<Object> set = new LinkedHashSet<Object>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line;
      line = br.readLine();
      Object []str = line.split(",");
      int i=0;
      while(i<str.length)
      {
        set.add(str[i]);
        i++;
      }
      
      System.out.println(set);
    }
   
}