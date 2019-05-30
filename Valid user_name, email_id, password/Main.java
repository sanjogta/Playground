import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
//Qs.2
class User
{
  private String user_name;
  private String email_id;
  private String password;
  User(String name,String eid,String pwd)
  {
      user_name = name;
      password = pwd;
      email_id = eid;
  }
  public void verifyUser()
  {
    int flag1 = 0,flag2=0,flag3=0;
   
    System.out.println("Is "+user_name+" a valid user name? "+Pattern.matches("[a-zA-Z_0-9-]+",user_name));
    System.out.println("Is "+email_id+" a valid email address? "+Pattern.matches("[a-z0-9@_.]+",email_id));
    System.out.println("Is "+password+" a valid password? "+Pattern.matches("[a-zA-Z0-9@#$%]+",password));
 
  }
}
public class Main
{
    public static void main(String []args)
    {
     Scanner sc = new Scanner(System.in) ;
     String name = sc.nextLine();
     String eid = sc.nextLine();
     String pwd = sc.nextLine();
     User user1 = new User(name,eid,pwd);
     user1.verifyUser();
    }
}
