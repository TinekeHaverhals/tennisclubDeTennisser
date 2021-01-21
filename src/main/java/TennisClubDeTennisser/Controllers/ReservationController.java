package TennisClubDeTennisser.Controllers;

import TennisClubDeTennisser.Services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
@Controller
public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

   // @GetMapping("AllReservation")
    //    public String allReservation (Model model) throws SQLException {
    //        model.addAttribute("reservation", reservationServices.getAllReservation());
    //        return "login/Reservation";
    //    }



}
