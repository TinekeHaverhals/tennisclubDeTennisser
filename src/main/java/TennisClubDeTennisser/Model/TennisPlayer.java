package TennisClubDeTennisser.Model;

import java.sql.Date;

/**
 * Tineke Haverhals
 * 8/01/21.
 */
public class TennisPlayer {
    private int id;
    private String name;
    private String firstname;
    private String gender;
    private Date birthday;
    private int phonenumber;
    private String email;
    private String password;
    private String street;
    private int streetNumber;
    private String township;
    private int postalCode;

    public TennisPlayer(){
    }

    public TennisPlayer(String email, String password){
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public TennisPlayer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TennisPlayer setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public TennisPlayer setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public TennisPlayer setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public TennisPlayer setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public TennisPlayer setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet() {
        return street;
    }

    public  TennisPlayer setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public TennisPlayer setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public String getTownship() {
        return township;
    }

    public TennisPlayer setTownship(String township) {
        this.township = township;
        return this;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public TennisPlayer setPostalCode(int postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", township='" + township + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public String getSingleLine() {
        return "TennisPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", township='" + township + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
