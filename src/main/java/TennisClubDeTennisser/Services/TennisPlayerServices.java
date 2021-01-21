package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.ConnectionFactory;
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
   public TennisPlayer getAllTennisPlayers(String name, String firstname, String gender, String email ) throws SQLException{
        return (TennisPlayer) tennisPlayerDAO.getAllTennisPlayers(name, firstname, gender,email );
   }

    //wijzigen tel
    public List<TennisPlayer> getChangePhoneNumber(int phoneNumber, String email, String password) throws SQLException {
        return tennisPlayerDAO.getChangePhoneNumber(phoneNumber, email,password );
    }

    //verwijderen speler
    public List<TennisPlayer> getDeleteTennisPlayer(int tennisPlayerId) throws Exception {
        return tennisPlayerDAO.getDeleteTennisPlayer(tennisPlayerId);
    }

    //wijzigen email
    public List<TennisPlayer> getChangeEmail (String newEmail, String oldEmail) throws SQLException {
        return tennisPlayerDAO.getChangeEmail(newEmail, oldEmail);
    }

    //wijzigen adres
    public List<TennisPlayer> getChangeAddress(String email, String street, int streetNumber,String township, int postalCode ) throws SQLException {
        return tennisPlayerDAO.getChangeAddress( email, street, streetNumber,township, postalCode);
    }

    //wijzigen wachtwoord
    public List<TennisPlayer> getChangePassword( String password, String email ) throws SQLException {
        return tennisPlayerDAO.getChangePassword(password, email);
    }

}
