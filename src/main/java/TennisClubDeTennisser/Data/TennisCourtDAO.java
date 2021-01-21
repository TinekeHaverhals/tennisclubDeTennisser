package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.TennisCourt;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 21/01/21.
 */
@Repository
public class TennisCourtDAO {

    // lijst alle tennisvelden

    public static List<TennisCourt> getAllTennisCourt() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM TennisCourt");
        List<TennisCourt> tennisCourts = new ArrayList<>();
        TennisCourt tennisCourt = null;
        if (rs != null) {
            while (rs.next()) {
                tennisCourt = new TennisCourt();
                tennisCourt.setId(rs.getInt("Id"));
                tennisCourt.setNumber(rs.getString("Number"));
                tennisCourt.setDescription(rs.getString("Description"));
                tennisCourts.add(tennisCourt);
            }
        }
        return tennisCourts;
    }
}


