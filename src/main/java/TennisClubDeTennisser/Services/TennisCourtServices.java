package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Data.TennisPlayerDAO;
import TennisClubDeTennisser.Model.TennisCourt;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
@Service
public class TennisCourtServices {

    @Autowired
    private TennisCourtDAO tennisCourtDAO;

    //lijst alle tennisvelden

    public List<TennisCourt> getAllTennisCourt() throws SQLException {
        return TennisCourtDAO.getAllTennisCourt();
    }
}
