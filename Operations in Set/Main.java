import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     Set<Object> set = new LinkedHashSet<Object>();
     int i=0;
     Object n;
     String line = br.readLine();
     Object str[] = line.split(",");
  
     while(i<str.length)
     {
       set.add(str[i]);
       i++;
     }
       System.out.println(set);
      Object del = br.readLine();
      System.out.println("Enter the value to be deleted: "+del);
      set.remove(del);
       System.out.println(set);
        n = br.readLine();
      System.out.println("Enter the value to be added: "+n);
      set.add(n);
      
      System.out.println(set);
    }
}