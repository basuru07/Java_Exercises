package do_while;

import java.util.Scanner;

public class Do_while {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String correctPassword = "Java123"; // Define the correct password
        String enteredPassword;

        do {
            System.out.println("Enter the password:");
            enteredPassword = in.nextLine(); // Get the user input

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!enteredPassword.equals(correctPassword)); // Loop until the correct password is entered

        System.out.println("Access granted! Welcome.");
    }
}
