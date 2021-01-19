package TennisClubDeTennisser.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private int tennisPlayerId;
    private int tennisCourtId;
    private Date date;
    private String hour;

    public Reservation(){

    }

    public Reservation(int id, int tennisPlayerId, int tennisCourtId, Date date, String hour) {
        this.id = id;
        this.tennisPlayerId = tennisPlayerId;
        this.tennisCourtId = tennisCourtId;
        this.date = date;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public String getHour() {
        return hour;
    }

    public Reservation setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Reservation setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getTennisPlayerId() {
        return tennisPlayerId;
    }

    public Reservation setTennisPlayerId(int tennisPlayerId) {
        this.tennisPlayerId = tennisPlayerId;
        return this;
    }

    public int getTennisCourtId() {
        return tennisCourtId;
    }

    public Reservation setTennisCourtId(int tennisCourtId) {
        this.tennisCourtId = tennisCourtId;
        return this;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", tennisPlayerId=" + tennisPlayerId +
                ", tennisCourtId=" + tennisCourtId +
                ", hour='" + hour +
                ", date=" + date +

                '}';
    }
    public String getSingleLine() {
        return "Reservation: {" +
                "id=" + id +
                ", hour=" + hour +
                ", date=" + date +
                ", tennisPlayer=" + tennisPlayerId +
                ", tennisCourt=" + tennisCourtId +
                '}';
    }


}
