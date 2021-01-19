package TennisClubDeTennisser.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
@Entity
public class Points {
    @Id
    @GeneratedValue
    private int id;
    private int single;
    private int doubles;

    public  Points(){
    }

    public Points (int Single, int doubles){
        this.single = single;
        this.doubles = doubles;
    }

    public int getId() {
        return id;
    }

    public Points setId(int id) {
        this.id = id;
        return this;
    }

    public int getSingle() {
        return single;
    }

    public Points setSingle(int single) {
        this.single = single;
        return this;
    }

    public int getDoubles() {
        return doubles;
    }

    public Points setDoubles(int doubles) {
        this.doubles = doubles;
        return this;
    }



    @Override
    public String toString() {
        return "Points{" +
                "id=" + id +
                ", single=" + single +
                ", doubles=" + doubles +
                '}';
    }

    public String getSingleLine() {
        return "punten: {" +
                "Enkelspel ="+ single +
                ", Dubbelspel='" + doubles + '\'' +
                '}';
    }
}
