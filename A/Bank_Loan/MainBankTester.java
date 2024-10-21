/*
Name: Aditya Raj
File Name: MainBankTester.java
Date: 09/30/24

Short Description: Tests the bank classes with a 20k loan amount
*/

package H.A.Bank_Loan;

public class MainBankTester {
    public static void main(String[] args) {
        // Program description output
        System.out.println("This program will calculate the loan interest rate for 20k across SBI, ICICI, and AXIS banks");
       // Initialize the data
        double loanAmount = 20000;

        // Display results
        // SBI
        SBI sbiBank = new SBI(loanAmount);
        sbiBank.printBank();
        System.out.printf("Total Interest for SBI: $%.2f\n\n", sbiBank.getInterest());

        // ICICI
        ICICI iciciBank = new ICICI(loanAmount);
        iciciBank.printBank();
        System.out.printf("Total Interest for ICICI: $%.2f\n\n", iciciBank.getInterest());

        // AXIS
        AXIS axisBank = new AXIS(loanAmount);
        axisBank.printBank();
        System.out.printf("Total Interest for AXIS: $%.2f\n", axisBank.getInterest());
    }
}
/*
Testing run data

 */
