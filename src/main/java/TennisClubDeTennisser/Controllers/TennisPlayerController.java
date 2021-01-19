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
        return "pages/login";
    }

    @PostMapping("login")
    public String login2(@ModelAttribute("tennisPlayer")TennisPlayer tennisPlayerReceived, HttpSession session) throws SQLException {
        System.out.println(tennisPlayerReceived.getEmail()+ tennisPlayerReceived.getPassword());
        TennisPlayer tennisPlayer = tennisPlayerServices.getUserByPassWordAndEmail(tennisPlayerReceived.getEmail(), tennisPlayerReceived.getPassword());
        if (tennisPlayer != null){
            System.out.println("user has logged in");
            session.setAttribute("user", tennisPlayer);
            return "redirect:ChoiceMenu";
        }
        else System.out.println("not logged in");
        return "pages/login";
    }

    // Registreren

    //Mijn gegevens

    //wijzigen mail

    @GetMapping("ChoiceMenu")
    public String getChangeMail (Model model, HttpSession session)  throws SQLException {
        model.addAttribute("tennisPlayer", session.getAttribute("user"));
       // model.addAttribute("ChangeMail", tennisPlayerServices.getChangeEmail(""));
        return "login/ChoiceMenu";
    }


}
