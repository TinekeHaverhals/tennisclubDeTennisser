package TennisClubDeTennisser.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Entity
public class TennisCourt {
    @Id
    @GeneratedValue
    private int id;
    private String number;
    private String description;

    public TennisCourt(){
    }

    public TennisCourt(String number, String description){
       this.number = number;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public TennisCourt setId(int id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TennisCourt{" +
                "id=" + id +
                "number=" + number +
                ", description='" + description + '\'' +
                '}';
    }

    public String getSingleLine() {
        return "Tennisvelden: {" +
                "id=" + id +
                "number=" + number +
                ", Beschrijving='" + description + '\'' +
                '}';
    }
}
