package for_loop;

import java.util.Scanner;

public class For_loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt(); // Input for the number to generate the table

        // Loop to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
