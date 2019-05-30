import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Map<Object,Object> map = new TreeMap<Object,Object>();
       
       int n = Integer.parseInt(br.readLine());
       System.out.println("Enter the number of values to be inserted in map:"+n);
       
       for(int i=0;i<n;i++)
       {
          // Object value = Integer.parseInt(br.readLine());
           Object key = br.readLine();
           Object value = br.readLine();
           
           map.put(key,value);
       }   
       System.out.println(map);
       
       Object index = br.readLine();
       System.out.println("Enter the index to be removed:"+index);
       map.remove(index);
       System.out.println(map);
       
       index = br.readLine();
       Object value = br.readLine();
       System.out.println("Enter the index to insert:"+index);
       System.out.println("Enter the value to be inserted:"+value);
       map.put(index,value);
       System.out.println(map);
           
    }
}