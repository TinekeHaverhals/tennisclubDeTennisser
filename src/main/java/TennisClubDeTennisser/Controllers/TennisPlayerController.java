package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Model.Reservation;
import TennisClubDeTennisser.Model.TennisPlayer;
import TennisClubDeTennisser.Services.ReservationServices;
import TennisClubDeTennisser.Services.TennisCourtServices;
import TennisClubDeTennisser.Services.TennisPlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 14/01/21.
 */

@Controller
public class TennisPlayerController {

    @Autowired
    private TennisPlayerServices tennisPlayerServices;
    @Autowired
    private TennisCourtServices tennisCourtServices;
    @Autowired
    private ReservationServices reservationServices;

    // logincontrole
    @GetMapping("login")
    public String login (Model model){
        model.addAttribute("tennisPlayer", new TennisPlayer("", ""));
        return "pages/Login";
    }
    @PostMapping("login")
    public String login2(@ModelAttribute("tennisPlayer")TennisPlayer tennisPlayerReceived, HttpSession session) throws SQLException {
        TennisPlayer tennisPlayer = tennisPlayerServices.getUserByPassWordAndEmail(tennisPlayerReceived.getEmail(), tennisPlayerReceived.getPassword());
        if (tennisPlayer != null){
            System.out.println("user has logged in");
            session.setAttribute("user", tennisPlayer);
            return "redirect:ChoiceMenu";
        }
        else System.out.println("not logged in");
        return "pages/Login";
    }

    //registreren
    @GetMapping("/registration")
    public String registration (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "pages/Registration";
    }

    @GetMapping("tennisPlayerAdd")
    public String tennisPlayerAdd (Model model, TennisPlayer tennisPlayer) throws Exception {
        model.addAttribute("tennisPlayerAdd", tennisPlayerServices.getAddTennisPlayer(tennisPlayer.getName(),tennisPlayer.getFirstname(), tennisPlayer.getGender(), tennisPlayer.getBirthday(), tennisPlayer.getPhoneNumber(), tennisPlayer.getEmail(), tennisPlayer.getPassword(), tennisPlayer.getStreet(), tennisPlayer.getStreetNumber(), tennisPlayer.getTownship(), tennisPlayer.getPostalCode()));
        return "pages/Login";
    }

    //lijst alle Tennisvelden + pagina reservatie + alle reservatie + verwijderen reservatie
    @GetMapping("reservation")
    public String reservation (Model model, HttpSession session, Reservation reservation) throws Exception {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("tennisCourts", tennisCourtServices.getAllTennisCourt());
        model.addAttribute("reservations", reservationServices.getAllReservation());
        model.addAttribute("deletereservation", reservationServices.getDeleteReservation(reservation.getId()));
        return "login/Reservation";
    }

    // nieuwe reservatie
    @GetMapping("/addReservation")
    public String addReservation (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/AddReservation";
    }

    @GetMapping("add")
    public String add (Model model, HttpSession session, Reservation reservation) throws Exception {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("add", reservationServices.getAddReservation(reservation.getTennisPlayerId(),reservation.getTennisCourtId(), reservation.getDate(), reservation.getHour())) ;
        return "login/ChoiceMenu";
    }

    @GetMapping("deletereservation")
    public String deletereservation (Model model, HttpSession session, Reservation reservation) throws Exception {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("tennisCourts", tennisCourtServices.getAllTennisCourt());
        model.addAttribute("reservations", reservationServices.getAllReservation());
        model.addAttribute("deletereservation", reservationServices.getDeleteReservation(reservation.getId()));
        return "login/ChoiceMenu";
    }

    // lijst alle tennisspelers
    @GetMapping("allTennisPlayer")
    public String players (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("tennisPlayers", tennisPlayerServices.getAllTennisPlayer());
        return "login/ListAllTennisPlayers";
    }

    //wijzigen telefoonnummer
    @GetMapping("/phoneNumber")
    public String phoneNumber (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangeTel";
    }

    @GetMapping("changePhoneNumber")
    public String changePhoneNumber (Model model, HttpSession session, TennisPlayer tennisPlayer)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("changePhoneNumber", tennisPlayerServices.getChangePhoneNumber(tennisPlayer.getPhoneNumber(), tennisPlayer.getEmail()));
        return "pages/Login";
    }

    //wijzigen email
    @GetMapping("/email")
    public String email (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangeMail";
    }

    @GetMapping("changeMail")
    public String changeMail (Model model, HttpSession session, TennisPlayer tennisPlayer)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("changeMail", tennisPlayerServices.getChangeEmail(tennisPlayer.getEmail(), tennisPlayer.getPassword()));
        return "pages/Login";
    }

    //wijzigen adres
    @GetMapping("/address")
    public String address (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangeAddress";
    }

    @GetMapping("changeAddress")
    public String changeAddress (Model model, HttpSession session, TennisPlayer tennisPlayer)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("changeMail", tennisPlayerServices.getChangeAddress(tennisPlayer.getStreet(), tennisPlayer.getStreetNumber(),  tennisPlayer.getTownship(),tennisPlayer.getPostalCode(), tennisPlayer.getEmail()));
        return "pages/Login";
    }

    //wijzigen wachtwoord
    @GetMapping("/password")
    public String password (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "pages/ChangePassword";
    }

    @GetMapping("Changepassword")
    public String Changepassword (Model model, HttpSession session, TennisPlayer tennisPlayer)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        model.addAttribute("changeMail", tennisPlayerServices.getChangePassword(tennisPlayer.getPassword(), tennisPlayer.getEmail()));
        return "pages/Login";
    }

    //pagina's
    @GetMapping("ChoiceMenu")
    public String choiceMenu (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChoiceMenu";
    }

    @GetMapping("index")
    public String index (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "index";
    }

    @GetMapping("lidmaatschap")
    public String lidmaatschap (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "pages/Lidmaatschap";
    }

    @GetMapping("photo")
    public String photo (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "pages/Photo";
    }

    @GetMapping("tennisles")
    public String tennisles (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "pages/Tennisles";
    }

    @GetMapping("data")
    public String data (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/Data";
    }
}