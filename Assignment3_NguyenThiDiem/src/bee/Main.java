/**
 * 
 */
package bee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import until.Constaints;

/**
 * @author User
 * @time:10:39:14 AM
 * @Date Nov 23, 2017
 * @Year:2017
 * @Description
 */
public class Main {
  private static ArrayList<Bee> arrBees = new ArrayList<>();
  public static Constaints ct = new Constaints();
  Random rd = new Random();

  /**
   * @Description: mix array with count times
   * @Author: User CMC SOFT
   * @Creat date: 5:28:21 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args1:
   *          array list arr
   * @param args2:
   */
  public void mix(ArrayList<Bee> arr, int count) {
    int a, b;
    for (int i = 0; i < count; i++) {
      a = rd.nextInt(10);
      b = rd.nextInt(10);
      while (b == a) {
        b = rd.nextInt(10);
      }
      Collections.swap(arr, a, b);
    }
  }

  /**
   * @Description: create list bee with floating- point healthy with 100%
   * @Author: User CMC SOFT
   * @Creat date: 2:04:30 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   */
  public void createBee() {
    Bee queenBee = new QueenBee();
    Bee workBee = new WorkerBee();
    Bee droneBee = new DroneBee();
    arrBees.add(queenBee);
    arrBees.add(workBee);
    arrBees.add(droneBee);
    for (int i = 0; i < 7; i++) {
      int num = rd.nextInt(3);
      if (num == 0) {
        queenBee = new QueenBee();
        arrBees.add(queenBee);
      } else if (num == 1) {
        workBee = new WorkerBee();
        arrBees.add(workBee);
      } else {
        droneBee = new DroneBee();
        arrBees.add(droneBee);
      }
    }
    mix(arrBees, 3);
  }

  /**
   * @Description: random floating- point healthy for Bee in (0-> 80)
   * @Author: User CMC SOFT
   * @Creat date: 2:06:24 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:ArrsayList
   *          Bee
   */
  public void attackBees(ArrayList<Bee> arr) {
    Random rd = new Random();
    int pointRandom = 0;
    float pointHealth = 0;
    boolean isCheck = true;
    System.out.printf(ct.STR_FOMAT1, ct.STR_BEE_NUMBER, ct.STR_CLASS, ct.STR_SATUS, 
                      ct.STR_HEALTHY);
    for (int i = 0; i < 10; i++) {
      pointRandom = rd.nextInt(80);
      pointHealth = arr.get(i).damage(pointRandom);
      arr.get(i).setPointHealth(pointHealth);
      isCheck = arr.get(i).checkDead(pointHealth);
      if (isCheck == false)
        System.out.printf(ct.STR_FOMAT2, (i + 1), 
            arr.get(i).getClass().getName().substring(4), "DEAD",
            arr.get(i).getPointHealth());
      else
        System.out.printf(ct.STR_FOMAT2, (i + 1), 
            arr.get(i).getClass().getName().substring(4), "NOT DEAD",
            arr.get(i).getPointHealth());
    }
  }

  /**
   * @Description: Display the selection then print out the result(switch- case)
   * @Author: User CMC SOFT
   * @Creat date: 9:50:19 AM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public void menu() {
    boolean isCheck = true;
    int number;
    createBee();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose:");
    System.out.println("1. Create list bee");
    System.out.println("2. Create list bee with floating- point health random value between 0 and 80");
    System.out.println("3. Exit");
    while (isCheck) {
      try {
        number = Integer.parseInt(scanner.next());
        switch (number) {
          case 1:
            System.out.printf(ct.STR_FOMAT1, ct.STR_BEE_NUMBER, ct.STR_CLASS, ct.STR_SATUS, ct.STR_HEALTHY);
            Bee bee = new QueenBee();
            arrBees = new ArrayList<>();
            createBee();
            bee.show(arrBees);
            break;
          case 2:
            attackBees(arrBees);
            break;
          case 3:
            scanner.close();
            System.out.println("Exit programing ");
            System.exit(0);
            break;
          default:
            isCheck = true;
            System.out.println("please enter again ");
        }
      } catch (Exception e) {
        System.out.println("Enter the wrong format ");
        System.out.println("please enter again ");
      }
    }
  }

  public static void main(String[] arg) {
    Main main = new Main();
    main.menu();
  }
}
