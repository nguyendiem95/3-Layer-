/**
 * 
 */
package car;

/**
 * @author User
 * @time:11:16:54 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class Ford extends Car {
  private int year;
  private int manufacturerDiscount;

  /**
   * @param speed
   * @param regularPrice
   * @param color
   */
  public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
    super(speed, regularPrice, color);
    this.year = year;
    this.manufacturerDiscount = manufacturerDiscount;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getManufacturerDiscount() {
    return manufacturerDiscount;
  }

  public void setManufacturerDiscount(int manufacturerDiscount) {
    this.manufacturerDiscount = manufacturerDiscount;
  }

  /*
   * (non-Javadoc)
   * 
   * @see assignment2.Car#getSalePrice()
   */
  @Override
  public double getSalePrice() {
    // TODO Auto-generated method stub
    return getRegularPrice() - manufacturerDiscount;
  }
}
