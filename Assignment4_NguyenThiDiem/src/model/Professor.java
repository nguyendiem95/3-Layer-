/**
 * 
 */
package model;

/**
 * @author User
 * @time:11:58:07 AM
 * @Date Nov 24, 2017
 * @Year:2017
 * @Description
 */
public class Professor extends Staff {
  private String faculty;
  private String academicDegree;

  /**
   * @param fullName
   * @param salaryMultiplier
   * @param workingTime
   * @param allowance
   */
  public Professor(String fullName, double salaryMultiplier, int workingTime, float allowance, String faculty,
      String academicDegree) {
    super(fullName, salaryMultiplier, workingTime, allowance);
    this.faculty = faculty;
    this.academicDegree = academicDegree;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public String getAcademicDegree() {
    return academicDegree;
  }

  public void setAcademicDegree(String academicDegree) {
    this.academicDegree = academicDegree;
  }

  public String getFaculty() {
    return faculty;
  }
}
