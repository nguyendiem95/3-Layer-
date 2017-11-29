/**
 * 
 */
package model;

/**
 * @author User
 * @time:1:35:30 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class InternCandidate extends Canlidate {
  private String majors;
  private int semester;
  private String universityName;

  /**
   * 
   */
  public InternCandidate() {
    super();
  }

  /**
   * @param majors
   * @param semester
   * @param universityName
   */
  public InternCandidate(String id,String majors, int semester, String universityName) {
    super();
    setId(id);
    this.majors = majors;
    this.semester = semester;
    this.universityName = universityName;
  }

  /**
   * @param firstName
   * @param lastName
   * @param birthDate
   * @param address
   * @param phone
   * @param email
   * @param candidateType
   */
  public InternCandidate(String id, String firstName, String lastName, int birthDate, String address, String phone,
      String email, int candidateType, String majors, int semester, String universityName) {
    super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
    this.majors = majors;
    this.semester = semester;
    this.universityName = universityName;
  }

  public String getMajors() {
    return majors;
  }

  public void setMajors(String majors) {
    this.majors = majors;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public String getUniversityName() {
    return universityName;
  }

  public void setUniversityName(String universityName) {
    this.universityName = universityName;
  }

}
