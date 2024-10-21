/*
Name: Aditya Raj
File Name: EmployeeTest.java
Date: 09/23/24

Short Description: Classwork.Tester.Test the Employee class
 */


package H.Business.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) throws InputMismatchException {
        //Program description output
        System.out.println("This program will test the employee class\n");

        //Initialize the data
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        double percent = 0.0;

        while (loop) {
            try { // setup employee 1
                System.out.println("Enter employee 1's first name: "); // Ask for 1's first name
                e1.setFirstName(scanner.nextLine());

                System.out.println("Enter employee 1's last name: "); // Ask for 1's last name
                e1.setLastName(scanner.nextLine());

                System.out.println("Enter employee 1's salary: "); // Ask for 1's salary
                e1.setSalary(Double.parseDouble(scanner.nextLine()));

            } catch (NumberFormatException i){
                System.out.println("\nInvalid input! Enter a number!");
                continue; // restart the loop

            }

            try { // setup employee 2
                System.out.println("Enter employee 2's first name: ");  // Ask for 2's first name
                e2.setFirstName(scanner.nextLine());

                System.out.println("Enter employee 2's last name: "); // Ask for 2's last name
                e2.setLastName(scanner.nextLine());

                System.out.println("Enter employee 2's salary: "); // Ask for 2's salary
                e2.setSalary(Double.parseDouble(scanner.nextLine())); // Convert inputted string to a double or throw exception

            } catch (NumberFormatException i){ // catch exceptions and print error statement
                System.out.println("\nInvalid input! Enter a number!");
                continue; // restart the loop
            }
            //Calculations
            try {
                System.out.println("Enter the raise amount out of a 100: "); // Ask for the raise
                percent = scanner.nextDouble();

                if (percent > 100) { // throws an exception if raise is more than 100, could happen in dreamworld :>
                    throw new InputMismatchException();
                }else{
                    percent = (percent/100) + 1; // add one so easier to multiply
                }

            }catch (InputMismatchException i){ // catch exception for raise
                System.out.println("Invalid Input! Enter a positive number less than 100");
                scanner.nextLine();
                continue; // restart the loop
            }

            //Display results
            System.out.printf("\n"+ e1.getFirstName() +" " + e1.getLastName() + "'s salary is: $%.2f",  e1.getSalary());
            System.out.printf(" before the raise and $%.2f", (e1.getSalary() * percent));
            System.out.printf(" after the raise. \n"+ e2.getFirstName() +" " + e2.getLastName() + "'s salary is: $%.2f",  e2.getSalary());
            System.out.printf(" before the raise and $%.2f", (e2.getSalary() * percent));
            System.out.println(" after the raise \nWould you like to exit? (y/n): ");

            if (scanner.next().equalsIgnoreCase("y")) { // exit code
                System.out.println("Thanks for using the program!");
                loop = false; // break loop
            }
            System.out.println(); // do \n (add a new line)
            scanner.nextLine(); // consumes the leftover input line allowing no inputs to be skipped
        }
    }
}


/*
Testing run data
    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Miller
    Enter employee 1's salary:
    200000
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Ross
    Enter employee 2's salary:
    150000
    Enter the raise amount out of a 100:
    10

    Sarah Miller's salary is: $200000.00 before the raise and $220000.00 after the raise.
    Mike Ross's salary is: $150000.00 before the raise and $165000.00 after the raise
    Would you like to exit? (y/n):
    n

    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    ross
    Enter employee 1's salary:
    200
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Miller
    Enter employee 2's salary:
    wrong

    Invalid input! Enter a number!
    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Ross
    Enter employee 1's salary:
    wrong

    Invalid input! Enter a number!
    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Miller
    Enter employee 1's salary:
    200000
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Ross
    Enter employee 2's salary:
    5000000
    Enter the raise amount out of a 100:
    10

    Sarah Miller's salary is: $200000.00 before the raise and $220000.00 after the raise.
    Mike Ross's salary is: $5000000.00 before the raise and $5500000.00 after the raise
    Would you like to exit? (y/n):
    n

    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Miller
    Enter employee 1's salary:
    200000
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Ross
    Enter employee 2's salary:
    100000
    Enter the raise amount out of a 100:
    -10

    Sarah Miller's salary is: $200000.00 before the raise and $180000.00 after the raise.
    Mike Ross's salary is: $100000.00 before the raise and $90000.00 after the raise
    Would you like to exit? (y/n):
    n

    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Miller
    Enter employee 1's salary:
    200000
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Ross
    Enter employee 2's salary:
    100000
    Enter the raise amount out of a 100:
    101
    Invalid Input! Enter a positive number less than 100
    Enter employee 1's first name:
    Sarah
    Enter employee 1's last name:
    Miller
    Enter employee 1's salary:
    200000
    Enter employee 2's first name:
    Mike
    Enter employee 2's last name:
    Ross
    Enter employee 2's salary:
    100000
    Enter the raise amount out of a 100:
    10

    Sarah Miller's salary is: $200000.00 before the raise and $220000.00 after the raise.
    Mike Ross's salary is: $100000.00 before the raise and $110000.00 after the raise
    Would you like to exit? (y/n):
    y
    Thanks for using the program!


    Process finished with exit code 0

 */