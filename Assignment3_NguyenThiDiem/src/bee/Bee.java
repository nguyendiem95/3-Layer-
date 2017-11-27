/**
 * 
 */
package bee;

import java.util.ArrayList;

import until.Constaints;

/**
 * @author User
 * @time:9:36:28 AM
 * @Date Nov 23, 2017
 * @Year:2017
 * @Description
 */
abstract class Bee {
  private float pointHealth;

  /**
   * 
   */
  public Bee() {
    super();
    this.pointHealth = 100;
  }

  /**
   * @param pointHealth
   */
  public Bee(float pointHealth) {
    super();
    this.pointHealth = pointHealth;
  }

  public float getPointHealth() {
    return pointHealth;
  }

  public void setPointHealth(float pointHealth) {
    this.pointHealth = pointHealth;
  }

  abstract float damage(int point);

  abstract boolean checkDead(float point);

  /**
   * @Description: show information Bees out console
   * @Author: User CMC SOFT
   * @Creat date: 8:23:19 AM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public void show(ArrayList<Bee> arrBees) {
    Constaints con = new Constaints();
    for (int i = 0; i < 10; i++)
      System.out.printf(con.STR_FOMAT2, (i + 1), 
          arrBees.get(i).getClass().getName().substring(4), 
          "NOT DEAD",
          arrBees.get(i).getPointHealth());
  }
}
