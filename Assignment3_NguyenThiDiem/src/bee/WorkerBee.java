/**
 * 
 */
package bee;

/**
 * @author User
 * @time:10:25:00 AM
 * @Date Nov 23, 2017
 * @Year:2017
 * @Description
 */
public class WorkerBee extends Bee {
  /*
   * (non-Javadoc)
   * 
   * @return floating point before sub
   */
  @Override
  public float damage(int point) {
    return (getPointHealth() < 70) ? getPointHealth() : 
      getPointHealth() - ((float) point / 100) * getPointHealth();
  }

  /*
   * (non-Javadoc)
   * 
   * @check status of worker Bee
   */
  @Override
  boolean checkDead(float point) {
    return (point < 70) ? false : true;
  }
}
