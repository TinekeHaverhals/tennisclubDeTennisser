package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Data.TennisCourtDAO;
import TennisClubDeTennisser.Model.TennisCourt;
import TennisClubDeTennisser.Model.TennisPlayer;
import TennisClubDeTennisser.Services.TennisCourtServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
@Controller
public class TennisCourtController {

    @Autowired
    private TennisCourtServices tennisCourtServices;

    @GetMapping("allTennisCourt")
    public String allTennisCourt (Model model) throws SQLException {
        model.addAttribute("tennisCourt", tennisCourtServices.getAllTennisCourt());
        return "login/Reservation";
    }




}
