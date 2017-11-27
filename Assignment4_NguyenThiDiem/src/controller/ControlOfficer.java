/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ControlProfessor.AcademicDegree;
import model.Officer;
import model.Professor;
import util.Constaints;

/**
 * @author User
 * @time:11:02:13 AM
 * @Date Nov 27, 2017
 * @Year:2017
 * @Description
 */
public class ControlOfficer {
  static ArrayList<Officer> arrOfficer = new ArrayList<>();
  
  public enum Position {

    DEPARTMENT_HEAD {
      @Override
      public String toString() {
        return "department head";
      }
    },
    VICE_HEAD {
      @Override
      public String toString() {
        return "vice head";
      }
    },
    STAFF {
      @Override
      public String toString() {
        return "staff";
      }
    }
  }

  public ArrayList<Officer> scannerOfficer(int n) {
    Scanner in;
    for (int i = 0; i < n; i++) {
      System.out.println("Infprmation Officer number " + (i+1));
      in = new Scanner(System.in);
      System.out.println("Full name:");
      String fullName = in.nextLine();
      System.out.println("Salary Multiplier:");
      Double salaryMultiplier = CatchException.inputDouble(in);
      System.out.println("Working time (calculated by days):");
      int workingTime = CatchException.inputInt(in);
      System.out.println("Department:");
      String department = in.nextLine();
      System.out.println("Position:\n  1. Department head\n  2. Vice head\n  3. Staff.");
      String position = null;
      int number;
      Boolean isCheck = true;
      while (isCheck) {
        number = CatchException.inputInt(in);
        switch (number) {
          case 1:
            position = "Department head";
            isCheck = false;
            break;
          case 2:
            position = "Vice head";
            isCheck = false;
            break;
          case 3:
            position = "Staff";
            isCheck = false;
            break;
          default:
            isCheck = true;
            System.out.println("please enter again ");
        }
      }
      Officer o = new Officer(fullName, salaryMultiplier, workingTime, 0, department, position);
      float allowance = allowanceOfficer(o.getDepartment());
      o.setAllowance(allowance);
      arrOfficer.add(o);
    }
    return arrOfficer;
  }

  public void showOfficer(Officer o) {
    double salary = paySalaryOfficer(o);
    System.out.printf(Constaints.FORMAT_OFFICER, o.getFullName(), o.getSalaryMultiplier(), o.getDepartment(),
        o.getWorkingTime(), o.getPosition(), salary);
  }

  public float allowanceOfficer(String department) {
    float allowance;
    if (department.equals(Position.DEPARTMENT_HEAD))
      allowance = 2000;
    else if (department.equals(Position.VICE_HEAD))
      allowance = 1000;
    else
      allowance = 500;
    return allowance;
  }

  public double paySalaryOfficer(Officer o) {
    return (o.getSalaryMultiplier() * 730 + o.getAllowance() + o.getWorkingTime() * 30);
  }
  
  public ArrayList<Officer> seachByNameAndDepartment(String str, String str1){
    ArrayList<Officer> arr = new ArrayList<>();
    for(int i=0;i< arrOfficer.size();i++) {
      if(arrOfficer.get(i).getFullName().equals(str) && arrOfficer.get(i).getDepartment().equals(str1) ) {
        arr.add(arrOfficer.get(i));
      }
    }
    return arr;
  }
}
