/*
Name: Aditya Raj
File Name: SortTester.java
Date: 10/14/24

Short Description: Test the classes InsertSort and SelectionSort, which use the interface Sortable
 */

package H.Sorting;
import H.Sorting.InsertSort;
import H.Sorting.SelectionSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortTester {
    public static void main(String[] args) {
        // Program description output
        System.out.println("This program will test the class InsertSort and SelectionSort");

        // Initialize
        Scanner input = new Scanner(System.in);
        InsertSort insertSort = new InsertSort();
        SelectionSort selectionSort = new SelectionSort();
        boolean loop = true;

        // Calculation
        while (loop) {
            int[] array = null;
            try {
                System.out.println("Enter the size of the array: "); // Get the array's size
                int size = input.nextInt();
                array = new int[size];
                for (int i = 0; i < size; i++) {  // construct the array based on user inputs
                    System.out.println("Enter number " + (i + 1) + " of the array: ");
                    array[i] = input.nextInt();
                }
            } catch (InputMismatchException e) {  // wrong input catcher
                System.out.println("Please enter an integer");
                input.nextLine(); // Consumer leftover input
                continue;
            }

            // Display results
            System.out.print("Sorted using InsertSort: ");
            for (int num : insertSort.sort(array)) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Sorted using SelectionSort: ");
            for (int num : selectionSort.sort(array)) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Exit Code
            System.out.println("\nDo you want to exit (y/n): ");
            if (input.next().equalsIgnoreCase("y")) {
                System.out.println("Thanks for using the program!");
                loop = false;
            }
            input.nextLine(); // Consume
        }
    }
}
/*
Testing run data
    This program will test the class InsertSort and SelectionSort
    Enter the size of the array:
    9
    Enter number 1 of the array:
    24
    Enter number 2 of the array:
    2141
    Enter number 3 of the array:
    213
    Enter number 4 of the array:
    23
    Enter number 5 of the array:
    23
    Enter number 6 of the array:
    5
    Enter number 7 of the array:
    13
    Enter number 8 of the array:
    123
    Enter number 9 of the array:
    21
    Sorted using InsertSort: 5 13 21 23 23 24 123 213 2141
    Sorted using SelectionSort: 5 13 21 23 23 24 123 213 2141

    Do you want to exit (y/n):
    n
    Enter the size of the array:
    wrong
    Please enter an integer
    Enter the size of the array:
    9
    Enter number 1 of the array:
    wrong
    Please enter an integer
    Enter the size of the array:
    3
    Enter number 1 of the array:
    3
    Enter number 2 of the array:
    3
    Enter number 3 of the array:
    2
    Sorted using InsertSort: 2 3 3
    Sorted using SelectionSort: 2 3 3

    Do you want to exit (y/n):
    y
    Thanks for using the program!

    Process finished with exit code 0
 */
