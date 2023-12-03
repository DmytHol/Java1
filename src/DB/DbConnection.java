package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static boolean VerifyDBClassLoaded() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
    public static Connection getConnection() {
        try {
    		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Scrutener", "root", "Hermione160!");
            return conn;
        } catch (SQLException e) {
            return null;
        }
    }
}
