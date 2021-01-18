package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.ReservationDAO;
import TennisClubDeTennisser.Model.Reservation;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class ReservationServices {

    private ReservationDAO reservationDAO = new ReservationDAO();

    public List<Reservation> getAllReservation() throws SQLException {
        return reservationDAO.getAllReservation();
    }

    public List<Reservation> getAddReservation(int tennisPlayerID, int tennisCourtID, Date date, String hour) throws Exception {
        return reservationDAO.getAddReservation(tennisPlayerID,tennisCourtID,date, hour);
    }

    public List<Reservation> getReservationById(int TennisPlayerId) throws Exception {
        return reservationDAO.getReservationById(TennisPlayerId);
    }

    public List<Reservation> getDeleteReservation(int ReservationId) throws Exception {
        return reservationDAO.getDeleteReservation(ReservationId);
    }
}


