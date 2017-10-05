package ogloszenia.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String state;
    private String city;
    private String street;
//    private int number;
    @OneToOne(mappedBy = "address")
    private Team team;

    public Address() {
    }

    public Address(String state, String city, String street) {
        this.state = state;
        this.city = city;
        this.street = street;
//        this.number = number;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

//    public int getNumber() {
//        return this.number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
}
