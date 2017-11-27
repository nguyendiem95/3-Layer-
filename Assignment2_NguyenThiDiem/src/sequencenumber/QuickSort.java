/**
 * 
 */
package sequencenumber;

/**
 * @author User
 * @time:2:08:16 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class QuickSort extends SequenceNumber implements Sort {

  /**
   * @param number
   */
  public QuickSort(int number) {
    super(number);
  }

  /**
   * @Description: sort array by quickSort
   * @Author: User CMC SOFT
   * @Creat date: 5:34:44 PM
   * @Modifier:
   * @Modifined date:
   * @Exception:
   * @param args1:arr[]
   * @param args2:index left of arr
   * @param args1:index right of arr
   */
  private void quickSort(int arr[], int left, int right) {
    int i = left, j = right;
    int temp;
    int middle = arr[(left + right) / 2];
    while (i <= j) {
      while (arr[i] < middle)
        i++;
      while (arr[j] > middle)
        j--;
      if (i <= j) {
        //Swap 2 number
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    if (left < j)
      quickSort(arr, left, j);
    if (i < right)
      quickSort(arr, i, right);
  }

  /*
   * (non-Javadoc)
   * 
   * @see exercises2.Sort#sort()
   */
  @Override
  public void sort() {
    quickSort(getArrNumber(), 0, getArrNumber().length - 1);
  }
}
