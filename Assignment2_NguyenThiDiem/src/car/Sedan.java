/**
 * 
 */
package car;

/**
 * @author User
 * @time:11:22:09 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class Sedan extends Car {
  private int length;

  /**
   * @param speed
   * @param regularPrice
   * @param color
   */
  public Sedan(int speed, double regularPrice, String color, int length) {
    super(speed, regularPrice, color);
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  /*
   * (non-Javadoc)
   * 
   * @see assignment2.Car#getSalePrice()
   */
  @Override
  public double getSalePrice() {
    // TODO Auto-generated method stub
    return (length > 20) ? (getRegularPrice() - 0.05 * getRegularPrice())
        : (getRegularPrice() - 0.1 * getRegularPrice());
  }
}
