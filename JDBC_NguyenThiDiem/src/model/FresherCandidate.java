/**
 * 
 */
package model;

/**
 * @author User
 * @time:1:29:09 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class FresherCandidate extends Canlidate {
  private int graduationDate;
  private int graduationRank;
  private String education;
  
  /**
   * 
   */
  public FresherCandidate() {
    super();
  }

  /**
   * @param graduationDate
   * @param graduationRank
   * @param education
   */
  public FresherCandidate(String id,int graduationDate, int graduationRank, String education) {
    super();
    setId(id);
    this.graduationDate = graduationDate;
    this.graduationRank = graduationRank;
    this.education = education;
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
  public FresherCandidate(String id, String firstName, String lastName, int birthDate, String address, String phone,
      String email, int candidateType, int graduationDate, int graduationRank, String education) {
    super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
    this.graduationDate = graduationDate;
    this.graduationRank = graduationRank;
    this.education = education;
  }

  public int getGraduationDate() {
    return graduationDate;
  }

  public void setGraduationDate(int graduationDate) {
    this.graduationDate = graduationDate;
  }

  public int getGraduationRank() {
    return graduationRank;
  }

  public void setGraduationRank(int graduationRank) {
    this.graduationRank = graduationRank;
  }

  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }
}
