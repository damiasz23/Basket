package ogloszenia.model;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Age implements Serializable {
    private String dateOfBirth;
    private int age;

    public Age() {
    }

    public Age(String dateOfBirth, int age) {
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
