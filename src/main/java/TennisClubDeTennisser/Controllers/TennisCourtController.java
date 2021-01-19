package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Services.TennisCourtServices;
import TennisClubDeTennisser.Services.TennisPlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class TennisCourtController {

    @Autowired
    private TennisCourtServices tennisCourtServices;

    // alle tennisvelden opvragen

    @GetMapping ("allTennisCourt")
    public String getAllTennisCourt (Model model) throws SQLException{
        model.addAttribute("AllTennisCourt", tennisCourtServices.getAllTennisCourt());
        return "login/Data";
    }

}
