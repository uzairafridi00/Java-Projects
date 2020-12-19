
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Uzair Afridi
 */
public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        String dbURL = "jdbc:mysql://localhost:3306/digital_diary?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
        String dbUserName = "root";
        String dbPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, dbUserName, dbPass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found");
        }

        return con;
    }
}
