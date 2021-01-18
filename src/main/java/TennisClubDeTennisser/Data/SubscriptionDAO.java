package TennisClubDeTennisser.Data;

import TennisClubDeTennisser.Model.Subscription;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class SubscriptionDAO {

    public List<Subscription> getAllSubscription() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Subscription");
        return parseSubscription(rs);
    }

    private List<Subscription> parseSubscription(ResultSet rs) throws SQLException {
        List<Subscription> result = new ArrayList<>();
        while (rs.next()) {
            Subscription subscription = new Subscription();
            subscription.setId(rs.getInt("Id"));
            subscription.setTennisPlayerId(rs.getInt("TennisPLayerId"));
            subscription.setDescription(rs.getString("Description"));
            subscription.setTimeSubscription(rs.getString("TimeSubscription"));
            subscription.setPaid(rs.getString("Paid"));
            result.add(subscription);
        }
        return result;
    }

    public List<Subscription> getSubscriptionById(int TennisPlayerId) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT Id, tennisPlayerId, Description, TimeSubscription, Paid FROM Subscription WHERE Id = ?");
        statement.setInt(1, TennisPlayerId);

        ResultSet rs = statement.executeQuery();

        return parseSubscription(rs);
    }
}
