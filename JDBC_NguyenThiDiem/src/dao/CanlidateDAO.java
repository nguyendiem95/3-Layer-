/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Canlidate;

/**
 * @author User
 * @time:2:53:06 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class CanlidateDAO {
  /**
   * @Description: insert information Candidate in to DB
   * @Author: User CMC SOFT
   * @Creat date: 4:54:18 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public boolean insert(Canlidate canlidate) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "Insert into Canlidate Values(?,?,?,?,?,?,?,?)";
    PreparedStatement prepare = connect.prepareStatement(sql);
    prepare.setString(1, canlidate.getId());
    prepare.setString(2, canlidate.getFirstName());
    prepare.setString(3, canlidate.getLastName());
    prepare.setInt(4, canlidate.getBirthDate());
    prepare.setString(5, canlidate.getAddress());
    prepare.setString(6, canlidate.getPhone());
    prepare.setString(7, canlidate.getEmail());
    prepare.setInt(8, canlidate.getCandidateType());
    try {
      prepare.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    } finally {
      connect.close();
    }
    return true;
  }
  
  /**
   * @Description: check id in Candidate already exists
   * @Author: User CMC SOFT
   * @Creat date: 4:53:03 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:String id
   */
  public boolean checkID( String id) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "SELECT * FROM Canlidate" + " WHERE id=" + "'" + id + "'";

    try {
      Statement ps = connect.createStatement();
      ResultSet rs = ps.executeQuery(sql);
      while (rs.next()) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      connect.close();
    }
    return false;
  }
  /**
   * @Description: search candidate 
   * @Author: User CMC SOFT
   * @Creat date: 5:35:54 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: String email
   */
  public int getCanlidate(String email) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "SELECT * FROM Canlidate" + " WHERE email = " + "'" + email + "'";
    PreparedStatement ps = null;
    try {
      ps = connect.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      int canlidateType = -1;
      while (rs.next()) {
        canlidateType = rs.getInt("candidateType");
      }
      return canlidateType;

    } catch (SQLException e) {
      e.printStackTrace();
      return -1;
    }
  }
  
}
