/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.InternCandidate;

/**
 * @author User
 * @time:1:55:09 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class InternCandidateDAO {
  /**
   * @Description:insert information InternCandidate in to DB
   * @Author: User CMC SOFT
   * @Creat date: 4:56:34 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public boolean insertInternCandidate(InternCandidate internCandidate) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "Insert into InternCandidate Values(?,?,?,?)";
    PreparedStatement prepare = connect.prepareStatement(sql);
    prepare.setString(1, internCandidate.getId());
    prepare.setString(2, internCandidate.getMajors());
    prepare.setInt(3, internCandidate.getSemester());
    prepare.setString(4, internCandidate.getUniversityName());
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
   * @Description:get all information from DB
   * @Author: User CMC SOFT
   * @Creat date: 4:56:53 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<InternCandidate> getList() throws SQLException {
    Connection connect;
    // ConnectDB connectDB = new ConnectDB();
    try {
      connect = sqlseever.ConnectDB.Connect();
      List<InternCandidate> list = new ArrayList<InternCandidate>();
      // Statement creation
      Statement statement = connect.createStatement();
      // for retrieve data
      ResultSet rs = statement
          .executeQuery("SELECT *FROM InternCandidate JOIN Canlidate ON Canlidate.id = InternCandidate.id");
      while (rs.next()) {
        InternCandidate ex = new InternCandidate();
        ex.setFirstName(rs.getString("firstName"));
        ex.setLastName(rs.getString("lastName"));
        ex.setBirthDate(rs.getInt("birthDate"));
        ex.setAddress(rs.getString("address"));
        ex.setPhone(rs.getString("phone"));
        ex.setEmail(rs.getString("email"));
        ex.setCandidateType(rs.getInt("candidateType"));
        ex.setMajors(rs.getString("majors"));
        ex.setSemester(rs.getInt("semester"));
        ex.setUniversityName(rs.getString("universityName"));
        list.add(ex);
      }
      connect.close();
      return list;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      return null;
    }
  }
}
