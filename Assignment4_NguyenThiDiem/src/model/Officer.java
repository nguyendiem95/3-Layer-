/**
 * 
 */
package model;

import util.Constaints;

/**
 * @author User
 * @time:12:56:54 PM
 * @Date Nov 24, 2017
 * @Year:2017
 * @Description
 */
public class Officer extends Staff {
  private String department;
  private String position;

  /**
   * @param fullName
   * @param salaryMultiplier
   * @param workingTime
   * @param allowance
   */
  public Officer(String fullName, double salaryMultiplier, int workingTime, float allowance, String department,
      String position) {
    super(fullName, salaryMultiplier, workingTime, allowance);
    this.department = department;
    this.position = position;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}
