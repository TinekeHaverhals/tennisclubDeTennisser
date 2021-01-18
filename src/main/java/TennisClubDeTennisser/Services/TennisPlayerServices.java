package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.TennisPlayerDAO;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 16/01/21.
 */
public class TennisPlayerServices {

    @Autowired
    private TennisPlayerDAO tennisPlayerDAO;

    public  TennisPlayer getUserByPassWordAndEmail(String email, String password) throws SQLException {
        return tennisPlayerDAO.getUserByPassWordAndEmail(email, password);
    }

    public static List<TennisPlayer> getAllTennisPlayer() throws SQLException {
       List<TennisPlayer> list = new ArrayList<>();
       TennisPlayerDAO.getAllTennisPlayer().forEach(e -> list.add(e));
       return list;
    }

    public List<TennisPlayer> getInfoById(int TennisPlayerId) throws Exception {
        return tennisPlayerDAO.getInfoById(TennisPlayerId);
    }

    public List<TennisPlayer> getAddTennisPlayer(String Name, String FirstName,String Gender, int Birthday, int PhoneNumber, String Email, String Password, String Street, int StreetNumber, String Township, int PostalCode) throws Exception {
        return tennisPlayerDAO.getAddTennisPlayer(Name, FirstName, Gender, Birthday, PhoneNumber, Email, Password, Street, StreetNumber, Township, PostalCode);
    }

    public List<TennisPlayer> getDeleteTennisPlayer(int TennisPlayerId) throws Exception {
        return tennisPlayerDAO.getDeleteTennisPlayer(TennisPlayerId);
    }

    public List<TennisPlayer> getChangeEmail (String Email, int TennisPlayerId) throws SQLException {
        return tennisPlayerDAO.getChangeEmail(Email, TennisPlayerId);
    }

    public List<TennisPlayer> getChangePhoneNumber(int PhoneNumber, int TennisPlayerId) throws SQLException {
        return tennisPlayerDAO.getChangePhoneNumber(PhoneNumber, TennisPlayerId);
    }
    public List<TennisPlayer> getChangeAddress(int TennisPlayerId, String Street, int StreetNumber,String Township, int PostalCode ) throws SQLException {
        return tennisPlayerDAO.getChangeAddress(TennisPlayerId, Street, StreetNumber,Township, PostalCode);
    }

    public List<TennisPlayer> getChangePassword( String Password, int TennisPlayerId ) throws SQLException {
        return tennisPlayerDAO.getChangePassword(Password, TennisPlayerId);
    }


}
