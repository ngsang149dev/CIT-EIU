

public class Customer {
    private String name;
    private String address;
    private String licenseNumber;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String toString() {
        return "Name: %s \n Address: %s \n License Number: %s".formatted(this.name, this.address, this.licenseNumber);

    }
}

