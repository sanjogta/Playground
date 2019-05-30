import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(in);
      
      List<String> month = new ArrayList<String>();
      String search = "";
      
      String line = br.readLine();
      String [] str = line.split(",");
     
      int i=0;
      while(i<str.length)
      {
          month.add(str[i]);
          i++;
      }
      search = br.readLine();
      System.out.println(month);
      System.out.println("Size of the linked list: "+month.size());
      System.out.println("Is LinkedList empty? "+month.isEmpty());
      System.out.println("Does LinkedList contains "+search+"?");
      System.out.println(month.contains(search));
    }
}