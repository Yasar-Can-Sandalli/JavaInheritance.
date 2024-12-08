import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    PersonManager personManager;

    public CustomerManager(PersonManager personManager) {
        this.personManager = personManager;
    }

    List<Customer> customers = new ArrayList<>();

    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.firstName + " " + customer.lastName + " " + customer.id + " " + customer.points);
        }
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        personManager.addPerson(customer);
    }

    public void bestCustomer(){
        Customer bestCustomer = customers.get(0);
        for (Customer customer : customers) {
            if (customer.points > bestCustomer.points) {
                bestCustomer = customer;
            }
        }
        System.out.println("Best customer: " + bestCustomer.firstName + " " + bestCustomer.lastName + " " + bestCustomer.points);
    }
}
