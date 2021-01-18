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

    private TennisPlayerServices tennisPlayerServices;

    // logincontrole

    @GetMapping("login")
    public String login (Model model){
        model.addAttribute("TennisPlayer", new TennisPlayer("", ""));
        return "pages/login";
    }

    @PostMapping("login")
    public String login2(@ModelAttribute("TennisPlayer")TennisPlayer tennisPlayerReceived, HttpSession session) throws SQLException {
        TennisPlayer tennisPlayer = tennisPlayerServices.getUserByPassWordAndEmail(tennisPlayerReceived.getEmail(), tennisPlayerReceived.getPassword());
        if (tennisPlayer != null){
            System.out.println("user has logged in");
            return "redirect:login/ChoiceMenu";
        }
        else System.out.println("not logged in");
        return "pages/login";
    }

    // Registreren

    //Mijn gegevens

    //wijzigen mail

    //wijzigen tel

    //wijzigen adres

    //wijzigen wachtwoord

    // gegevens weergeven van alle leden

    @GetMapping("AllTennisPlayer")
    public String getAllTennisPlayer (Model model) throws SQLException {
        model.addAttribute("AllTennisPlayers", tennisPlayerServices.getAllTennisPlayer());
        return "login/Data";
    }

}
