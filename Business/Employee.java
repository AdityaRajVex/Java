package C.Business;

public class Employee {
    // attributes
    private String firstName;
    private String lastName;
    private double salary;

    // constructor
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
    }

    // Setter/ Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Invalid salary!");
        }
    }


}