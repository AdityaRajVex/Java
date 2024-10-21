package H.A.ShapeC;
/*
Name: Aditya Raj
File Name: ShapeTester.java
Date: 10/11/24

Test the GeometricShape abstract class using the Triangle, Square, and Circle classes
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        // Program description output
        System.out.println("This program will test the GeometricShape abstract class!");

        // Initialize the data
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int tside1;
        int tside2;
        int tside3;
        int sside1;
        double radius1;

        // Calculations
        while (loop) {
            try {
                System.out.println("\nCreating class Triangle: "); // Create Triangle

                // Get triangle's sides
                System.out.print("Enter the length of side 1: ");
                tside1 = input.nextInt();
                if (tside1 <= 0) {
                    throw new InputMismatchException();
                }
                input.nextLine(); // Consume newline


                System.out.print("Enter the length of side 1: ");
                tside2 = input.nextInt();
                if (tside2 <= 0) {
                    throw new InputMismatchException();
                }
                input.nextLine(); // Consume newline

                System.out.print("Enter the length of side 1: ");
                tside3 = input.nextInt();
                if (tside3 <= 0) {
                    throw new InputMismatchException();
                }
                input.nextLine(); // Consume newline


                System.out.println("\nCreating class Square: "); // Create Square

                // Get square's side
                System.out.print("Enter the length of side: ");
                sside1 = input.nextInt();
                if (sside1 <= 0) {
                    throw new InputMismatchException();
                }
                input.nextLine(); // Consume newline

                System.out.println("\nCreating class Circle: "); // Create Circle

                // Get circle's radius
                System.out.print("Enter the length of radius: ");
                radius1 = input.nextDouble();
                if (radius1 <= 0) {
                    throw new InputMismatchException();
                }
                input.nextLine(); // Consume newline


                // Assign classes
                Triangle t1 = new Triangle(tside1, tside2, tside3);
                Square s1 = new Square(sside1);
                Circle c1 = new Circle(radius1);

                // Print Square
                System.out.printf("\nSquare Area: %.2f \n", s1.getArea());
                System.out.printf("Square Perimeter: %.2f \n", s1.getPerimeter());

                // Print Triangle
                System.out.printf("Triangle Area: %.2f \n", t1.getArea());
                System.out.printf("Triangle Perimeter: %.2f \n", t1.getPerimeter());

                // Print Circle
                System.out.printf("Circle Area: %.2f \n", c1.getArea());
                System.out.printf("Circle Perimeter: %.2f \n", c1.getPerimeter());

                // Exit Code
                System.out.println("\nDo you want to exit (y/n): ");
                if (input.next().equalsIgnoreCase("y")) {
                    System.out.println("Thanks for using the program!");
                    loop = false;
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter valid data.");
                input.nextLine(); // Clear the input buffer
            }
        }
    }
}

/*
Testing run data
    This program will test the GeometricShape abstract class!

    Creating class Triangle:
    Enter the length of side 1: 2
    Enter the length of side 1: 2
    Enter the length of side 1: 2

    Creating class Square:
    Enter the length of side: 2

    Creating class Circle:
    Enter the length of radius: 2

    Square Area: 4.00
    Square Perimeter: 8.00
    Triangle Area: 1.73
    Triangle Perimeter: 6.00
    Circle Area: 12.57
    Circle Perimeter: 12.57

    Do you want to exit (y/n):
    n

    Creating class Triangle:
    Enter the length of side 1: -2
    Invalid input! Please enter valid data.

    Creating class Triangle:
    Enter the length of side 1: w
    Invalid input! Please enter valid data.

    Creating class Triangle:
    Enter the length of side 1: 5
    Enter the length of side 1: 2
    Enter the length of side 1: 2

    Creating class Square:
    Enter the length of side: 1

    Creating class Circle:
    Enter the length of radius: 5

    Square Area: 1.00
    Square Perimeter: 4.00
    Triangle Area: NaN
    Triangle Perimeter: 9.00
    Circle Area: 78.54
    Circle Perimeter: 31.42

    Do you want to exit (y/n):
    y
    Thanks for using the program!

    Process finished with exit code 0


 */

