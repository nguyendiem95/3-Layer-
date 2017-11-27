/**
 * 
 */
package employee;

/**
 * @author User
 * @time:3:43:50 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class NormalEmployee extends Employee {

  /*
   * (non-Javadoc)
   * 
   * @see exercises3.Employee#getMonthlySalary()
   */
  @Override
  public int getMonthlySalary() {
    return getBasicSalary();
  }

  public static void main(String[] args) {
    Employee e = new NormalEmployee();
    e.setName("Diem");
    e.setAddress("Ha Noi");
    e.setBasicSalary(1750000);
    int salary = e.getMonthlySalary();
    System.out.println("Name: " + e.getName() + "\nAddress: " + e.getAddress() + "\nSalary: " + salary);
  }
}
