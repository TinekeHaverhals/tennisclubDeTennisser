package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.TennisPlayerDAO;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 16/01/21.
 */
@Service
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

    public TennisPlayer getAddTennisPlayer(String Name, String FirstName, String Gender, Date Birthday, int PhoneNumber, String Email, String Password, String Street, int StreetNumber, String Township, int PostalCode) throws Exception {
        return tennisPlayerDAO.getAddTennisPlayer(Name, FirstName, Gender, Birthday, PhoneNumber, Email, Password, Street, StreetNumber, Township, PostalCode);
    }

    public List<TennisPlayer> getDeleteTennisPlayer(int TennisPlayerId) throws Exception {
        return tennisPlayerDAO.getDeleteTennisPlayer(TennisPlayerId);
    }

    public List<TennisPlayer> getChangeEmail (String NewEmail, String OldEmail) throws SQLException {
        return tennisPlayerDAO.getChangeEmail(NewEmail, OldEmail);
    }

    public List<TennisPlayer> getChangePhoneNumber(int NewPhoneNumber, int OldPhoneNumber) throws SQLException {
        return tennisPlayerDAO.getChangePhoneNumber(NewPhoneNumber, OldPhoneNumber);
    }
    public List<TennisPlayer> getChangeAddress(String Email, String Street, int StreetNumber,String Township, int PostalCode ) throws SQLException {
        return tennisPlayerDAO.getChangeAddress( Email, Street, StreetNumber,Township, PostalCode);
    }

    public List<TennisPlayer> getChangePassword( String Password, String Email ) throws SQLException {
        return tennisPlayerDAO.getChangePassword(Password, Email);
    }


}
