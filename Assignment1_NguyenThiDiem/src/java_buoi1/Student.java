/**
 * 
 */
package java_buoi1;

/**
 * @author User
 * @time:4:23:15 PM
 * @Date Nov 21, 2017
 * @Year:2017
 * @Description
 */
public class Student {
  private String studentId;
  private String name;
  private String birthday;
  
  /**
   * 
   */
  public Student() {
    super();
  }
  
  /**
   * @param studentId
   * @param name
   * @param birthday
   */
  public Student(String studentId, String name, String birthday) {
    super();
    this.studentId = studentId;
    this.name = name;
    this.birthday = birthday;
  }
  public String getStudentId() {
    return studentId;
  }
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
}
