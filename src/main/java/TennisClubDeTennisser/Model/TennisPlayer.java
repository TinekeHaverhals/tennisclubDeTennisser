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
public class TennisPlayer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String firstname;
    private String gender;
    private Date birthday;
    private int phoneNumber;
    private String email;
    private String password;
    private String street;
    private int streetNumber;
    private String township;
    private int postalCode;
    private int single;
    private int doubles;
    private String subscriptionDescription;
    private String timeSubscription;
    private String paid;

    public TennisPlayer(){
    }

    public TennisPlayer(String email, String password){
        this.email = email;
        this.password = password;
    }

    public TennisPlayer(String name, String firstname, String gender, Date birthday, int phoneNumber, String email, String password, String street, int streetNumber, String township, int postalCode){
        this.name = name;
        this.firstname = firstname;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.street = street;
        this.streetNumber = streetNumber;
        this.township = township;
        this.postalCode= postalCode;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public TennisPlayer setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getSingle() {
        return single;
    }

    public TennisPlayer setSingle(int single) {
        this.single = single;
        return this;
    }

    public int getDoubles() {
        return doubles;
    }

    public TennisPlayer setDoubles(int doubles) {
        this.doubles = doubles;
        return this;
    }

    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    public TennisPlayer setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
        return this;
    }

    public String getTimeSubscription() {
        return timeSubscription;
    }

    public TennisPlayer setTimeSubscription(String timeSubscription) {
        this.timeSubscription = timeSubscription;
        return this;
    }

    public String getPaid() {
        return paid;
    }

    public TennisPlayer setPaid(String paid) {
        this.paid = paid;
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
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", township='" + township + '\'' +
                ", postalCode=" + postalCode +
                ", single=" + single +
                ", doubles=" + doubles +
                ", subscriptionDescription=" + subscriptionDescription +
                ", timeSubscription=" + timeSubscription +
                ", paid=" + paid +
                '}';
    }

    public String getSingleLine() {
        return "TennisPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", singles='" + township + '\'' +
                ", postalCode=" + postalCode + '\'' +
                ", single=" + single + '\'' +
                ", doubles=" + doubles +
                ", subscriptionDescription=" + subscriptionDescription +
                ", timeSubscription=" + timeSubscription +
                ", paid=" + paid +
                '}';
    }
}
