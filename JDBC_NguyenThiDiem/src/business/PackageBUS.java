/**
 * 
 */
package business;

import java.sql.SQLException;

import dao.PackageDAO;

/**
 * @author User
 * @time:6:21:03 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class PackageBUS {
  /**
   * @Description: get package name from DB package 
   * @Author: User CMC SOFT
   * @Creat date: 6:34:22 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: int id
   */
  public String get(int id) throws ClassNotFoundException, SQLException {
    return new PackageDAO().get(id);
  }
  
  /**
   * @Description: get number package from DB package 
   * @Author: User CMC SOFT
   * @Creat date: 6:35:34 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: int id
   */
  public int getNumber(int id) throws ClassNotFoundException, SQLException {
    return new PackageDAO().getNumber(id);
  }
  
  /**
   * @Description: update number for package
   * @Author: User CMC SOFT
   * @Creat date: 6:36:02 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: int number
   * @param args: int id
   */
  public boolean update(int number, int id) throws SQLException, ClassNotFoundException {
    return new PackageDAO().update(number, id);
  }
}
