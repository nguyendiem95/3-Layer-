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

import model.ExperienceCadidate;

/**
 * @author User
 * @time:1:54:46 PM
 * @Date Nov 28, 2017
 * @Year:2017
 * @Description
 */
public class ExperienceCadidateDAO {
  /**
   * @Description: insert information ExperienceCadidate in to DB
   * @Author: User CMC SOFT
   * @Creat date: 4:55:09 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   * @param args:
   */
  public boolean insertExperienceCadidate(ExperienceCadidate experienceCadidate)
      throws ClassNotFoundException, SQLException {
    Connection connect = sqlseever.ConnectDB.Connect();
    String sql = "Insert into ExperienceCadidate Values(?,?,?)";
    PreparedStatement prepare = connect.prepareStatement(sql);
    prepare.setString(1, experienceCadidate.getId());
    prepare.setInt(2, experienceCadidate.getExpInYear());
    prepare.setString(3, experienceCadidate.getProSkill());
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
   * @Creat date: 4:56:59 PM
   * @Modifier:
   * @Modifined date:
   * @Exception: 
   */
  public List<ExperienceCadidate> getList() throws SQLException {
    Connection connect;
    // ConnectDB connectDB = new ConnectDB();
    try {
      connect = sqlseever.ConnectDB.Connect();
      List<ExperienceCadidate> list = new ArrayList<ExperienceCadidate>();
      // Statement creation
      Statement statement = connect.createStatement();
      // for retrieve data
      ResultSet rs = statement
          .executeQuery("SELECT *FROM ExperienceCadidate JOIN Canlidate ON Canlidate.id = ExperienceCadidate.id");
      while (rs.next()) {
        ExperienceCadidate ex = new ExperienceCadidate();
        ex.setFirstName(rs.getString("firstName"));
        ex.setLastName(rs.getString("lastName"));
        ex.setBirthDate(rs.getInt("birthDate"));
        ex.setAddress(rs.getString("address"));
        ex.setPhone(rs.getString("phone"));
        ex.setEmail(rs.getString("email"));
        ex.setCandidateType(rs.getInt("candidateType"));
        ex.setExpInYear(rs.getInt("expInYear"));
        ex.setProSkill(rs.getString("proSkill"));
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
