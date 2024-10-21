package H.A.Bank_Loan;

public class AXIS extends Bank {

    // Constructor
    public AXIS(double loanAmount) {
        super("AXIS", 9.7, loanAmount);
    }

    // Calculation
    @Override // Override
    public double getInterest() {
        double loanAmount = getLoanAmount();
        if (loanAmount <= 5000) {
            return loanAmount * (getInterestRate() / 100) / 2; // 50% off for loan <= 5000
        } else {
            double remainingLoan = loanAmount - 5000;
            return (5000 * (getInterestRate() / 100) / 2) + (remainingLoan * (getInterestRate() / 100));
        }
    }
}
