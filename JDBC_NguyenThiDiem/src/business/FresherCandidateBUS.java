/**
 * 
 */
package business;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.CanlidateDAO;
import dao.FresherCandidateDAO;
import model.Canlidate;
import model.FresherCandidate;
import util.Validate;

/**
 * @author User
 * @time:3:30:17 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class FresherCandidateBUS {
  /**
   * @Description: insert information FresherCandidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:47:51 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:object FresherCandidate
   */
  public boolean insertFresherCandidate(FresherCandidate fresher) throws ClassNotFoundException, SQLException {
    Canlidate canlidate = new Canlidate(fresher.getId(), fresher.getFirstName(), fresher.getLastName(), fresher.getBirthDate(), fresher.getAddress(), fresher.getPhone(), fresher.getEmail(), fresher.getCandidateType());
    FresherCandidate fresherCandidate = new FresherCandidate(fresher.getId(), fresher.getGraduationDate(), fresher.getGraduationRank(),fresher.getEducation());
    if(new CanlidateDAO().insert(canlidate) && new FresherCandidateDAO().insertFresherCandidate(fresherCandidate))
      return true;
    return false;
  }
  /**
   * @Description:get all information FresherCandidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:48:50 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<FresherCandidate> getList() throws SQLException {
    List<FresherCandidate> ex = new FresherCandidateDAO().getList();
    return ex;
  }
  /**
   * @Description: enter information of FresherCandidate form keyboard
   * @Author: User CMC SOFT
   * @Creat date: 4:49:12 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public void input() throws ClassNotFoundException, SQLException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input ID:");
    String id = Validate.inputString(sc);
    System.out.println("Input FirstName:");
    String firstName = Validate.inputString(sc);
    System.out.println("Input LastName:");
    String lastName = Validate.inputString(sc);
    System.out.println("Input BirthDate:");
    int birthDate = Validate.inputInt(sc, 1900, 2017);
    System.out.println("Input Address:");
    String address = Validate.inputString(sc);
    System.out.println("Input Phone(7->12 digit):");
    String phone = Validate.checkNumber(sc);
    System.out.println("Input Email:");
    String email = Validate.inputEmail(sc);
    System.out.println("Input GraduationDate:");
    int graduationDate = Validate.inputInt(sc);
    System.out.println("Input GraduationRank\n1.Excellent\n2.Good\n3.Fair\n4.Poor");
    int graduationRank = Validate.inputInt(sc,1,4);
    System.out.println("Input Education:");
    String education = Validate.inputString(sc);
    FresherCandidate fresher = new FresherCandidate(id, firstName, lastName, birthDate, address, phone, email, 1, graduationDate, graduationRank, education);
    CanlidateDAO canlidateDAO = new CanlidateDAO();
    if(!canlidateDAO.checkID(id)) {
      insertFresherCandidate(fresher);
    }else {
      System.out.println("Id not exit");
    }
  }
  
  /**
   * @Description: print information of FresherCandidate for console
   * @Author: User CMC SOFT
   * @Creat date: 4:49:49 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: List FresherCandidate
   */
  public void show(List<FresherCandidate> ex) {
    System.out.println("Information of FresherCandidate");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "firstName", "lastName", "birthDate",
        "address", "phone", "email", "candidateType", "graduationDate", "graduationRank","education");
    for (int i = 0; i < ex.size(); i++) {
      System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", ex.get(i).getFirstName(),
          ex.get(i).getLastName(), ex.get(i).getBirthDate(), ex.get(i).getAddress(), ex.get(i).getPhone(),
          ex.get(i).getEmail(), "Fresher Cadidate", ex.get(i).getGraduationDate(), ex.get(i).getGraduationRank(), ex.get(i).getEducation());
    }
  }
}
