package C.Business;

public class BasePlusCommissionEmployee extends Employee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
           throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;



    }
}
