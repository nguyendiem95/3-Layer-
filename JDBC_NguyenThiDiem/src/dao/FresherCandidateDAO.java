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

import model.FresherCandidate;

/**
 * @author User
 * @time:1:54:57 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class FresherCandidateDAO {
  /**
   * @Description:insert information FresherCandidate in to DB
   * @Author: User CMC SOFT
   * @Creat date: 4:55:30 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args: object FresherCandidate
   */
  public boolean insertFresherCandidate(FresherCandidate fresherCandidate) throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "Insert into FresherCandidate Values(?,?,?,?)";
    PreparedStatement prepare = connect.prepareStatement(sql);
    prepare.setString(1, fresherCandidate.getId());
    prepare.setInt(2, fresherCandidate.getGraduationDate());
    prepare.setInt(3, fresherCandidate.getGraduationRank());
    prepare.setString(4, fresherCandidate.getEducation());
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
   * @Description: get all information from DB
   * @Author: User CMC SOFT
   * @Creat date: 4:57:27 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<FresherCandidate> getList() throws SQLException {
    Connection connect;
    // ConnectDB connectDB = new ConnectDB();
    try {
      connect = sqlseever.ConnectDB.Connect();
      List<FresherCandidate> list = new ArrayList<FresherCandidate>();
      // Statement creation
      Statement statement = connect.createStatement();
      // for retrieve data
      ResultSet rs = statement
          .executeQuery("SELECT *FROM FresherCandidate JOIN Canlidate ON Canlidate.id = FresherCandidate.id");
      while (rs.next()) {
        FresherCandidate ex = new FresherCandidate();
        ex.setFirstName(rs.getString("firstName"));
        ex.setLastName(rs.getString("lastName"));
        ex.setBirthDate(rs.getInt("birthDate"));
        ex.setAddress(rs.getString("address"));
        ex.setPhone(rs.getString("phone"));
        ex.setEmail(rs.getString("email"));
        ex.setCandidateType(rs.getInt("candidateType"));
        ex.setGraduationDate(rs.getInt("graduationDate"));
        ex.setGraduationRank(rs.getInt("graduationRank"));
        ex.setEducation(rs.getString("education"));
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
