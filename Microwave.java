import java.util.Scanner;

/**
* This program receives the mass from the user.
* From information given, it calculates how much energy,
* a specific mass would produce.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-16
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
        final String op_1 = "pizza";
        final String op_2 = "sub";
        final String food3 = "soup";
        final float TIME_AVE_SUB = 60;
        final float TIME_AVE_PIZ = 45;
        final float TIME_AVE_SOUP = 105;
        final float HALF_TIME = 1f / 2f;
        final float time;

        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Are you heating sub, pizza, or soup? ");
        final String userFood = scanner.nextLine();

        if (userFood.equals(op_1)) {
            System.out.println("How many items would you like to heat (max 3): ");
            final String amountStr = scanner.nextLine();

            try {
                final Integer amountInt = Integer.parseInt(amountStr);
                if (amountInt == 1) {
                    time = TIME_AVE_PIZ;
                    System.out.println("The total cook time is: " + time);
                } else if (amountInt == 2) {
                    time = (TIME_AVE_PIZ * HALF_TIME) + TIME_AVE_PIZ;
                    System.out.println("The total cook time is: " + time);
                } else if (amountInt == 3) {
                    time = TIME_AVE_PIZ + TIME_AVE_PIZ;
                    System.out.println("The total cook time is: " + time);
                } else {
                    System.out.println("Please enter a valid input");
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                        + error.getMessage());
            }
        }
        if (userFood.equals(op_2)) {
            System.out.println("How many items would you like to heat (max 3): ");
            final String amountStr = scanner.nextLine();

            try {
                final Integer amountInt = Integer.parseInt(amountStr);
                if (amountInt == 1) {
                    time = TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time);
                } else if (amountInt == 2) {
                    time = (TIME_AVE_SUB * HALF_TIME) + TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time);
                } else if (amountInt == 3) {
                    time = TIME_AVE_SUB + TIME_AVE_SUB;
                    System.out.println("The total cook time is: " + time);
                } else {
                    System.out.println("Please enter a valid input");
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                        + error.getMessage());
            }

        }
        scanner.close();
    }
}