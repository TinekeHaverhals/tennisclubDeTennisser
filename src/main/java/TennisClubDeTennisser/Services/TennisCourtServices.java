package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Data.TennisPlayerDAO;
import TennisClubDeTennisser.Model.TennisCourt;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class TennisCourtServices {

    private TennisCourtDAO tennisCourtDAO = new TennisCourtDAO();

    public List<TennisCourt> getAllTennisCourt() throws SQLException {
        return tennisCourtDAO.getAllTennisCourt();
    }
}
