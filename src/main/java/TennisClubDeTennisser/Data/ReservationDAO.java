package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.Reservation;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Repository
public class ReservationDAO {

    public static List<Reservation> getAllReservation() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Reservation.Id,Reservation.TennisCourtId, Reservation.Date, Reservation.Hour FROM TennisPlayer INNER JOIN Reservation ON TennisPlayer.Id = Reservation.TennisPlayerId");
        List<Reservation> reservations = new ArrayList<>();
        Reservation reservation = null;

        if (rs != null) {
            while (rs.next()) {
                reservation = new Reservation();
                reservation.setId(rs.getInt("Id"));
                reservation.setTennisCourtId(rs.getInt("TennisCourtId"));
                reservation.setDate(rs.getDate("Date"));
                reservation.setHour(rs.getString("Hour"));
                reservations.add(reservation);
            }
        }
        return reservations;
    }

    public Reservation getAddReservation( int tennisPlayerId,int tennisCourtId, Date date, String hour) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO Reservation (Id, TennisPlayerId,TennisCourtId, Date, Hour)VALUES (Null ,?, ?, ?, ? );");
        statement.setInt(1, tennisPlayerId);
        statement.setInt(2, tennisCourtId);
        statement.setDate(3, date);
        statement.setString(4,hour);

        int rs = statement.executeUpdate();
        Reservation reservation = null;
        return reservation;
    }

    public Reservation getDeleteReservation(int id) throws SQLException {
          Connection connection = ConnectionFactory.getConnection();
          PreparedStatement statement = connection.prepareStatement("DELETE FROM Reservation Where Id = ?");
          statement.setInt(1, id);
        int rs = statement.executeUpdate();
        Reservation reservation = null;
        return reservation;
    }
}
