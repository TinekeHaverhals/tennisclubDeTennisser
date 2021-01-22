package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.ConnectionFactory;
import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Data.TennisPlayerDAO;
import TennisClubDeTennisser.Model.TennisCourt;
import TennisClubDeTennisser.Model.TennisPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

/**
 * Tineke Haverhals
 * 16/01/21.
 */
@Service
public class TennisPlayerServices {

    @Autowired
    private TennisPlayerDAO tennisPlayerDAO;

    // login
    public  TennisPlayer getUserByPassWordAndEmail(String email, String password) throws SQLException {
        return tennisPlayerDAO.getUserByPassWordAndEmail(email, password);
    }

    // registreren
    public TennisPlayer getAddTennisPlayer(String name, String firstname, String gender, Date birthday, int phoneNumber, String email, String password, String street, int streetNumber, String township, int postalCode) throws Exception {
        return tennisPlayerDAO.getAddTennisPlayer(name, firstname, gender, birthday, phoneNumber, email, password, street, streetNumber, township, postalCode);
    }

    // Lijst alle spelers
    public  List<TennisPlayer> getAllTennisPlayer() throws SQLException{
        return TennisPlayerDAO.getAllTennisPlayer();
    }

    //wijzigen telefoonnummer
    public TennisPlayer getChangePhoneNumber(int phoneNumber, String email) throws SQLException {
        return tennisPlayerDAO.getChangePhoneNumber(phoneNumber, email);
    }

    //wijzigen email
    public TennisPlayer getChangeEmail (String email, String password) throws SQLException {
        return tennisPlayerDAO.getChangeEmail(email, password);
    }

    //wijzigen adres
    public TennisPlayer getChangeAddress(String street, int streetNumber,String township, int postalCode, String email ) throws SQLException {
        return tennisPlayerDAO.getChangeAddress(street, streetNumber,township, postalCode, email);
    }

    //wijzigen wachtwoord
    public List<TennisPlayer> getChangePassword( String password, String email ) throws SQLException {
        return tennisPlayerDAO.getChangePassword(password, email);
    }


}
