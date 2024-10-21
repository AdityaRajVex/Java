// Name: Aditya Raj
// File Name: MainBMI
// Date: 09/06/2024
//
// Short Description: A program to calculate and output BMI based on inputs given
package C.myHealth;

import java.util.Scanner;
public class MainBMI {
    public static void main(String [] args){
        // Initialize the data
        Scanner input = new Scanner(System.in);
        var loop = true;
        BMI b1 = new BMI();

        // Program description output
        System.out.println("This program used given inputs to calculate and return the BMI");

        // Calculations
        while (loop) { // Makes a loop allowing the user to calculate the BMI multiple times with different values
            System.out.println("Enter your weight in pounds: ");  // Sets up the weight
            double weight = (input.nextDouble());
            if (weight > 0) {  // Checks is weight is positive or not
                b1.setWeight(weight);

                System.out.println("Enter your height in inches: ");  // Sets up the height
                double height = input.nextDouble();
                if (height > 0) {  // Checks if height is positive or not
                    b1.setHeight(height);
                    // Return the BMI while also allowing the user to see the inputs
                    System.out.printf("The BMI for " + weight + "lbs" + " and " + height + "in is: %.3f", b1.getBMI());
                    System.out.println("\nDo you want to change the values? (y/n)");
                    String end = input.next();
                    if ("n".equalsIgnoreCase(end)) {
                        loop = false;
                    }
                }
                else{
                    System.out.println("Invalid input! height must be a non-zero positive number!");  // height error
                }
            }
            else{
                System.out.println("Invalid input! weight must be a non-zero positive number!");  // weight error
            }

        }

    }


}
//Display results
/*
testing run data:
    This program used given inputs to calculate and return the BMI
    Enter your weight in pounds:
    150
    Enter your height in inches:
    62
    The BMI for 150.0lbs and 62.0in is: 27.432
    Do you want to change the values? (y/n)
    y
    Enter your weight in pounds:
    -20
    Invalid input! weight must be a non-zero positive number!
    Enter your weight in pounds:
    0
    Invalid input! weight must be a non-zero positive number!
    Enter your weight in pounds:
    120
    Enter your height in inches:
    0
    Invalid input! height must be a non-zero positive number!
    Enter your weight in pounds:
    120
    Enter your height in inches:
    72
    The BMI for 120.0lbs and 72.0in is: 16.273
    Do you want to change the values? (y/n)
    n

    Process finished with exit code 0

*/
