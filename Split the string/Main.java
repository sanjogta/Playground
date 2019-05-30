import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

//Qs.3
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         String s1 = "and";
         String s2 = "or";
         Pattern p = Pattern.compile("[,\\s .]|and|or");
          String []splitstr = p.split(str);
         for(String a : splitstr)
         {
             System.out.println(a);
         }
    }
}
