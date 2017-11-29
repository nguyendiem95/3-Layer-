/**
 * 
 */
package business;

import java.sql.SQLException;
import java.util.Scanner;

import dao.CanlidateDAO;
import util.Validate;

/**
 * @author User
 * @time:5:41:58 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class CanlidateBUS{
  public int getCanlidate(String email) throws ClassNotFoundException, SQLException {
    return new CanlidateDAO().getCanlidate(email);
  }
  /**
   * @Description: check matching for recruitment
   * @Author: User CMC SOFT
   * @Creat date: 6:33:27 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public void checkInformation() throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Email:");
    String email = Validate.inputEmail(scanner);
    System.out.println("Enter recruitment Package:");
    int recruitmentPackage = Validate.inputInt(scanner,10000,99999);
    int canlidate = getCanlidate(email);
    //if email not exit
    if(canlidate==-1) {
      System.out.println("This candidate not matching");
    }else {
      String text = new PackageBUS().get(recruitmentPackage);
      if(text.equals("")) {
        System.out.println("This candidate not matching");
      }else {
        int cadidateType = -1;
        if(text.equals("A")) {
          cadidateType = 0;
        }else if(text.equals("B")) {
          cadidateType = 1;
        }else if(text.equals("C")){
          cadidateType =2;
        }
        if(canlidate == cadidateType) {
          int num = new PackageBUS().getNumber(recruitmentPackage);
          new PackageBUS().update(num+1, recruitmentPackage);
          System.out.println("Submit this candidate successfully");
        }else {
          System.out.println("This candidate not matching2");
        }
      }
    }
  }
}
