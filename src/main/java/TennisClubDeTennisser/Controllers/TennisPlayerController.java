package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Model.TennisPlayer;
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

    //registeren
    //@GetMapping("registeren")
    //    public void registeren (Model model){
    //        model.addAttribute("tennisPlayer", new TennisPlayer("","","","","","","","","","",""));
    //    }
    //
    //    @PostMapping("registeren")
    //    public void registeren2(@ModelAttribute("tennisPlayeradd") TennisPlayer tennisPlayerReceived) throws Exception {
    //      TennisPlayer tennisPlayer = (TennisPlayer) tennisPlayerServices.getAddTennisPlayer(tennisPlayerReceived.getName(), tennisPlayerReceived.getFirstname(), tennisPlayerReceived.getGender(), tennisPlayerReceived.getBirthday(), tennisPlayerReceived.getEmail(), tennisPlayerReceived.getPassword(), tennisPlayerReceived.getPhoneNumber(), tennisPlayerReceived.getStreet(), tennisPlayerReceived.getStreetNumber(), tennisPlayerReceived.getTownship(), tennisPlayerReceived.getPostalCode());
    //    }

    // lijst alle tennisspelers
    @GetMapping("allTennisPlayers")
    public String alltennisPlayers (Model model){
        model.addAttribute("tennisPlayer", new TennisPlayer("", "","",""));
        return "pages/ListAllTennisPlayers";
    }

    //// wijzigen telefoonnummer
    //    @GetMapping("/tel")
    //    public String changeTel (Model model){
    //        model.addAttribute("tennisPlayer", new TennisPlayer("","",""));
    //        return "login/data";
    //    }
    //    @PostMapping("login")
    //    public String changeTel2(@ModelAttribute("tennisPlayer")TennisPlayer tennisPlayerReceived, HttpSession session) throws SQLException {
    //        TennisPlayer tennisPlayer = (TennisPlayer) tennisPlayerServices.getChangePhoneNumber(tennisPlayerReceived.getPhoneNumber(),tennisPlayerReceived.getEmail(), tennisPlayerReceived.getPassword());
    //        return "login/Data";
    //    }

    @GetMapping("ChoiceMenu")
    public String choiceMenu (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChoiceMenu";
    }

    @GetMapping("/email")
    public String email (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangeMail";
    }

    @GetMapping("/password")
    public String password (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangePassword";
    }

    @GetMapping("/address")
    public String address (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/ChangeAddress";
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

    @GetMapping("reservation")
    public String reservation (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
        return "login/Reservation";
    }
}