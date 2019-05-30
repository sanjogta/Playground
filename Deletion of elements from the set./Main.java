import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<Object> set = new TreeSet<Object>();
      String line = br.readLine();
      Object []str = line.split(",");
      int i=0;
      while(i<str.length)
      {
        set.add(str[i]);
        i++;
      }
      System.out.println(set);
      int size = set.size();
     
    
      while(size>0)
      {
          Object del = set.last();
        set.remove(del);
       
        System.out.println(set);
         size--;
      }
    }
}