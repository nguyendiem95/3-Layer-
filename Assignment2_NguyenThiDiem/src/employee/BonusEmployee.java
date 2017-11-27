/**
 * 
 */
package employee;

/**
 * @author User
 * @time:5:27:06 PM
 * @Date Nov 22, 2017
 * @Year:2017
 * @Description
 */
public class BonusEmployee extends Employee {
  private static int bonus;

  /*
   * (non-Javadoc)
   * 
   * @see exercises3.Employee#getMonthlySalary()
   */
  @Override
  public int getMonthlySalary() {
    return getBasicSalary() + bonus;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  public static void main(String[] args) {
    Employee e = new BonusEmployee();
    e.setName("Diem");
    e.setAddress("Ha Noi");
    e.setBasicSalary(1750000);
    bonus = 400000;
    int salary = e.getMonthlySalary();
    System.out.println("Name: " + e.getName() + "\nAddress: " + e.getAddress() + "\nSalary: " + salary);
  }
}
