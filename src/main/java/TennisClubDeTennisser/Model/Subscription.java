package TennisClubDeTennisser.Model;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class Subscription {
    private int id;
    private int tennisPlayerId;
    private String description;
    private String timeSubscription;
    private String paid;

    public Subscription(){
    }

    public Subscription(int tennisPlayerId, String description, String timeSubscription, String paid){
        this.tennisPlayerId = tennisPlayerId;
        this.description = description;
        this.timeSubscription = timeSubscription;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public Subscription setId(int id) {
        this.id = id;
        return this;
    }

    public int getTennisPlayerId() {
        return tennisPlayerId;
    }

    public Subscription setTennisPlayerId(int tennisPlayerId) {
        this.tennisPlayerId = tennisPlayerId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Subscription setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTimeSubscription() {
        return timeSubscription;
    }

    public Subscription setTimeSubscription(String timeSubscription) {
        this.timeSubscription = timeSubscription;
        return this;
    }

    public String getPaid() {
        return paid;
    }

    public Subscription setPaid(String paid) {
        this.paid = paid;
        return this;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", tennisPlayerId=" + tennisPlayerId +
                ", description='" + description + '\'' +
                ", timeSubscription='" + timeSubscription + '\'' +
                ", paid='" + paid + '\'' +
                '}';
    }

    public String getSingleLine() {
        return "Subscription{" +
                "id=" + id +
                ", tennisPlayerId=" + tennisPlayerId +
                ", description='" + description + '\'' +
                ", timeSubscription='" + timeSubscription + '\'' +
                ", paid='" + paid + '\'' +
                '}';
    }
}
