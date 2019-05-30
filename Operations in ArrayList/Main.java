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
      
      int choice;
    //  int count = 5;
      do
      {
          System.out.println("Choose any one: \n1.Insert\n2.delete\n3.Display\n4.Exit");
          choice = Integer.parseInt(br.readLine());
          switch(choice)
          {
             case 1:   
                 {
                    String line = br.readLine();
                    String [] str = line.split(",");
     
                    int i=0;
                   while(i<str.length)
                    {
                     month.add(str[i]);
                     i++;
                    }
                   // System.out.println(month);
                 }
                 break;
             case 2:
                  int index = Integer.parseInt(br.readLine());
                  System.out.println("Enter the index value to be deleted:"+index);
                  month.remove(index);
                 break;
             case 3:
                  System.out.println(month);
                 break;
             case 4:
                //System.out.println("Exiting");
                 break;
          }
        //  count--;
      }while(choice!=4);   
    }
}