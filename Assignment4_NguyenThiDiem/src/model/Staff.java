/**
 * 
 */
package model;

/**
 * @author User
 * @time:11:36:35 AM
 * @Date Nov 24, 2017
 * @Year:2017
 * @Description
 */
public abstract class Staff {
  private String fullName;
  private double salaryMultiplier;
  private int workingTime;
  private float allowance;

  /**
   * @param fullName
   * @param salaryMultiplier
   * @param workingTime
   */
  public Staff(String fullName, double salaryMultiplier, int workingTime, float allowance) {
    super();
    this.fullName = fullName;
    this.salaryMultiplier = salaryMultiplier;
    this.workingTime = workingTime;
    this.allowance = allowance;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public double getSalaryMultiplier() {
    return salaryMultiplier;
  }

  public void setSalaryMultiplier(double salaryMultiplier) {
    this.salaryMultiplier = salaryMultiplier;
  }

  public int getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(int workingTime) {
    this.workingTime = workingTime;
  }

  public float getAllowance() {
    return allowance;
  }

  public void setAllowance(float allowance) {
    this.allowance = allowance;
  }

}
