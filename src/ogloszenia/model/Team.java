package ogloszenia.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(
        name = "team"
)
public class Team implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String teamName;
    @OneToOne
    @JoinColumn
    private Address address;
    private String owner;
    private BigDecimal budgete;
    @OneToMany(
            mappedBy = "team"
    )
    Set<Player> playerSet;

    public Team() {
    }

    public Team(String teamName, Address address, String owner, BigDecimal budgete) {
        this.teamName = teamName;
        this.address = address;
        this.owner = owner;
        this.budgete = budgete;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBudgete() {
        return this.budgete;
    }

    public void setBudgete(BigDecimal budgete) {
        this.budgete = budgete;
    }

    public Set<Player> getPlayerSet() {
        return this.playerSet;
    }

    public void setPlayerSet(Set<Player> playerSet) {
        this.playerSet = playerSet;
    }
}

