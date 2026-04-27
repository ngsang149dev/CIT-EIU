package CSE203.lab2.PetGroomingShop;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Customer> customers = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();
    private List<ServiceEstimate> serviceEstimates = new ArrayList<>();

    public PetShop() { 

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<ServiceEstimate> getServiceEstimates() {
        return serviceEstimates;
    }

    public void setServiceEstimates(List<ServiceEstimate> serviceEstimates) {
        this.serviceEstimates = serviceEstimates;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addServiceEstimate(ServiceEstimate serviceEstimate) {
        serviceEstimates.add(serviceEstimate);
    }

    public void showAllCustomers() {
        // for (int i = 0; i< customers.size();i++) {
        //     System.out.println(customers.get(i));
        // }
        // new ways to print (using lambda expression)
        // Way1:this.customers.stream().forEach((cust) -> System.out.println(cust));
        // Way2 cooler
        this.customers.stream().forEach(System.out::println);
    }

    public void showAllPets() {
        // for (int i = 0; i < pets.size();i++) {
        //     System.out.println(pets.get(i));
        // }
        this.pets.stream().forEach(System.out::println);
    }

    public void showAllServiceEstimates() {
        // for (int i = 0; i < serviceEstimates.size();i++) {
        //     System.out.println(serviceEstimates.get(i));
        // }
        this.serviceEstimates.stream().forEach(System.out::println);
    }
}
