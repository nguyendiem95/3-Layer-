/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @author User
 * @time:4:02:12 PM
 * @Date Nov 24, 2017
 * @Year:2017
 * @Description
 */
public class CatchException {

  public static int inputInt(Scanner sc) {
    while (true) {
      try {
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        return n;
      } catch (Exception e) {
      }
      System.out.print("Please enter another value: ");
    }

  }

  public static double inputDouble(Scanner sc) {
    while (true) {
      try {
        String s = sc.nextLine();
        double n = Double.parseDouble(s);
        return n;
      } catch (Exception e) {
      }
      System.out.print("Please enter another value: ");
    }
  }

  public static float inputFloat(Scanner sc) {
    while (true) {
      try {
        String s = sc.nextLine();
        float n = Float.parseFloat(s);
        return n;
      } catch (Exception e) {
      }
      System.out.print("Please enter another value: ");
    }
  }
}
