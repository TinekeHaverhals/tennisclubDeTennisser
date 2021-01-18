package TennisClubDeTennisser.Services;

import TennisClubDeTennisser.Data.SubscriptionDAO;
import TennisClubDeTennisser.Model.Subscription;

import java.sql.SQLException;
import java.util.List;

/**
 * Tineke Haverhals
 * 18/01/21.
 */
public class SubscriptionServices {

    private SubscriptionDAO subscriptionDAO = new SubscriptionDAO();

    public List<Subscription> getAllSubscription() throws SQLException {
        return subscriptionDAO.getAllSubscription();
    }
    public List<Subscription> getSubscriptionById(int TennisPlayerID) throws SQLException {
        return subscriptionDAO.getSubscriptionById(TennisPlayerID);
    }
}
