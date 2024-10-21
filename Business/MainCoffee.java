/*
Name: Aditya Raj
File Name: MainCoffee.java
Date: 09/20/24
Short Description: Make a Coffee store billing system
*/
package H.Business;
import java.util.Scanner;

public class MainCoffee {
    public static void main(String[] args) {
        //Program description output
        System.out.println("This program will allow the user to choose their coffee sizes " +
                "and amount and return the bill at the end");

        //Initialize the data
        enum CoffeeSize {
            Small(6, 2.56),
            Medium(12, 3.25),
            Large(16, 3.88);

            private int ounce;
            private double price;


            // Constructor
            CoffeeSize(int ounce, double price) {
                this.ounce = ounce;
                this.price = price;
            }

            // Getters and Setters
            public int getOunce() {
                return this.ounce;
            }

            public void setOunce(int ounce) {
                this.ounce = ounce;
            }

            public double getPrice() {
                return this.price;
            }

            public void setPrice(double price) {
                this.price = price;
            }
            //Calculate price per oz
            public double getPricePerOunce() {
                return this.price / this.ounce;
            }
        }

        //Initialize variables
        double totalCost = 0;
        int totalCups = 0;
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        //Loop system for seamless program re-run
        while (loop) {
            try { //Catches exceptions
                //Display available coffee options
                System.out.println("\nAvailable Coffee Sizes:");
                for (CoffeeSize size : CoffeeSize.values()) {
                    System.out.printf("Size: %s, Volume: %d oz, Price: $%.2f, Price per oz: $%.2f%n",
                            size.name(), size.getOunce(), size.getPrice(), size.getPricePerOunce());
                }

                //Take user input for size selection
                System.out.print("\nEnter the coffee size (Small, Medium, Large): ");
                String sizeInput = scanner.nextLine();
                CoffeeSize selectedSize = CoffeeSize.valueOf(sizeInput);

                //Take user input for the number of cups
                System.out.print("Enter the number of cups: ");
                int numCups = Integer.parseInt(scanner.nextLine());
                System.out.println(numCups);
                if (numCups <= 0) {
                    throw new NumberFormatException();
                }

                //Calculate the price for the current selection
                double priceForThisSize = selectedSize.getPrice() * numCups;
                totalCups += numCups;
                totalCost += priceForThisSize;

                //Display order details
                System.out.printf("\nYou added: %d cup(s) of %s coffee ($%.2f each)%n", numCups, selectedSize.name(), selectedSize.getPrice());
                System.out.printf("Current subtotal: $%.2f%n", totalCost);

                //Add another order
                System.out.print("\nDo you want to add another coffee size? (Y/N): ");
                String continueInput = scanner.nextLine();
                if (continueInput.equalsIgnoreCase("N")) {
                    loop = false;
                }

            } catch (NumberFormatException e) { //catches invalid numbers of cups
                System.out.println("Invalid input! Please enter a valid number for the cups.\n");
            } catch (IllegalArgumentException e) { //catches invalid sizes
                System.out.println("Invalid input! Please enter Small, Medium, or Large.\n");
            }
        }

        //Calculates and displays the final bill
        if (totalCups > 0) {
            double salesTax = 0.06 * totalCost;
            double finalBill = totalCost + salesTax;
            //Display results
            System.out.printf("\nOrder Summary: %d total cup(s)%n", totalCups);
            System.out.printf("Subtotal: $%.2f%n", totalCost);
            System.out.printf("Sales tax (6%%): $%.2f%n", salesTax);
            System.out.printf("Total bill: $%.2f%n", finalBill);
        } else {
            System.out.println("\nNo items ordered.");
        }
    }
}
/*
Testing run data:
    This program will allow the user to choose their coffee sizes and amount and return the bill at the end

    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): Small
    Enter the number of cups: 3

    You added: 3 cup(s) of Small coffee ($2.56 each)
    Current subtotal: $7.68

    Do you want to add another coffee size? (Y/N): y

    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): 2
    Invalid input! Please enter Small, Medium, or Large.


    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): wrong
    Invalid input! Please enter Small, Medium, or Large.


    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): Large
    Enter the number of cups: -2
    Invalid input! Please enter a valid number for the cups.


    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): Large
    Enter the number of cups: Large
    Invalid input! Please enter a valid number for the cups.


    Available Coffee Sizes:
    Size: Small, Volume: 6 oz, Price: $2.56, Price per oz: $0.43
    Size: Medium, Volume: 12 oz, Price: $3.25, Price per oz: $0.27
    Size: Large, Volume: 16 oz, Price: $3.88, Price per oz: $0.24

    Enter the coffee size (Small, Medium, Large): Large
    Enter the number of cups: 5

    You added: 5 cup(s) of Large coffee ($3.88 each)
    Current subtotal: $27.08

    Do you want to add another coffee size? (Y/N): n

    Order Summary: 8 total cup(s)
    Subtotal: $27.08
    Sales tax (6%): $1.62
    Total bill: $28.70

    Process finished with exit code 0

 */
