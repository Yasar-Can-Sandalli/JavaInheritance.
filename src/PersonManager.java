import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    public List<Person> persons = new ArrayList<>();

    public void listPersons() {
        for (Person person : persons) {
            System.out.println(person.firstName + " " + person.lastName + " " + person.id);
        }
    }

    public void addPerson(Person person) {
        // System.out.println("Person added: " + person.firstName); --> Eklenip Eklenmediğini Kontrol Ettim
        persons.add(person);
    }

}
