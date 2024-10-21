/*
Name: Aditya Raj
File Name: MainDie
Date: 10/04/24

Short Description: Rolls 2 dices and outputs results in a table
 */

package H.A.ShapeC;

import java.util.Random;
import java.util.Scanner;

public class MainDie {
    public static void main(String[] args) {
        // Program description output
        System.out.println("This program takes in the amount of rolls" +
                " and outputs the table of 2 dices rolled for that amount");

        // Initialize the data
        int length = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times to roll the dice: ");
        int rolls = input.nextInt();

        int[] frequencyGrid = new int[36]; // 1D array to store frequencies
        Random random = new Random();

        // Calculations
        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1; // Generates numbers from 1 to 6
            int die2 = random.nextInt(6) + 1;
//            System.out.printf(die1 + ":" + die2);
//            System.out.println();
            int index = (die2 - 1) * 6 + (die1 - 1); // Calculate index in array
//            System.out.println(index);
            frequencyGrid[index]++;
        }


//        System.out.println();

        // Calculate the spacing length needed for the rows
        for (int i = frequencyGrid.length - 1; i >= 0; i--) {
            if (frequencyGrid[i] > 0) { // Check if the frequency is greater than 0
                    length = String.valueOf(frequencyGrid[i]).length(); // Get the length of the frequency value
                break;
            }
        }

        // Display results
        System.out.print(" ");
        for (int i = 1; i <= 6; i++) {
            System.out.printf(STR."%\{length + 1}s", i);
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print(STR."\{i + 1} ");
            for (int j = 0; j < 6; j++) {
                int index = i * 6 + j; // Calculate index for printing
                System.out.print(STR."\{frequencyGrid[index]} ");
            }
            System.out.println();
        }
    }
}


/*
Testing run data

    This program takes in the amount of rolls and outputs the table of 2 dices rolled for that amount
    Enter the number of times to roll the dice: 100
      1 2 3 4 5 6
    1 1 4 3 5 1 0
    2 3 2 2 3 3 2
    3 5 4 1 4 3 2
    4 3 5 3 4 2 3
    5 1 4 5 2 3 3
    6 2 0 8 1 2 1

    Process finished with exit code 0



    This program takes in the amount of rolls and outputs the table of 2 dices rolled for that amount
    Enter the number of times to roll the dice: 1000
       1  2  3  4  5  6
    1 31 22 34 16 22 32
    2 29 35 26 25 37 27
    3 34 32 34 24 34 21
    4 25 33 30 31 23 25
    5 26 24 28 22 25 30
    6 25 29 27 29 32 21

    Process finished with exit code 0


    This program takes in the amount of rolls and outputs the table of 2 dices rolled for that amount
    Enter the number of times to roll the dice: 10000
        1   2   3   4   5   6
    1 267 258 284 277 275 262
    2 253 266 243 262 284 306
    3 268 259 285 280 287 293
    4 290 278 277 286 266 279
    5 305 258 278 287 278 267
    6 290 290 269 285 306 302

    Process finished with exit code 0


    This program takes in the amount of rolls and outputs the table of 2 dices rolled for that amount
    Enter the number of times to roll the dice: 100000
         1    2    3    4    5    6
    1 2782 2804 2707 2784 2840 2934
    2 2840 2837 2723 2719 2802 2712
    3 2789 2745 2711 2764 2836 2803
    4 2737 2771 2844 2773 2765 2757
    5 2739 2737 2754 2752 2825 2788
    6 2722 2854 2782 2804 2706 2758

    Process finished with exit code 0


Conclusion
    All the numbers seem to be very close together, this is because of the probability of rolling each dice
    is the same as rolling others.
 */