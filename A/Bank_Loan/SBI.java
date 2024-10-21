package H.A.Bank_Loan;

public class SBI extends Bank {

    // Constructor
    public SBI(double loanAmount) {
        super("SBI", 8.4, loanAmount);
    }

    // Calculation
    @Override // Override
    public double getInterest() {
        return getLoanAmount() * (getInterestRate() / 100);
    }
}
