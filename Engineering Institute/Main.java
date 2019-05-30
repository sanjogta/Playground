import java.util.*;

class Faculty
{
  public static int base;
  
  public void salary()
  {
    Scanner in = new Scanner(System.in);
    base = in.nextInt();
    System.out.println("Base Salary: "+base);  
  }
 
}
class CSE extends Faculty
{
  int CSE_salary = 0;
  
  public void salary()
  {

    CSE_salary =  base + 3000;
    System.out.println("CSE Faculty: "+CSE_salary);
  }
}
class IT extends Faculty
{
  int IT_salary = 0;
  public void salary()
  {
    IT_salary = base + 5000;
    System.out.println("IT Faculty: "+IT_salary);
  }
}
class ECE extends Faculty
{
  int ECE_salary = 0;
  public void salary()
  {
    ECE_salary = base + 4500;
    System.out.println("ECE Faculty: "+ECE_salary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty f = new Faculty();
    f.salary();
    CSE cse = new CSE();
    cse.salary();
    IT it = new IT();
    it.salary();
    ECE obj = new ECE();
    obj.salary();
  }
}