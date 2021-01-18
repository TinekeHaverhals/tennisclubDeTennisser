package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.TennisCourt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class TennisCourtDAO {

    public List<TennisCourt> getAllTennisCourt() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM TennisCourt");
        return parseTennisCourt(rs);
    }

    private List<TennisCourt> parseTennisCourt(ResultSet rs) throws SQLException {
        List<TennisCourt> result = new ArrayList<>();
        while (rs.next()) {
            TennisCourt tennisCourt = new TennisCourt();
            tennisCourt.setId(rs.getInt("Id"));
            tennisCourt.setDescription(rs.getString("Description"));

            result.add(tennisCourt);
        }
        return result;
    }
}


