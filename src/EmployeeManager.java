import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    PersonManager personManager;

    public EmployeeManager(PersonManager personManager) {
        this.personManager = personManager;
    }

    List<Employee> employees = new ArrayList<>();

    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.firstName + " " + employee.lastName + " " + employee.id + " " + employee.salary);
        }
    }

    public void getBestEmployee() {
        Employee bestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.workHoursInMonth > bestEmployee.workHoursInMonth) {
                bestEmployee = employee;
            }
        }
        System.out.println("Best employee: " + bestEmployee.firstName + " " + bestEmployee.lastName);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        personManager.addPerson(employee);
    }
}
