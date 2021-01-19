package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Services.SubscriptionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class SubscriptionController {

    @Autowired
    private SubscriptionServices subscriptionServices;

    // Subscription per Id

    @GetMapping("Subscription")
    public String getSubscriptionByID(Model model) throws SQLException {
        model.addAttribute("points", subscriptionServices.getSubscriptionById(Integer.parseInt("")));
        return ("login/data");
    }


}
