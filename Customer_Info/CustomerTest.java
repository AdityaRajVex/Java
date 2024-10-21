/*
Name: Aditya Raj
File Name: CustomerTest.java
Date: 09/27/24
 */


package H.Customer_Info;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        // Program description output
        System.out.println("This program will test the customer class");

        // Initialize the data
        Scanner input = new Scanner(System.in);
        Customer[] customers = new Customer[2];
        int customerIndex = 0;

        // Calculations
        while (customerIndex < 2) {
            try {
                System.out.println("\nCreating customer " + (customerIndex + 1) + ":");

                // Get customer number
                System.out.print("Enter customer number: ");
                int customerNumber = input.nextInt();
                input.nextLine(); // Consume newline

                // Get customer name
                System.out.print("Enter first name: ");
                String firstName = input.nextLine();
                System.out.print("Enter last name: ");
                String lastName = input.nextLine();

                // Get credit card details
                System.out.print("Enter card type (visa, chase, discover etc.): ");
                String cardType = input.nextLine();
                System.out.print("Enter card number: ");
                String cardNumber = input.nextLine();

                System.out.print("Enter credit limit: ");
                double creditLimit = input.nextDouble();
                System.out.print("Enter initial balance: ");
                double initialBalance = input.nextDouble();
                input.nextLine(); // Consume newline

                // Get card expiry date
                System.out.print("Enter card expiry month (1-12): ");
                int expiryMonth = input.nextInt();
                if (expiryMonth < 1 || expiryMonth > 12 ) { // Ensures input is in range
                    System.out.println("Invalid expiry date. Please try again.");
                    continue; // Skip to the next iteration of the loop
                }

                System.out.print("Enter card expiry day (1-31): ");
                int expiryDay = input.nextInt();
                if (expiryDay < 1 || expiryDay > 31 ) { // Ensures input is in range
                    System.out.println("Invalid expiry date. Please try again.");
                    continue; // Skip to the next iteration of the loop
                }

                System.out.print("Enter card expiry year: ");
                int expiryYear = input.nextInt();
                if (expiryYear < 2024 || expiryYear > 2050 ) { // Ensures input is in range
                    System.out.println("Invalid expiry date. Please try again.");
                    continue; // Skip to the next iteration of the loop
                }

                input.nextLine(); // Consume newline
                // Create CreditCard and Customer objects
                CreditCard creditCard = new CreditCard(cardType, cardNumber, creditLimit, initialBalance);
                creditCard.setExpiryDate(expiryMonth, expiryDay, expiryYear);
                Customer customer = new Customer(customerNumber, firstName, lastName, creditCard);

                // Store customer in array
                customers[customerIndex] = customer;
                customerIndex++;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter valid data.");
                input.nextLine(); // Clear the input buffer
                continue;
            }
        }

        // Display results
        System.out.println("\nCustomer Details: ");
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("\nCustomer " + (i + 1) + ":");
            System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Customer Number: " + customer.getCustomerNumber());
            System.out.println("Credit Card Type: " + customer.getCreditCard().getCardType());
            System.out.println("Credit Card Number: " + customer.getCreditCard().getCardNumber());
            System.out.println("Credit Limit: $" + customer.getCreditCard().getCreditLimit());
            System.out.println("Current Balance: $" + customer.getCreditCard().getInitialBalance());

            if (customer.getCreditCard().isOverLimit()) {
                System.out.println("This customer has exceeded their credit limit!");
            } else {
                System.out.println("This customer is within their credit limit.");
            }
        }
    }
}

/*
Testing run data
    This program will test the customer class

    Creating customer 1:
    Enter customer number: 29874124
    Enter first name: Aditya
    Enter last name: Raj
    Enter card type (visa, chase, discover etc.): Chase
    Enter card number: 4727 1237 4612 7241
    Enter credit limit: 5000
    Enter initial balance: 2000
    Enter card expiry month (1-12): 7
    Enter card expiry day (1-31): 28
    Enter card expiry year: 2032

    Creating customer 2:
    Enter customer number: Raj
    Invalid input! Please enter valid data.

    Creating customer 2:
    Enter customer number: 18214812
    Enter first name: Raj
    Enter last name: Adi
    Enter card type (visa, chase, discover etc.): visa
    Enter card number: 2742 1642 2742 8124
    Enter credit limit: 4000
    Enter initial balance: 1000
    Enter card expiry month (1-12): 6
    Enter card expiry day (1-31): 12
    Enter card expiry year: 2029

    Customer Details:

    Customer 1:
    Name: Aditya Raj
    Customer Number: 29874124
    Credit Card Type: Chase
    Credit Card Number: 4727 1237 4612 7241
    Credit Limit: $5000.0
    Current Balance: $2000.0
    This customer is within their credit limit.

    Customer 2:
    Name: Raj Adi
    Customer Number: 18214812
    Credit Card Type: visa
    Credit Card Number: 2742 1642 2742 8124
    Credit Limit: $4000.0
    Current Balance: $1000.0
    This customer is within their credit limit.

    Process finished with exit code 0


Test 2 ------------------------------------------------------------------

    This program will test the customer class

    Creating customer 1:
    Enter customer number: 29874124
    Enter first name: Aditya
    Enter last name: Raj
    Enter card type (visa, chase, discover etc.): Chase
    Enter card number: 4727 1237 4612 7241
    Enter credit limit: 2000
    Enter initial balance: 8000
    Enter card expiry month (1-12): 8
    Enter card expiry day (1-31): 27
    Enter card expiry year: 2034

    Creating customer 2:
    Enter customer number: Raj
    Invalid input! Please enter valid data.

    Creating customer 2:
    Enter customer number: 45678
    Enter first name: Rqj
    Enter last name: Aditya
    Enter card type (visa, chase, discover etc.): Visa
    Enter card number: 4727 1237 4612 7241
    Enter credit limit: 2000
    Enter initial balance: 1999
    Enter card expiry month (1-12): 1
    Enter card expiry day (1-31): 23
    Enter card expiry year: 2047

    Customer Details:

    Customer 1:
    Name: Aditya Raj
    Customer Number: 29874124
    Credit Card Type: Chase
    Credit Card Number: 4727 1237 4612 7241
    Credit Limit: $2000.0
    Current Balance: $8000.0
    This customer has exceeded their credit limit!

    Customer 2:
    Name: Rqj Aditya
    Customer Number: 45678
    Credit Card Type: Visa
    Credit Card Number: 4727 1237 4612 7241
    Credit Limit: $2000.0
    Current Balance: $1999.0
    This customer is within their credit limit.

    Process finished with exit code 0

 */
