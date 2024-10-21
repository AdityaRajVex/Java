package H.A.Bank_Loan;

public class ICICI extends Bank {

    // Constructor
    public ICICI(double loanAmount) {
        super("ICICI", 7.3, loanAmount);
    }

    // Calculation
    @Override // Override
    public double getInterest() {
        if (getLoanAmount() > 1000) {
            return getLoanAmount() * (getInterestRate() / 100);
        } else {
            return 0; // No interest for loans <= 1000
        }
    }
}
