import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Map<String,Integer> map = new LinkedHashMap<String,Integer>();
      
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+n);
      
      for(int i=0;i<n;i++)
      {
        String key = br.readLine();
        int value = Integer.parseInt(br.readLine());
        map.put(key,value);
      }
      System.out.println(map);
      String index = br.readLine();
      System.out.println("Enter the index to be removed:"+index);
      map.remove(index);
      System.out.println(map);
      System.out.println("Size of map is : "+map.size());
      
    }
}