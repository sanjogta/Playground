import java.util.*;
class Print<T>
{
  public void display(T val)
  {
      if(val.getClass().getName().equals("java.lang.Integer"))
    System.out.println("Integer Value: "+val);
    
    else if(val.getClass().getName().equals("java.lang.String"))
    System.out.println("String Value: "+val);
    
    else
    System.out.println("Float value: "+val);
  }
}
public class Main<T> 
{ 
  // type your code here
  public static void main(String[] args) 
     { 
      Scanner sc = new Scanner(System.in);
     // Scanner sc2 = new Scanner(System.in);
      int val = sc.nextInt();
      String str = sc.next();
      float num = sc.nextFloat();
      Print<Integer> p = new Print<Integer>();
      p.display(val);
       Print<String> p2 = new Print<String>();
      p2.display(str);
       Print<Float> p3 = new Print<Float>();
      p3.display(num);
      }
 }
