package CSE203.lab5.p3;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;

    public Employee(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "%s %s".formatted(this.id, this.name);
    }    
}
