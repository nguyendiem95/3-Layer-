/**
 * 
 */
package model;

/**
 * @author User
 * @time:1:30:01 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class ExperienceCadidate extends Canlidate {
  private int expInYear;
  private String proSkill;

  /**
   * 
   */
  public ExperienceCadidate() {
    super();
  }

  /**
   * @param id
   * @param expInYear
   * @param proSkill
   */
  public ExperienceCadidate (String id, int expInYear, String proSkill) {
    setId(id);
    this.expInYear = expInYear;
    this.proSkill = proSkill;
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
  public ExperienceCadidate(String id, String firstName, String lastName, int birthDate, String address, String phone,
      String email, int candidateType, int expInYear, String proSkill) {
    super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
    this.expInYear = expInYear;
    this.proSkill = proSkill;
  }

  public int getExpInYear() {
    return expInYear;
  }

  public void setExpInYear(int expInYear) {
    this.expInYear = expInYear;
  }

  public String getProSkill() {
    return proSkill;
  }

  public void setProSkill(String proSkill) {
    this.proSkill = proSkill;
  }
}
