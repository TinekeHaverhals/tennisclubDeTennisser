package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Model.TennisCourt;
import TennisClubDeTennisser.Model.TennisPlayer;
import TennisClubDeTennisser.Services.TennisCourtServices;
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
 * 18/01/21.
 */
@Controller
public class TennisCourtController {

    @Autowired
    TennisCourtServices tennisCourtServices;

    // alle tennisvelden opvragen
    @GetMapping("tennisCourt")
    public String tennisCourt (Model model){
        model.addAttribute("tennisCourt", new TennisCourt("", ""));
        return "login/Reservation";
    }

    @PostMapping("tennisCourt")
    public String tennisCourt(@ModelAttribute("tennisCourt")TennisCourt tennisCourtReceived) throws SQLException {
        TennisCourt tennisCourt = tennisCourtServices.getAllTennisCourt();

        return "login/Reservation";
    }


}
