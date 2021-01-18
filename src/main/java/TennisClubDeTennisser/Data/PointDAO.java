package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.Points;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class PointDAO {

    public List<Points> getPointsByID(int TennisPlayerID) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT Single, Doubles From Points Where TennisPlayerID = ?");
        statement.setInt(1, TennisPlayerID);

        ResultSet rs = statement.executeQuery();

        return parsePoints(rs);
    }

    private  List<Points> parsePoints(ResultSet rs) throws SQLException {
        List<Points> result = new ArrayList<>();
        while (rs.next()) {
            Points points = new Points();
            points.setSingle(rs.getInt("Single"));
            points.setDoubles(rs.getInt("Doubles"));
            result.add(points);
        }
        return result;
    }
}
