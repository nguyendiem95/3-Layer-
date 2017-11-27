/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.Officer;
import model.Professor;
import util.Constaints;

/**
 * @author User
 * @time:11:04:27 AM
 * @Date Nov 27, 2017
 * @Year:2017
 * @Description
 */
public class main {
  static ArrayList<Officer> arrOfficer = new ArrayList<>();
  static ArrayList<Professor> arrProfessor = new ArrayList<>();

  public <T> void menu() {
    ControlOfficer con = new ControlOfficer();
    boolean isCheck = true;
    int number;
    Scanner scanner = new Scanner(System.in);
    
    while (isCheck) {
      System.out.println("Choose:");
      System.out.println("1. Input the Officer information");
      System.out.println("2. Input the Professor information");
      System.out.println("3. Search for staffs by name and the department");
      System.out.println("4. Export a list of all the professors and sort them by name.");
      System.out.println("5. Exit");
      number = CatchException.inputInt(scanner);
      switch (number) {
        case 1:
          boolean isCheckNum = true;
          System.out.println("Enter number Officer:");
          int n = 0;
          n = CatchException.inputInt(scanner);
          arrOfficer = con.scannerOfficer(n);
          System.out.printf(Constaints.FORMAT, "Name", "Salary", "Department", "Working time", "Postion", "Sum salary");
          for (int i = 0; i < arrOfficer.size(); i++)
            con.showOfficer(arrOfficer.get(i));
          break;
        case 2:
          ControlProfessor conP = new ControlProfessor();
          isCheckNum = true;
          System.out.println("Enter number Professor:");
          n = 0;
          n = CatchException.inputInt(scanner);
          arrProfessor = conP.scannerProfessor(n);
          System.out.printf(Constaints.FORMAT, "Name", "Salary", "Factury","AcademicDegree", "Working time", "Sum salary");
          for (int i = 0; i < arrProfessor.size(); i++)
            conP.showProfessor(arrProfessor.get(i));
          break;
        case 3:
          System.out.println("Enter name: ");
          String str = scanner.nextLine();
          System.out.println("Enter department: ");
          String str1 = scanner.nextLine();
          ArrayList<Officer> arrO = new ArrayList<>();
          arrO = con.seachByNameAndDepartment(str, str1);
          System.out.printf(Constaints.FORMAT, "Name", "Salary", "Department", "Working time", "Postion", "Sum salary");
          for (int i = 0; i < arrO.size(); i++)
            con.showOfficer(arrO.get(i));
          break;
        case 4:
          break;
        case 5:
          scanner.close();
          System.out.println("Exit programing ");
          System.exit(0);
          break;
        default:
          isCheck = true;
          System.out.println("please enter again ");
      }
    }
  }

  public static void main(String... arg) {
    main control = new main();
    control.menu();
  }
}
