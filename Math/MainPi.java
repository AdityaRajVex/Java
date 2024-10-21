/*
Name: Aditya Raj
File Name: MainPi.java
Date: 09/16/24

Short Description: This program will calculate the pi using 200,000 terms.
*/

package H.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainPi {
    public static void main(String[] args) {
        //Program description output
        System.out.println("This program will calculate pi using the given terms and also return the term where pi approximates to given value");
        //Initialize the data
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int limit;
        double check;
        while (loop) {
            boolean exe = false;
            double pi = 0.0;

            // exception error handler for terms
            try {
                System.out.println("Enter the term number: ");
                limit = input.nextInt();
                if (limit <= 0) {
                    throw new InputMismatchException();
                }
            }
            catch (InputMismatchException _) {
                input.nextLine();
                System.out.println("Invalid input, Value must be a positive whole number!");
                continue;
            }


            System.out.println("Enter the value of pi approximate: ");
            // exception error handler for check
            try {
                check = input.nextDouble();
                if (check <= 0) {
                    throw new InputMismatchException();
                }
            }
            catch (InputMismatchException _) {
                input.nextLine();
                System.out.println("Invalid input, value must be a positive number!\n");
                continue;
            }


            //Calculations
            for (int i = 0; i <= limit; i++) {
                pi += 4 * ((Math.pow(-1, i)) / ((2 * i) + 1));

                //Display results
                if ((String.format("%.6g%n", pi).equals(String.format("%.6g%n", check))) && !exe) {
                    System.out.println(STR."It takes \{i + 1} term(s) for the pi to be approximated as \{check}");
                    exe = true;
                }
            }

            //Display results
            if (!exe){
                System.out.println(STR."\{check} is never an approximation of pi in the given term limit!");
            }
            System.out.println(STR."After testing \{limit} terms the approximation of the pi is \{pi}");

            //Exit code
            System.out.println("Do you want to exit the program? (y/n)");
            String end = input.next();

            //Loops until y is pressed
            if ("y".equalsIgnoreCase(end)) {
                loop = false;
            }
        }
    }
}
/*
testing run data
    This program will calculate pi using the given terms and also return the term where pi approximates to given value
    Enter the term number:
    200000
    Enter the value of pi approximate:
    3.14159
    It takes 130658 term(s) for the pi to be approximated as 3.14159
    After testing 200000 terms the approximation of the pi is 3.141597653564762
    Do you want to exit the program? (y/n)
    n
    Enter the term number:
    -10
    Invalid input, Value must be a positive whole number!
    Enter the term number:
    wrong
    Invalid input, Value must be a positive whole number!
    Enter the term number:
    1
    Enter the value of pi approximate:
    -10
    Invalid input, value must be a positive number!

    Enter the term number:
    1
    Enter the value of pi approximate:
    wrong
    Invalid input, value must be a positive number!

    Enter the term number:
    1
    Enter the value of pi approximate:
    4
    It takes 1 term(s) for the pi to be approximated as 4.0
    After testing 1 terms the approximation of the pi is 2.666666666666667
    Do you want to exit the program? (y/n)
    n
    Enter the term number:
    92
    Enter the value of pi approximate:
    5
    5.0 is never an approximation of pi in the given term limit!
    After testing 92 terms the approximation of the pi is 3.1523450309994745
    Do you want to exit the program? (y/n)
    y

    Process finished with exit code 0

 */