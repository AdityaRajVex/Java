/*
Name: Aditya Raj
File Name: MainCustomer
Date: 09/25/24

Short Description: Test the Customer class
 */
package H.Business.Customer;
import java.util.*;
public class MainCustomer {
    public static void main(String[] args) {
        //Program description output
        System.out.println("This program will test the Customer class");

        //Initialize the data
        Scanner input = new Scanner(System.in);
        Customer c1 = new Customer();
        boolean loop = true;
        int lastValidId = 0;
        double lastValidBalance = 0.0;
        double lastValidCharge = 0.0;
        double lastValidCredit = 0.0;
        double lastValidLimit = 0.0;


        while (loop) { // loops till user exits the program
            try { // ensures all the values are valid
                if (lastValidId == 0) { // saves the last valid input
                    System.out.printf("Enter Customer's ID: "); // gets ID
                    lastValidId = input.nextInt();
                    c1.setNumber(lastValidId);
                }
                if (lastValidBalance == 0) {// saves the last valid input
                    System.out.printf("Enter Customer's starting balance: "); // gets balance at the beginning of month
                    lastValidBalance = input.nextDouble();
                    c1.setBalance(lastValidBalance);
                }

                if (lastValidCharge == 0) {// saves the last valid input
                    System.out.printf("Enter Customer's charges: "); // gets items charged this month
                    lastValidCharge = input.nextDouble();
                    c1.setCharge(lastValidCharge);
                }

                if (lastValidCredit == 0) {// saves the last valid input
                    System.out.printf("Enter Customer's credit: "); // gets credit
                    lastValidCredit = input.nextDouble();
                    c1.setCredit(lastValidCredit);
                }

                if (lastValidLimit == 0) {// saves the last valid input
                    System.out.printf("Enter Customer's credit limit: "); // gets credit limit
                    lastValidLimit = input.nextDouble();
                    c1.setLimit(lastValidLimit);
                }

            }catch (InputMismatchException e){ // catches invalid values and restarts the loop
                System.out.println("Invalid Input! Please enter a valid number.\n");
                input.next(); // consume the invalid input
                continue;
            }

            System.out.printf("\nCustomer's ID: " + c1.getNumber() + //prints out all the components of the customer class
                            "\nCustomer's Balance: $%.2f" +
                            "\nCustomer's Charge: $%.2f" +
                            "\nCustomer's Credit: $%.2f" +
                            "\nCustomer's Limit: $%.2f"+
                            "\nCustomer's newBalance: $%.2f",
                    c1.getBalance(), c1.getCharge(), c1.getCredit(), c1.getLimit(), c1.getNewBalance());

            System.out.println("\n\nDo you want to exit the program? (y/n)"); // asks the use if they want to exit the code
            if (input.next().equalsIgnoreCase("y")) {
                loop = false;
                System.out.println("Thank you for using MainCustomer program!");
                System.exit(0); // exits the code
            }
            System.out.println("_____________________________________________________________\n"); // separates each loop
            lastValidId = 0;
            lastValidBalance = 0.0; // resets the last valid balance
            lastValidCharge = 0.0;
            lastValidCredit = 0.0;
            lastValidLimit = 0.0;
        }
    }
}

/*
testing run data
    This program will test the Customer class
    Enter Customer's ID: 2024
    Enter Customer's starting balance: 2142.41
    Enter Customer's charges: 264.12
    Enter Customer's credit: 248.12
    Enter Customer's credit limit: 8000

    Customer's ID: 2024
    Customer's Balance: $2142.41
    Customer's Charge: $264.12
    Customer's Credit: $248.12
    Customer's Limit: $8000.00
    Customer's newBalance: $2158.41

    Do you want to exit the program? (y/n)
    n
    _____________________________________________________________

    Enter Customer's ID: 2025
    Enter Customer's starting balance: wrong
    Invalid Input! Please enter a valid number.

    Enter Customer's starting balance: 9002.92
    Enter Customer's charges: wrong
    Invalid Input! Please enter a valid number.

    Enter Customer's charges: 502.21
    Enter Customer's credit: wrong
    Invalid Input! Please enter a valid number.

    Enter Customer's credit: 20
    Enter Customer's credit limit: wrong
    Invalid Input! Please enter a valid number.

    Enter Customer's credit limit: 50

    Credit limit exceeded!

    Customer's ID: 2025
    Customer's Balance: $9002.92
    Customer's Charge: $502.21
    Customer's Credit: $20.00
    Customer's Limit: $50.00
    Customer's newBalance: $9485.13

    Do you want to exit the program? (y/n)
    y
    Thank you for using MainCustomer program!

    Process finished with exit code 0

 */
