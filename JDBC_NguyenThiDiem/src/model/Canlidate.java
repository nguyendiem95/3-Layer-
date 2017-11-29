/**
 * 
 */
package model;

/**
 * @author User
 * @time:1:25:11 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class Canlidate {
  private String id;
  private String firstName;
  private String lastName;
  private int birthDate;
  private String address;
  private String phone;
  private String email;
  private int candidateType;

  /**
   * 
   */
  public Canlidate() {
    super();
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
  public Canlidate(String id, String firstName, String lastName, int birthDate, String address, String phone,
      String email, int candidateType) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.candidateType = candidateType;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(int birthDate) {
    this.birthDate = birthDate;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getCandidateType() {
    return candidateType;
  }

  public void setCandidateType(int candidateType) {
    this.candidateType = candidateType;
  }
}
