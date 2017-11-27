/**
 * 
 */
package car;

/**
 * @author User
 * @time:11:24:27 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class MyOwnAutoShop {
  public static void main(String[] args) {
    Sedan sedan = new Sedan(120, 200000000, "black", 20);
    Ford fords[] = new Ford[2];
    fords[0] = new Ford(80, 100000000, "black", 2005, 1000000);
    fords[1] = new Ford(100, 150000000, "white", 2000, 2000000);
    Truck truck = new Truck(100, 100000000, "red", 100);
    System.out.println(
        "Price of Sedan with color " + sedan.getColor() + " is: " + String.format("%.02f", sedan.getSalePrice()));
    System.out.println(
        "Price of Ford with color " + fords[0].getColor() + " is: " + String.format("%.02f", fords[0].getSalePrice()));
    System.out.println(
        "Price of Ford with color " + fords[1].getColor() + " is: " + String.format("%.02f", fords[1].getSalePrice()));
    System.out.println(
        "Price of Car with color " + truck.getColor() + " is: " + String.format("%.02f", truck.getSalePrice()));
  }
}
