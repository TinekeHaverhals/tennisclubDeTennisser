package TennisClubDeTennisser.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
                "jdbc:mysql://moktok.javawebdev.com:33306/tineke",
                "tineke",
                "tineke2020"
        );
    }
}

