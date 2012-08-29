package lab1;

public class Startup {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.hireEmployee("andy", "jones", "1234567890");

        Orientation orientation = new Orientation();
        orientation.hasCompletedOrientation(true, true, true, true);
        System.out.println("The employee's status is: " + orientation.getStatus());
    }
}
