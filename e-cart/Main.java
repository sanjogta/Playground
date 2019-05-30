//import required packages here
import java.util.*;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setCost(int price)
  {
   this.price = price; 
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
    this.product = product;
  }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  public int getQuantity()
  {
    return quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public int calculateCost(int price,int quantity)
  {
    int totalCost = price*quantity;
    return totalCost;
  }
  
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner in = new  Scanner(System.in);
    String name = in.next();
    int price = in.nextInt();
    int quantity = in.nextInt();
    c.setProduct(name);
    i.setCost(price);
    c.setQuantity(quantity);
    int cost = obj.calculateCost(price,quantity);
    System.out.println("Total Price is : "+""+cost);
    
  }
}