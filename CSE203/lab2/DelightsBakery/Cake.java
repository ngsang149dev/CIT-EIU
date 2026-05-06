

import java.time.LocalDate;
public class Cake {
    private String type;
    private int tierNumber;
    private LocalDate evenDate;
    private double price;
    private Event event;
    private Customer customer;

    public Cake(Customer customer, String type, int tierNumber, double price) {
        this.customer = customer;
        this.type = type;
        this.tierNumber = tierNumber;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(int tierNumber) {
        this.tierNumber = tierNumber;
    }

    public LocalDate getEvenDate() {
        return evenDate;
    }

    public void setEvenDate(LocalDate evenDate) {
        this.evenDate = evenDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return "Customer: %s \n Type of cake: %s\n Tier(s): %d \n Event date: %s \n Price: %d \n Event: %s \n".formatted(this.customer, this.type, this.tierNumber, this.evenDate, this.price, this.event);
    }
}
