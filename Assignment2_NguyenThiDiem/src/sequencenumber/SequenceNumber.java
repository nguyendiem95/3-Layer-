/**
 * 
 */
package sequencenumber;

import java.util.Scanner;

/**
 * @author User
 * @time:11:51:24 AM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class SequenceNumber {
  private int arrNumber[];
  private int number;

  /**
   * @param arrNumber
   * @param number
   */
  public SequenceNumber(int number) {
    super();
    this.number = number;
  }

  public int[] getArrNumber() {
    return arrNumber;
  }

  public void setArrNumber(int[] arrNumber) {
    this.arrNumber = arrNumber;
  }

  /**
   * @Description: Enter the array element from the keyboard
   * @Author: User CMC SOFT
   * @Creat date: 5:37:01 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   */
  public void input() {
    Scanner sc = new Scanner(System.in);
    arrNumber = new int[number];
    for (int i = 0; i < number; i++)
      arrNumber[i] = sc.nextInt();
  }

  /**
   * @Description: Print out the array element from the keyboard
   * @Author: User CMC SOFT
   * @Creat date: 5:37:56 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   */
  public void print(int arr[], int n) {
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}
