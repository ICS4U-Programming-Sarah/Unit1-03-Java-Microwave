import java.util.Scanner;

/**
* This program receives item and max item from user
* From information given, it calculates how much time,
* would a specific item take to heat up.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-22
*/

public final class Microwave {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception Microwave Utility class.
     * @see IllegalStateException
     */
    private Microwave() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(String[] args) {
        // declare variables
        final String opOne = "pizza";
        final String opTwo = "sub";
        final String opThree = "soup";
        final float TIME_AVE_SUB = 60;
        final float TIME_AVE_PIZ = 45;
        final float TIME_AVE_SOUP = 105;
        final float HALF_TIME = 1f / 2f;
        final String ERROR_MESSAGE = "Please enter specified limit.";

        // Initialize variables
        float time = 0;
        String userFood = " ";
        String amountStr = "";
        int amountInt = 0;


        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Are you heating sub, pizza, or soup? ");
        userFood = scanner.nextLine();

        // If statement checking to see what user enters, comparing
        // the strings together.
        if (userFood.equals(opOne)) {
            System.out.print("How many pizza(s) would you like to heat up ");
            System.out.println( "(max 3): ");
            amountStr = scanner.nextLine();

            // Usage of try catch to detect errors
            try {
                amountInt = Integer.parseInt(amountStr);

                // If statement executing if user enters a specific amount
                // do said calculations.
                if (amountInt == 1) {
                    time = TIME_AVE_PIZ;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 2) {
                    time = (TIME_AVE_PIZ * HALF_TIME) + TIME_AVE_PIZ;
                    System.out.println("The total cook time is: "
                        + time + " seconds.");
                } else if (amountInt == 3) {
                    time = TIME_AVE_PIZ + TIME_AVE_PIZ;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 0) {
                    time = 0;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else {
                    // User enters invalid input, display to them.
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print(ERROR_MESSAGE + error.getMessage());
            }
        // Statement checking to see what user enters, comparing
        // the strings together.
        } else if (userFood.equals(opTwo)) {
            System.out.print("How sub(s) would you like to heat up ");
            System.out.println("(max 3): ");
            amountStr = scanner.nextLine();

            // Usage of try catch to detect the errors.
            try {
                amountInt = Integer.parseInt(amountStr);

                // If statement executing if user enters a specific amount
                // do said calculations.
                if (amountInt == 1) {
                    time = TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 2) {
                    time = (TIME_AVE_SUB * HALF_TIME) + TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 3) {
                    time = TIME_AVE_SUB + TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 0) {
                    time = 0;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else {
                    // User enters invalid input, display to them.
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print(ERROR_MESSAGE + error.getMessage());
            }
        // Statement checking to see what user enters, comparing
        // the strings together.
        } else if (userFood.equals(opThree)) {
            System.out.print("How many items would you like to");
            System.out.println("heat up: (max 3): ");
            amountStr = scanner.nextLine();

            // Usage of try catch to detect the errors.
            try {
                amountInt = Integer.parseInt(amountStr);

                // If statement executing if user enters a specific amount
                // do said calculations.
                if (amountInt == 1) {
                    time = TIME_AVE_SOUP;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 2) {
                    time = (TIME_AVE_SOUP * HALF_TIME) + TIME_AVE_SOUP;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 3) {
                    time = TIME_AVE_SOUP + TIME_AVE_SOUP;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else if (amountInt == 0) {
                    time = 0;
                    System.out.println("The total cook time is: " + time
                        + " seconds.");
                } else {
                    // User enters invalid input, display to them.
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print(ERROR_MESSAGE + error.getMessage());
            }
        // Display to user when enter an option that's not specified.
        } else {
            System.out.println("Please enter specified options above.");
        }
        scanner.close();
    }
}
