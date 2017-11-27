/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Officer;
import model.Professor;
import model.Staff;
import util.Constaints;

/**
 * @author User
 * @time:1:03:42 PM
 * @Date Nov 24, 2017
 * @Year:2017
 * @Description
 */
public class ControlProfessor {
  static ArrayList<Professor> arrProfessor = new ArrayList<>();

  public enum AcademicDegree {
    bachelor, master, doctor
  };

  public ArrayList<Professor> scannerProfessor(int n) {
    Scanner in;
    for (int i = 0; i < n; i++) {
      System.out.println("Infprmation Officer number " + i);
      in = new Scanner(System.in);
      System.out.println("Full name:");
      String fullName = in.nextLine();
      System.out.println("Salary Multiplier:");
      Double salaryMultiplier = CatchException.inputDouble(in);
      System.out.println("Working time (calculated by hours/ month):");
      int workingTime = CatchException.inputInt(in);
      System.out.println("Faculty:");
      String faculty = in.nextLine();
      System.out.println("Academic degree\n  1. Bachelor\n  2. BachelorBachelor\n  3. Doctor.");
      String academicDegree = null;
      int number;
      Boolean isCheck = true;
      while (isCheck) {
        number = CatchException.inputInt(in);
        switch (number) {
          case 1:
            academicDegree = "bachelor";
            isCheck = false;
            break;
          case 2:
            academicDegree = "master";
            isCheck = false;
            break;
          case 3:
            academicDegree = "doctor";
            isCheck = false;
            break;
          default:
            isCheck = true;
            System.out.println("please enter again ");
        }
      }
      Professor p = new Professor(fullName, salaryMultiplier, workingTime, 0, faculty, academicDegree);
      float allowance = allowanceProfessor(p.getAcademicDegree());
      p.setAllowance(allowance);
      arrProfessor.add(p);
    }
    return arrProfessor;
  }

  public double paySalaryProfessor(Professor p) {
    return (p.getSalaryMultiplier() * 730 + p.getAllowance() + p.getWorkingTime() * 45);
  }

  public float allowanceProfessor(String academicDegree) {
    float allowance;
    if (academicDegree.equals(AcademicDegree.bachelor))
      allowance = 300;
    else if (academicDegree.equals(AcademicDegree.master))
      allowance = 500;
    else
      allowance = 1000;
    return allowance;
  }

  public void showProfessor(Professor p) {
    double salary = paySalaryProfessor(p);
    System.out.printf(Constaints.FORMAT_PROFFESSOR, p.getFullName(), p.getSalaryMultiplier(), p.getFaculty(),
        p.getAcademicDegree(), p.getWorkingTime(), salary);
  }
}
