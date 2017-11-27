/**
 * 
 */
package bee;

/**
 * @author User
 * @time:9:36:37 AM
 * @Date Nov 23, 2017
 * @Year:2017
 * @Description
 */
public class QueenBee extends Bee {
  /*
   * (non-Javadoc)
   * 
   * @return floating point before sub
   */
  @Override
  public float damage(int point) {
    return (getPointHealth() < 20) ? getPointHealth() : 
      getPointHealth() - ((float) point / 100) * getPointHealth();
  }

  /*
   * (non-Javadoc)
   * 
   * @check status of queen Bee
   */
  @Override
  boolean checkDead(float point) {
    return (point < 20) ? false : true;
  }
}
