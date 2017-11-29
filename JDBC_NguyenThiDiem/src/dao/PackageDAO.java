/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author User
 * @time:6:20:29 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class PackageDAO {
  /**
   * @Description: get package name from DB package
   * @Author: User CMC SOFT
   * @Creat date: 6:36:18 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: int id 
   */
  public String get(int id) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "SELECT * FROM Package" + " WHERE id = " + "'" + id + "'";
    PreparedStatement ps = null;
    try {
      ps = connect.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      String text = null;
      while (rs.next()) {
        text = rs.getString("package");
      }
      return text;

    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  /**
   * @Description: get number package from DB package 
   * @Author: User CMC SOFT
   * @Creat date: 6:36:43 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:int id
   */
  public int getNumber(int id) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "SELECT number FROM Package" + " WHERE id = " + "'" + id + "'";
    PreparedStatement ps = null;
    try {
      ps = connect.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      int text = 0;
      while (rs.next()) {
        text = rs.getInt("number");
      }
      return text;

    } catch (SQLException e) {
      e.printStackTrace();
      return 0;
    }
  }
  
  /**
   * @Description: update number for package
   * @Author: User CMC SOFT
   * @Creat date: 6:36:50 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args1: int number
   * @param args2: int id
   */
  public boolean update(int number, int id) throws SQLException, ClassNotFoundException {
    Connection connect = sqlseever.ConnectDB.Connect();
    PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Package SET number =?  WHERE id = ?");
    preparedStatement.setInt(1, number);
    preparedStatement.setInt(2, id);
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    } finally {
      connect.close();
    }
    return true;
  }
}
