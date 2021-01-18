package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.Reservation;
import TennisClubDeTennisser.Model.TennisPlayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class ReservationDAO {

    public List<Reservation> getAllReservation() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Reservation");
        return parseReservation(rs);
    }

    public List<Reservation> getReservationById(int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT * From Reservation Where TennisPlayerId = ?");
        statement.setInt(1, TennisPlayerId);

        ResultSet rs = statement.executeQuery();

        return parseReservation(rs);
    }

    private List<Reservation> parseReservation(ResultSet rs) throws SQLException {
        List<Reservation> result = new ArrayList<>();
        while (rs.next()) {
            Reservation reservation = new Reservation();
            reservation.setId(rs.getInt("Id"));
            reservation.setTennisPlayerId(rs.getInt("TennisPlayerId"));
            reservation.setTennisCourtId(rs.getInt("TennisCourtId"));
            reservation.setDate(rs.getDate("Date"));
            reservation.setHour(rs.getString("Hour"));
            result.add(reservation);
        }
        return result;
    }

    public List<Reservation> getAddReservation(int tennisPlayerId, int tennisCourtId, Date date, String hour) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO Reservation VALUES (Null, ? , ?, ?, ? )");
        statement.setInt(1, tennisPlayerId);
        statement.setInt(2, tennisCourtId);
        statement.setDate(3, date);
        statement.setString(4,hour);

        int rs = statement.executeUpdate();
        return null;
    }

    public List<Reservation> getDeleteReservation(int ReservationId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("DELETE FROM Reservation Where Id = ?");
        statement.setInt(1, ReservationId);

        int rs = statement.executeUpdate();

        return null;
    }
}
