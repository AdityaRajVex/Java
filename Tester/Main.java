package C.Tester;

public class Main {
    public static void main(String [] args) {
        int product = 3;
        while (product < 100) {
            product *= 3;
        }
        System.out.printf("The first power of 3 that is greater than 100 is: ", product);

        int num = 1;
        do{
            num += 2;
            num *= 3;
        }while(num < 100);

        for(int i=1; i<=10; i++){
            System.out.printf("%d ", num);
        }
    }

    /*
        // Initialize the data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for days: ");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.print("Monday");
                break;

            case 2:
                System.out.print("Tuesday");
                break;

            case 3:
                System.out.print("Wednesday");
                break;

            case 4:
                System.out.print("Thursday");
                break;

            case 5:
                System.out.print("Friday");
                break;

            case 6:
                System.out.print("Saturday");
                break;

            case 7:
                System.out.print("Sunday");
                break;
        }
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
        */
}

