/**
 * 
 */
package car;

/**
 * @author User
 * @time:11:05:24 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class Truck extends Car {
  private int weight;

  /**
   * @param speed
   * @param regularPrice
   * @param color
   */
  public Truck(int speed, double regularPrice, String color, int weight) {
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  /*
   * (non-Javadoc)
   * 
   * @see assignment2.Car#getSalePrice()
   */
  @Override
  public double getSalePrice() {
    // TODO Auto-generated method stub
    return (weight > 2000) ? (getRegularPrice() - 0.1 * getRegularPrice())
        : (getRegularPrice() - 0.2 * getRegularPrice());
  }
}
