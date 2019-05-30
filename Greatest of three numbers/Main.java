import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
      int greatest =0 ;
      if(num1>num2)
        greatest = num1;
      else
        greatest = num2;
      if(greatest<num3)
        greatest = num3;
      
      System.out.println(greatest);
    }
}