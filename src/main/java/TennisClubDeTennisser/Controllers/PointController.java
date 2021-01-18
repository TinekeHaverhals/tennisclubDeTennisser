package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Services.PointServices;
import org.dom4j.rule.Mode;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class PointController {

    private PointServices pointServices;


    // mijn speelpunten

    @GetMapping ("point")
    public String getPointsByID(Model model) throws SQLException {
        model.addAttribute("points", pointServices.getPointsByID(Integer.parseInt("")));
        return ("login/data");
    }

}
