/**
 * 
 */
package business;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.CanlidateDAO;
import dao.ExperienceCadidateDAO;
import model.Canlidate;
import model.ExperienceCadidate;
import util.Validate;

/**
 * @author User
 * @time:3:08:01 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class ExperienceCadidateBUS {
  /**
   * @Description: insert information ExperienceCadidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:47:51 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:object ExperienceCadidate
   */
  public boolean insertExperienceCadidate(ExperienceCadidate experienceCadidate)
      throws ClassNotFoundException, SQLException {
    Canlidate canlidate = new Canlidate(experienceCadidate.getId(), experienceCadidate.getFirstName(),
        experienceCadidate.getLastName(), experienceCadidate.getBirthDate(), experienceCadidate.getAddress(),
        experienceCadidate.getPhone(), experienceCadidate.getEmail(), experienceCadidate.getCandidateType());
    ExperienceCadidate experienceCa = new ExperienceCadidate(experienceCadidate.getId(),
        experienceCadidate.getExpInYear(), experienceCadidate.getProSkill());
    if (new CanlidateDAO().insert(canlidate) && new ExperienceCadidateDAO().insertExperienceCadidate(experienceCa))
      return true;
    return false;
  }

  /**
   * @Description:get all information ExperienceCadidate from DB, call function from DAO
   * @Author: User CMC SOFT
   * @Creat date: 4:48:50 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<ExperienceCadidate> getList() throws SQLException {
    List<ExperienceCadidate> ex = new ExperienceCadidateDAO().getList();
    return ex;
  }

  /**
   * @Description: enter information of ExperienceCadidate form keyboard
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
    System.out.println("Input expInYear:");
    int expInYear = Validate.inputInt(sc, 0, 100);
    System.out.println("Input ProSkill:");
    String proSkill = Validate.inputString(sc);
    ExperienceCadidate ex = new ExperienceCadidate(id, firstName, lastName, birthDate, address, phone, email, 0,
        expInYear, proSkill);
    CanlidateDAO canlidateDAO = new CanlidateDAO();
    //if id is not exit
    if (!canlidateDAO.checkID(id)) {
      insertExperienceCadidate(ex);
    } else {
      System.out.println("Id not exit");
    }
  }

  /**
   * @Description: print information of ExperienceCadidate for console
   * @Author: User CMC SOFT
   * @Creat date: 4:49:49 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:List ExperienceCadidate
   */
  public void show(List<ExperienceCadidate> ex) {
    System.out.println("Information of ExperienceCadidate");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "firstName", "lastName", "birthDate",
        "address", "phone", "email", "candidateType", "expInYear", "proSkill");
    for (int i = 0; i < ex.size(); i++) {
      System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", ex.get(i).getFirstName(),
          ex.get(i).getLastName(), ex.get(i).getBirthDate(), ex.get(i).getAddress(), ex.get(i).getPhone(),
          ex.get(i).getEmail(), "Experience Cadidate", ex.get(i).getExpInYear(), ex.get(i).getProSkill());
    }
  }
}
