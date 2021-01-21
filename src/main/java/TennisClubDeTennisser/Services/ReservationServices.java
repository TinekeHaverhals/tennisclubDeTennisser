package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.ReservationDAO;
import TennisClubDeTennisser.Model.Reservation;
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

    //lijst alle reservaties
    public List<Reservation> getAllReservation() throws SQLException {
        return reservationDAO.getAllReservation();
    }

    //lijst alle reservaties per ID
    public List<Reservation> getReservationById(int tennisPlayerId) throws Exception {
        return reservationDAO.getReservationById(tennisPlayerId);
    }

    //toevoegen
    public List<Reservation> getAddReservation(int tennisPlayerID, int tennisCourtID, Date date, String hour) throws Exception {
        return reservationDAO.getAddReservation(tennisPlayerID,tennisCourtID,date, hour);
    }

    // verwijderen
    public List<Reservation> getDeleteReservation(int reservationId) throws Exception {
        return reservationDAO.getDeleteReservation(reservationId);
    }
}


