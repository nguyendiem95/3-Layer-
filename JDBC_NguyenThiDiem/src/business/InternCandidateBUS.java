/**
 * 
 */
package business;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.CanlidateDAO;
import dao.InternCandidateDAO;
import model.Canlidate;
import model.InternCandidate;
import util.Validate;

/**
 * @author User
 * @time:3:39:53 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class InternCandidateBUS {
  /**
   * @Description: insert information InternCandidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:47:51 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:object ExperienceCadidate
   */
  public boolean insertInternCandidate(InternCandidate intern) throws ClassNotFoundException, SQLException {
    Canlidate canlidate = new Canlidate(intern.getId(), intern.getFirstName(), intern.getLastName(),
        intern.getBirthDate(), intern.getAddress(), intern.getPhone(), intern.getEmail(), intern.getCandidateType());
    InternCandidate interns = new InternCandidate(intern.getId(), intern.getMajors(), intern.getSemester(),
        intern.getUniversityName());
    if (new CanlidateDAO().insert(canlidate) && new InternCandidateDAO().insertInternCandidate(interns))
      return true;
    return false;
  }
  /**
   * @Description:get all information InternCandidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:48:50 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<InternCandidate> getList() throws SQLException {
    List<InternCandidate> ex = new InternCandidateDAO().getList();
    return ex;
  }
  /**
   * @Description: enter information of InternCandidate form keyboard
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
    System.out.println("Input Majors:");
    String majors = Validate.inputString(sc);
    System.out.println("Input Semester:");
    int semester = Validate.inputInt(sc);
    System.out.println("Input University Name:");
    String universityName = Validate.inputString(sc);
    InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthDate, address, phone, email, 2,
        majors, semester, universityName);
    CanlidateDAO canlidateDAO = new CanlidateDAO();
    if (!canlidateDAO.checkID(id)) {
      insertInternCandidate(internCandidate);
    } else {
      System.out.println("Id not exit");
    }
  }
  /**
   * @Description: print information of InternCandidate for console
   * @Author: User CMC SOFT
   * @Creat date: 4:49:49 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: list InternCandidate
   */
  public void show(List<InternCandidate> ex) {
    System.out.println("Information of InternCandidate");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "firstName", "lastName", "birthDate",
        "address", "phone", "email", "candidateType", "majors", "semester", "universityName");
    for (int i = 0; i < ex.size(); i++) {
      System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", ex.get(i).getFirstName(),
          ex.get(i).getLastName(), ex.get(i).getBirthDate(), ex.get(i).getAddress(), ex.get(i).getPhone(),
          ex.get(i).getEmail(), "Intern Cadidate", ex.get(i).getMajors(), ex.get(i).getSemester(),
          ex.get(i).getUniversityName());
    }
  }
}
