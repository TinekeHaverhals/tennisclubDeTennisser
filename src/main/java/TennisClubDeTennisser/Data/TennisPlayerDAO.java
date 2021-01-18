package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.TennisPlayer;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
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
            tennisPlayer.setPhonenumber(rs.getInt("PhoneNumber"));
            tennisPlayer.setEmail(rs.getString("Email"));

            result.add(tennisPlayer);
        }
        return result;
    }
    public List<TennisPlayer> getInfoById(int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT * From TennisPlayer Where Id = ?");
        statement.setInt(1, TennisPlayerId);

        ResultSet rs = statement.executeQuery();

        return parseTennisPlayer(rs);
    }

    private List<TennisPlayer> parseTennisPlayer(ResultSet rs) throws SQLException {
        List<TennisPlayer> result = new ArrayList<>();
        while (rs.next()) {
            TennisPlayer tennisPlayer = new TennisPlayer();

            tennisPlayer.setId(rs.getInt("Id"));
            tennisPlayer.setName(rs.getString("Name"));
            tennisPlayer.setFirstname(rs.getString("Firstname"));
            tennisPlayer.setGender(rs.getString("Gender"));
            tennisPlayer.setBirthday(rs.getDate("Birthday"));
            tennisPlayer.setPhonenumber(rs.getInt("PhoneNumber"));
            tennisPlayer.setEmail(rs.getString("Email"));
            tennisPlayer.setPassword(rs.getString("Password"));
            tennisPlayer.setStreet(rs.getString("Street"));
            tennisPlayer.setStreetNumber(rs.getInt("StreetNumber"));
            tennisPlayer.setTownship(rs.getString("Township"));
            tennisPlayer.setPostalCode(rs.getInt("PostalCode"));

            result.add(tennisPlayer);
        }
        return result;
    }
    public List<TennisPlayer> getAddTennisPlayer( String name, String firstName, String gender, int birthday, int phoneNumber, String email, String password, String street, int streetNumber, String township,int postalCode) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO TennisPlayer VALUES (Null, ? , ?, ?, ? , ? ,?, ?, ?,?, ?,? )");
        statement.setString(1, name);
        statement.setString(2, firstName);
        statement.setString(3, gender);
        statement.setInt(4, birthday);
        statement.setInt(5, phoneNumber);
        statement.setString(6, email);
        statement.setString(7, password);
        statement.setString(8, street);
        statement.setInt(9, streetNumber);
        statement.setString(10, township);
        statement.setInt(11, postalCode);

        int rs = statement.executeUpdate();
        return null;
    }

    public List<TennisPlayer> getDeleteTennisPlayer(int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("DELETE FROM TennisPlayer Where Id = ?");
        statement.setInt(1, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangeEmail(String Email, int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Email = ? WHERE id = ? ");
        statement.setString(1, Email);
        statement.setInt(2, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangePhoneNumber(int PhoneNumber, int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET PhoneNumber = ? WHERE id = ? ");
        statement.setInt(1, PhoneNumber);
        statement.setInt(2, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangeAddress(int TennisPlayerId, String Street, int StreetNumber,String Township, int PostalCode ) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Street = ?, StreetNumber = ?, Township =?, PostalCode = ? WHERE id = ?;");
        statement.setString(1, Street);
        statement.setInt(2, StreetNumber);
        statement.setString(3, Township);
        statement.setInt(4, PostalCode);
        statement.setInt(5, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public List<TennisPlayer> getChangePassword(String Password, int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("UPDATE TennisPlayer SET Password = ? WHERE id = ?;");
        statement.setString(1, Password);
        statement.setInt(2, TennisPlayerId);

        int rs = statement.executeUpdate();

        return null;
    }

    public TennisPlayer getUserByPassWordAndEmail(String email, String password) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM TennisPlayer Where Email=? and Password= ?;");
        TennisPlayer tennisPlayer= null;

        if (rs!= null) {
            while (rs.next()) {
                tennisPlayer = new TennisPlayer();

                tennisPlayer.setId(rs.getInt("Id"));
                tennisPlayer.setName(rs.getString("Name"));
                tennisPlayer.setFirstname(rs.getString("Firstname"));
                tennisPlayer.setGender(rs.getString("Gender"));
                tennisPlayer.setBirthday(rs.getDate("Birthday"));
                tennisPlayer.setPhonenumber(rs.getInt("PhoneNumber"));
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
}

