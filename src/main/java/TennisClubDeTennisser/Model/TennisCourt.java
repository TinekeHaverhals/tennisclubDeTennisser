package TennisClubDeTennisser.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public TennisCourt setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TennisCourt setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "TennisCourt{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public String getSingleLine() {
        return "Tennisvelden: {" +
                "id=" + id +
                ", Beschrijving='" + description + '\'' +
                '}';
    }
}
