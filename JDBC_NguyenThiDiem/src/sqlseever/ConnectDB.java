/**
 * 
 */
package sqlseever;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author User
 * @time:1:40:14 PM
 * @Date Nov 27, 2017
 * @Year:2017
 * @Description
 */
public class ConnectDB {
  static String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static String URL = "jdbc:sqlserver://localhost:1433"
      + ";instance=SQLEXPRESS;databaseName=CMC;integratedSecurity=true;";

  /**
   * Method return connection database
   * @description: handle connection database
   * @throws ClassNotFoundException
   * @throws SQLException
   */
  public static Connection Connect() throws ClassNotFoundException, SQLException {
    // load driver
    Class.forName(Driver);
    // get connection
    Connection cn = DriverManager.getConnection(URL);
    return cn;
  }
}
