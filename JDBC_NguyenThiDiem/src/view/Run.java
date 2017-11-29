/**
 * 
 */
package view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import business.CanlidateBUS;
import business.ExperienceCadidateBUS;
import business.FresherCandidateBUS;
import business.InternCandidateBUS;
import model.ExperienceCadidate;
import model.FresherCandidate;
import model.InternCandidate;
import util.Validate;

/**
 * @author User
 * @time:3:49:42 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class Run {
  /**
   * @Description: choose number in list program
   * @Author: User CMC SOFT
   * @Creat date: 5:59:55 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   */
  public void menu() throws ClassNotFoundException, SQLException {
    boolean isCheck = true;
    int number;
    Scanner scanner = new Scanner(System.in);
    while (isCheck) {
      System.out.println("Choose:");
      System.out.println("1. Input information Experience Cadidate");
      System.out.println("2. Input information Fresher Cadidate");
      System.out.println("3. Input information Intern Cadidate");
      System.out.println("4. Recruitment");
      System.out.println("5. Show information all");
      System.out.println("6. Exit");
      number = Validate.inputInt(scanner, 1, 6);
      switch (number) {
        case 1:
          new ExperienceCadidateBUS().input();
          List<ExperienceCadidate> ex = new ExperienceCadidateBUS().getList();
          new ExperienceCadidateBUS().show(ex);
          break;
        case 2:
          new FresherCandidateBUS().input();
          List<FresherCandidate> fresher = new FresherCandidateBUS().getList();
          new FresherCandidateBUS().show(fresher);
          break;
        case 3:
          new InternCandidateBUS().input();
          List<InternCandidate> intern = new InternCandidateBUS().getList();
          new InternCandidateBUS().show(intern);
          break;
        case 4:
          new CanlidateBUS().checkInformation();
          break;
        case 5:
          ex = new ExperienceCadidateBUS().getList();
          new ExperienceCadidateBUS().show(ex);
          fresher = new FresherCandidateBUS().getList();
          new FresherCandidateBUS().show(fresher);
          intern = new InternCandidateBUS().getList();
          new InternCandidateBUS().show(intern);
          break;
        case 6:
          scanner.close();
          System.out.println("Exit programing ");
          System.exit(0);
          break;
      }
    }
  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Run run = new Run();
    run.menu();
  }
}
