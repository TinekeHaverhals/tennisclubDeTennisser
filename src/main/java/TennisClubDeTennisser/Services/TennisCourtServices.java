package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Model.TennisCourt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
@Service
public class TennisCourtServices {

    @Autowired
    private TennisCourtDAO tennisCourtDAO = new TennisCourtDAO();


    public TennisCourt getAllTennisCourt() throws SQLException {
        return tennisCourtDAO.getAllTennisCourt();
    }
}
