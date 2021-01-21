package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Repository
public class TennisPlayerDAO {

    public static List<TennisPlayer> getAllTennisPlayer() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT Id,Name, FirstName, Gender, Birthday, PhoneNumber, Email FROM TennisPlayer;");
        return parseAllTennisPlayer(rs);
    }

    private static List<TennisPlayer> parseAllTennisPlayer(ResultSet rs) throws SQLException {
        List<TennisPlayer> result = new ArrayList<>();
        while (rs.next()) {
            TennisPlayer tennisPlayer = new TennisPlayer();

            tennisPlayer.setId(rs.getInt("Id"));
            tennisPlayer.setName(rs.getString("Name"));
            tennisPlayer.setFirstname(rs.getString("FirstName"));
            tennisPlayer.setGender(rs.getString("Gender"));
            tennisPlayer.setBirthday(rs.getDate("Birthday"));
            tennisPlayer.setPhoneNumber(rs.getInt("PhoneNumber"));
            tennisPlayer.setEmail(rs.getString("Email"));

            result.add(tennisPlayer);
        }
        return result;
    }

    public List<TennisPlayer> getDeleteTennisPlayer(int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("DELETE FROM TennisPlayer Where Id = ?");
        statement.setInt(1, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangeEmail(String newEmail, String oldEmail) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Email = ? WHERE Email = ? ");
        statement.setString(1, newEmail);
        statement.setString(2, oldEmail);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangePhoneNumber(int NewPhoneNumber, int OldPhoneNumber) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET PhoneNumber = ? WHERE id = ? ");
        statement.setInt(1, NewPhoneNumber);
        statement.setInt(2, OldPhoneNumber);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangeAddress(String Email, String Street, int StreetNumber,String Township, int PostalCode ) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Street = ?, StreetNumber = ?, Township =?, PostalCode = ? WHERE Email = ?;");
        statement.setString(1, Street);
        statement.setInt(2, StreetNumber);
        statement.setString(3, Township);
        statement.setInt(4, PostalCode);
        statement.setString(5, Email);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangePassword(String Password, String Email) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Password = ? WHERE Email = ?;");
        statement.setString(1, Password);
        statement.setString(2, Email);

        int rs = statement.executeUpdate();

        return null;
    }

    public TennisPlayer getAddTennisPlayer(String name, String firstname, String gender, Date birthday, int phoneNumber, String email, String password, String street, int streetNumber, String township, int postalCode) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO TennisPlayer VALUES (Null, ? , ?, ?, ? , ? ,?, ?, ?,?, ?,? )");
        statement.setString(1, name);
        statement.setString(2, firstname);
        statement.setString(3, gender);
        statement.setDate(4, birthday);
        statement.setInt(5, phoneNumber);
        statement.setString(6, email);
        statement.setString(7, password);
        statement.setString(8, street);
        statement.setInt(9, streetNumber);
        statement.setString(10, township);
        statement.setInt(11, postalCode);

        ResultSet rs = statement.executeQuery();
        TennisPlayer tennisPlayer= null;

        if (rs!= null) {
            while (rs.next()) {
                tennisPlayer = new TennisPlayer();

                tennisPlayer.setId(rs.getInt("Id"));
                tennisPlayer.setName(rs.getString("Name"));
                tennisPlayer.setFirstname(rs.getString("Firstname"));
                tennisPlayer.setGender(rs.getString("Gender"));
                tennisPlayer.setBirthday(rs.getDate("Birthday"));
                tennisPlayer.setPhoneNumber(rs.getInt("PhoneNumber"));
                tennisPlayer.setEmail(rs.getString("Email"));
                tennisPlayer.setPassword(rs.getString("Password"));
                tennisPlayer.setStreet(rs.getString("Street"));
                tennisPlayer.setStreetNumber(rs.getInt("StreetNumber"));
                tennisPlayer.setTownship(rs.getString("Township"));
                tennisPlayer.setPostalCode(rs.getInt("PostalCode"));

            }
        }
        return tennisPlayer;
    }

    public TennisPlayer getUserByPassWordAndEmail(String email, String password) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM TennisPlayer Where Email=? and Password= ?;");
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet rs = statement.executeQuery();
        TennisPlayer tennisPlayer= null;

        if (rs!= null) {
            while (rs.next()) {
                tennisPlayer = new TennisPlayer();

                tennisPlayer.setId(rs.getInt("Id"));
                tennisPlayer.setName(rs.getString("Name"));
                tennisPlayer.setFirstname(rs.getString("Firstname"));
                tennisPlayer.setGender(rs.getString("Gender"));
                tennisPlayer.setBirthday(rs.getDate("Birthday"));
                tennisPlayer.setPhoneNumber(rs.getInt("PhoneNumber"));
                tennisPlayer.setEmail(rs.getString("Email"));
                tennisPlayer.setPassword(rs.getString("Password"));
                tennisPlayer.setStreet(rs.getString("Street"));
                tennisPlayer.setStreetNumber(rs.getInt("StreetNumber"));
                tennisPlayer.setTownship(rs.getString("Township"));
                tennisPlayer.setPostalCode(rs.getInt("PostalCode"));
                tennisPlayer.setSingle(rs.getInt("Single"));
                tennisPlayer.setDoubles(rs.getInt("Doubles"));
                tennisPlayer.setSubscriptionDescription(rs.getString("SubscriptionDescription"));
                tennisPlayer.setTimeSubscription(rs.getString("TimeSubscription"));
                tennisPlayer.setPaid(rs.getString("Paid"));
            }
        }
        return tennisPlayer;
    }
}

