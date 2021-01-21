package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.TennisCourt;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.stereotype.Repository;

import java.sql.*;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Repository
public class TennisCourtDAO {

    public TennisCourt getAllTennisCourt() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM TennisCourt");
        ResultSet rs = statement.executeQuery();
        TennisCourt tennisCourt= null;

        if (rs!= null) {
            while (rs.next()) {
                tennisCourt = new TennisCourt();

                tennisCourt.setId(rs.getInt("Id"));
                tennisCourt.setNumber(rs.getString("Number"));
                tennisCourt.setDescription(rs.getString("Description"));
            }
        }
        return tennisCourt;
    }
}


