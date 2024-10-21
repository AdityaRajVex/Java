package C.Implementation;

public class hourlyPayEmployee extends Employee{
    private double hourlyPay;
    private double workHours;

    //constructor
    public hourlyPayEmployee(String name, int id, double hourlyPay, double workHours) {
        super(name, id);
        this.hourlyPay = hourlyPay;
        this.workHours = workHours;
    }

    public double earnings() {
        return this.hourlyPay * this.workHours * dollarToEuro;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
}
