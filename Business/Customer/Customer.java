package H.Business.Customer;

public class Customer {
    private int number;
    private double balance;
    private double charge;
    private double credit;
    private double limit;

    Customer(int number, double balance, double charge, double credit, double limit) {
        this.number = number;
        this.balance = balance;
        this.charge = charge;
        this.credit = credit;
        this.limit = limit;
    }
    Customer(){}

    // Setter and Getter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getNewBalance() {
        double newBalance = (balance + charge - credit);
        if (newBalance > limit) {
            System.out.println("\nCredit limit exceeded!");
        }
        return newBalance;
    }
}
