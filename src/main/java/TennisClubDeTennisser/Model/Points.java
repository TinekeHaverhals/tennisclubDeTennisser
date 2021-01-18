package TennisClubDeTennisser.Model;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class Points {

    private int id;
    private int single;
    private int doubles;

    private TennisPlayer tennisPlayer;

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

    public TennisPlayer getTennisPlayer() {
        return tennisPlayer;
    }

    public Points setTennisPlayer(TennisPlayer tennisPlayer) {
        this.tennisPlayer = tennisPlayer;
        return this;
    }

    @Override
    public String toString() {
        return "Points{" +
                "id=" + id +
                ", single=" + single +
                ", doubles=" + doubles +
                ", tennisPlayer=" + tennisPlayer +
                '}';
    }

    public String getSingleLine() {
        return "punten: {" +
                "Enkelspel ="+ single +
                ", Dubbelspel='" + doubles + '\'' +
                '}';
    }
}
