/**
 * 
 */
package java_buoi1;

/**
 * @author User
 * @time:4:24:59 PM
 * @Date Nov 21, 2017
 * @Year:2017
 * @Description
 */
public class StudentMark {
  private int idStudendMark;
  private Student sudentId;
  private String nameSubject;
  private int point;
  /**
   * 
   */
  public StudentMark() {
    super();
  }
  /**
   * @param sudentId
   * @param nameSubject
   * @param point
   */
  public StudentMark(int idStudendMark, Student sudentId, String nameSubject, int point) {
    super();
    this.idStudendMark = idStudendMark;
    this.sudentId = sudentId;
    this.nameSubject = nameSubject;
    this.point = point;
  }
  public Student getSudentId() {
    return sudentId;
  }
  public void setSudentId(Student sudentId) {
    this.sudentId = sudentId;
  }
  public String getNameSubject() {
    return nameSubject;
  }
  public void setNameSubject(String nameSubject) {
    this.nameSubject = nameSubject;
  }
  public int getPoint() {
    return point;
  }
  public void setPoint(int point) {
    this.point = point;
  }
  public int getIdStudendMark() {
    return idStudendMark;
  }
  public void setIdStudendMark(int idStudendMark) {
    this.idStudendMark = idStudendMark;
  }
}
