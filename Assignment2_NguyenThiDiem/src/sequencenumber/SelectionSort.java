/**
 * 
 */
package sequencenumber;

/**
 * @author User
 * @time:2:09:34 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class SelectionSort extends SequenceNumber implements Sort {
  /**
   * @param number
   */
  public SelectionSort(int number) {
    super(number);
  }

  /**
   * @Description: sort array by selection sort
   * @Author: User CMC SOFT
   * @Creat date: 5:36:25 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args:arr[]
   */
  private void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j;
        }
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see exercises2.Sort#sort()
   */
  @Override
  public void sort() {
    selectionSort(getArrNumber());
  }
}
