/**
 * 
 */
package util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author User
 * @time:1:38:19 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class Validate {
  private Pattern pattern;
  private Matcher matcher;
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
      + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

  public Validate() {
    pattern = Pattern.compile(EMAIL_PATTERN);
  }

  public boolean validate(final String hex) {
    matcher = pattern.matcher(hex);
    return matcher.matches();
  }

  /**
   * @Description: check exception for input is number integer for min-> max
   * @Author: User CMC SOFT
   * @Creat date: 6:02:46 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:
   *          Scanner
   */
  public static int inputInt(Scanner sc, int min, int max) {
    while (true) {
      try {
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        if (n >= min && n <= max) {
          return n;
        }
      } catch (Exception e) {
      }
      System.out.print("Please enter value " + min + " to " + max);
    }
  }

  /**
   * @Description: check exception for input is number integer
   * @Author: User CMC SOFT
   * @Creat date: 6:02:08 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:Scanner
   */
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

  /**
   * @Description: check validate data for Email
   * @Author: User CMC SOFT
   * @Creat date: 8:25:10 AM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:
   *          Scanner
   */
  public static String inputEmail(Scanner sc) {
    while (true) {
      try {
        String s = sc.nextLine();
        Validate validate = new Validate();
        if (s.length() > 1 && validate.validate(s))
          return s;
      } catch (Exception e) {
      }
      System.out.print("Please enter another value: ");
    }
  }

  /**
   * @Description: check exception for input is String
   * @Author: User CMC SOFT
   * @Creat date: 8:25:47 AM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:Scanner
   */
  public static String inputString(Scanner sc) {
    while (true) {
      try {
        String s = sc.nextLine();
        s.charAt(0);
        return s;
      } catch (Exception e) {
      }
      System.out.print("Please enter another value: ");
    }
  }
  /**
   * @Description: check number with regex
   * @Author: User CMC SOFT
   * @Creat date: 5:10:50 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public static String checkNumber(Scanner sc) {
    while (true) {
      String s = sc.nextLine();
      if (s.matches("^(\\d{7}|\\d{12})$")) {
          return s;
      
      }
      System.out.print("Please enter another value: ");
    }
  }
}
