package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the four other best practices as explained by your
 * instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;

    public void hireEmployee(String fName, String lName, String sNumber) {
        setFirstName(fName);
        setLastName(lastName);
        setSsn(ssn);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            System.out.println("Error: Names must have Characters. ");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            System.out.println("Error: Names must have Characters. ");
        } else {
            this.lastName = lastName;
        }
    }

    public String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        if (ssn == null || ssn.length() == 0 || ssn.length() > 10) {
            System.out.println("Error: SSN must be ten Digits. ");
        } else {
            this.ssn = ssn;
        }
    }
}
