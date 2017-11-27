/**
 * 
 */
package sequencenumber;

/**
 * @author User
 * @time:2:10:09 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class InsertSort extends SequenceNumber implements Sort {
  /**
   * @param number
   */
  public InsertSort(int number) {
    super(number);
  }

  /*
   * (non-Javadoc)
   * 
   * @see exercises2.Sort#sort()
   */
  @Override
  public void sort() {
    insertSort(getArrNumber());
  }

  /**
   * @Description: sort array by insertSort
   * @Author: User CMC SOFT
   * @Creat date: 5:33:28 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args: arr[]
   */
  private void insertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int index = i;
      while (index > 0 && arr[index - 1] > arr[index]) {
        //Swap 2 number
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
        index--;
      }
    }
  }
}
