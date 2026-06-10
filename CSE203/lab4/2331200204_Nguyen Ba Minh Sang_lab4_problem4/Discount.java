package CSE203.lab4.prb4;



import java.time.LocalDate;
import java.util.UUID;

public class Discount {
    private UUID id;
    private LocalDate startDate;
    private LocalDate endDate;
    private double percent;

    public Discount(double percent, LocalDate endDate) {
        this.endDate = endDate;
        this.percent = percent;
        this.startDate = LocalDate.now();
        this.id = UUID.randomUUID();
    }
    public UUID getID() {
        return id;
    }
    public void setID(UUID id) {
        this.id = id;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        this.percent = percent;
    }  

}
