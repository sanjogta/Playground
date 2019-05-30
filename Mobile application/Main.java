class MyModel1 {
     //write your logic here
  int camera;
  String lock;
  int display;
  MyModel1()
  {
    camera = 2;
    lock = "No lock";
    display = 5;
  }
  MyModel1(int cam)
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: "+cam);
  }
  
}
class MyModel2 extends MyModel1 {
    MyModel2()
    {
        
    }

    MyModel2(int camera,String lock)
    {
      this.camera = camera;
      this.lock = lock;
      System.out.println("Features of MyModel 2");
      System.out.println("Camera mega pixels: "+this.camera);
      System.out.println("Lock mechanism: "+this.lock);
      System.out.println("Display size: "+display);
    }
    
}
class MyModel2T extends MyModel2 {
  
    MyModel2T(int camera,String lock,int disp)
    {
      this.camera = camera;
      this.lock = lock;
      this.display = disp;
      System.out.println("Features of MyModel 2T");
      System.out.println("Camera mega pixels: "+this.camera);
      System.out.println("Lock mechanism: "+this.lock);
      System.out.println("Display size: "+this.display);
    }
    
}
public class Main 
{
    public static void main(String[] args) 
    {
       MyModel1 m1 = new MyModel1(2);
       MyModel2 m2 = new MyModel2(5,"Fingerprint");
       MyModel2T mt = new MyModel2T(16,"Fingerprint",6);
    }
}