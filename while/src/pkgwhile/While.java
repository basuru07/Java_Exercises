package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 63; // The secret number
        int attempts = 0; // Counter for the number of attempts

        while (true) {
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            attempts++; // Increment attempts with each guess

            if (number < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (number > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (number == secretNumber) {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break; // Exit the loop when the correct number is guessed
            }
        }
    }
}
