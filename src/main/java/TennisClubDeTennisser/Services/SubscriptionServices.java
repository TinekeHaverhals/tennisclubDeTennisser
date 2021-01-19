package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.SubscriptionDAO;
import TennisClubDeTennisser.Model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class SubscriptionServices {

    @Autowired
    private SubscriptionDAO subscriptionDAO = new SubscriptionDAO();

    public List<Subscription> getAllSubscription() throws SQLException {
        return subscriptionDAO.getAllSubscription();
    }
    public List<Subscription> getSubscriptionById(int TennisPlayerID) throws SQLException {
        return subscriptionDAO.getSubscriptionById(TennisPlayerID);
    }
}
