package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.PointDAO;
import TennisClubDeTennisser.Model.Points;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class PointServices {

    private PointDAO pointDAO = new PointDAO();

    public List<Points> getPointsByID(int TennisPlayerID) throws SQLException {
        return pointDAO.getPointsByID(TennisPlayerID);
    }

}
