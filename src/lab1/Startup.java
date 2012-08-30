package lab1;

public class Startup {

    public static void main(String[] args) {
        Orientation orientation = new Orientation();
        Employee employee = new Employee();
        
        employee.hireEmployee("Andy", "Jones", "1234567890");
        orientation.hireEmployee();
        System.out.println("The employee's status is: " + orientation.getStatus());
    }
}
