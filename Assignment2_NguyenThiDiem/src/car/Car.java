/**
 * 
 */
package car;

/**
 * @author User
 * @time:10:57:12 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
abstract class Car {
  private int speed;
  private double regularPrice;
  private String color;

  /**
   * @param speed
   * @param regularPrice
   * @param color
   */
  public Car(int speed, double regularPrice, String color) {
    super();
    this.speed = speed;
    this.regularPrice = regularPrice;
    this.color = color;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSalePrice() {
    return regularPrice;
  }
}
