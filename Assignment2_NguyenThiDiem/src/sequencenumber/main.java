/**
 * 
 */
package sequencenumber;

/**
 * @author User
 * @time:4:45:13 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class main {
  public static void main(String[] args) {
    SelectionSort in = new SelectionSort(5);
    System.out.println("Enter 5 number from the keyboard");
    in.input();
    in.sort();
    System.out.print("Arrays after sorting by SelectionSort: ");
    in.print(in.getArrNumber(), in.getArrNumber().length);

    QuickSort q = new QuickSort(5);
    q.setArrNumber(in.getArrNumber());
    q.sort();
    System.out.print("\nArrays after sorting by QuickSort: ");
    q.print(q.getArrNumber(), q.getArrNumber().length);

    InsertSort i = new InsertSort(5);
    i.setArrNumber(in.getArrNumber());
    i.sort();
    System.out.print("\nArrays after sorting by InsertSort: ");
    i.print(i.getArrNumber(), i.getArrNumber().length);
  }
}
