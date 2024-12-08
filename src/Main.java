public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        CustomerManager customerManager = new CustomerManager(personManager);
        EmployeeManager employeeManager = new EmployeeManager(personManager);

        Customer customer = new Customer();
        customer.firstName = "CSandra";
        customer.lastName = "Mendez";
        customer.age = 25;
        customer.id = 123456789;
        customer.email = "<EMAIL>";
        customer.address = "123 Main St";
        customer.city = "Boston";
        customer.phone = "123-456-7890";
        customer.password = "<PASSWORD>";
        customer.creditCardNumber = 1234567890;
        customer.accountNumber = 123456789;
        customer.points = 101;
        customerManager.addCustomer(customer);

        Employee employee = new Employee();
        employee.firstName = "EJohn";
        employee.lastName = "Doe";
        employee.age = 30;
        employee.id = 987654321;
        employee.email = "<EMAIL>";
        employee.address = "456 Main St";
        employee.city = "New York";
        employee.phone = "123-456-7890";
        employee.password = "<PASSWORD>";
        employee.salary = 100000;
        employee.position = "Manager";
        employee.department = "Sales";
        employee.company = "Acme";
        employee.workHoursInMonth = 20;
        employeeManager.addEmployee(employee);

        Employee employee1 = new Employee();
        employee1.firstName = "EJane";
        employee1.lastName = "Doe";
        employee1.age = 25;
        employee1.id = 987654322;
        employee1.email = "<EMAIL>";
        employee1.address = "456 Main St";
        employee1.city = "New York";
        employee1.phone = "123-456-7840";
        employee1.password = "<PASSWORD>";
        employee1.salary = 50000;
        employee1.position = "Sales Rep";
        employee1.department = "Sales";
        employee1.company = "Acme";
        employee1.workHoursInMonth = 15;
        employeeManager.addEmployee(employee1);

        Customer customer1 = new Customer();
        customer1.firstName = "CAlex";
        customer1.lastName = "Dok";
        customer1.age = 30;
        customer1.id = 213654323;
        customer1.email = "<EMAIL>";
        customer1.address = "416 Main St";
        customer1.city = "London";
        customer1.phone = "123-456-7890";
        customer1.password = "<PASSWORD>";
        customer1.creditCardNumber = 1234567890;
        customer1.accountNumber = 123456789;
        customer1.points = 100;
        customerManager.addCustomer(customer1);

        Employee employee2 = new Employee();
        employee2.firstName = "Yaşar Can";
        employee2.lastName  = "Sandallı";
        employee2.age = 19;
        employee2.id = 53;
        employee2.email = "yasarcansandallil@gmail.com";
        employee2.address = "Gebze Darıca";
        employee2.city = "Kocaeli";
        employee2.phone = "0532-123-4567";
        employee2.password = "1453";
        employee2.salary = 999999999;
        employee2.position = "Junior Software Developer";
        employee2.department = "IT";
        employee2.company = "Atatürk University";
        employee2.workHoursInMonth = 53;
        employeeManager.addEmployee(employee2);


        System.out.println("============Customers List==============");
        customerManager.listCustomers();
        System.out.println("============Employees List==============");
        employeeManager.listEmployees();
        System.out.println("============All Persons List==============");
        personManager.listPersons();
        System.out.println("============Best Employee==============");
        employeeManager.getBestEmployee();











    }
}