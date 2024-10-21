package C.Implementation;

public abstract class Employee implements Payable {
    private final String name;
    private final int EmployeeID;

    //constructor
    public Employee(String name, int EmployeeID) {
        this.name = name;
        this.EmployeeID = EmployeeID;
    }

    //abstract method
    public abstract double earnings();

    @Override
    public double getPaymentAmount(){
        return this.earnings();
    }


    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }
}
