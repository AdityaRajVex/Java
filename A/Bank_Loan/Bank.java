package H.A.Bank_Loan;

public class Bank {
    // Attributes
    private String bankName;
    private double interestRate;
    private double loanAmount;

    // Constructors
    public Bank(String bankName, double interestRate, double loanAmount) {
        this.bankName = bankName;
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }
    public Bank() {}

    // Setters and Getters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Calculation
    public double getInterest() {
        return loanAmount * (interestRate / 100);
    }

    // Display
    public void printBank() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.printf("Loan Amount: $%.2f\n", loanAmount);
    }
}
