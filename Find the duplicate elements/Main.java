import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
  public static void main (String[] args) 
  {
   Scanner sc = new Scanner(System.in);
   TreeSet<String> t = new TreeSet<String>();
  sc.useDelimiter(",");
    System.out.println("Duplicate Entry is:");
  while(sc.hasNext())
  {
    String str = sc.next();
    if(t.contains(str))
      System.out.println(str);
    t.add(str);
   }
  sc.close();
   System.out.println("TreeSet is : "+t);
  }
}
