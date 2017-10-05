package ogloszenia.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Embeddable;

@Embeddable
public class Contract implements Serializable {
    private BigDecimal salary;
    private LocalDate contractStart;
    private LocalDate contractEnd;

    public Contract() {
    }

    public Contract(BigDecimal salary, LocalDate contractStart, LocalDate contractEnd) {
        this.salary = salary;
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getContractStart() {
        return this.contractStart;
    }

    public void setContractStart(LocalDate contractStart) {
        this.contractStart = contractStart;
    }

    public LocalDate getContractEnd() {
        return this.contractEnd;
    }

    public void setContractEnd(LocalDate contractEnd) {
        this.contractEnd = contractEnd;
    }
}