package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.ReservationDAO;
import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Model.Reservation;
import TennisClubDeTennisser.Model.TennisCourt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
@Service
public class ReservationServices {

    @Autowired
    private ReservationDAO reservationDAO = new ReservationDAO();

    //opvragen
    public List<Reservation> getAllReservation() throws SQLException {
        return reservationDAO.getAllReservation();
    }

    //toevoegen
    public Reservation getAddReservation(int tennisPlayerId,int tennisCourtID, Date date, String hour) throws Exception {
        return reservationDAO.getAddReservation(tennisPlayerId,tennisCourtID,date, hour);
    }

    // verwijderen

    public Reservation getDeleteReservation(int id) throws Exception {
        return reservationDAO.getDeleteReservation(id);
    }
}


