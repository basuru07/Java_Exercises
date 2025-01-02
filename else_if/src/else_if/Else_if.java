/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package else_if;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Else_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 100: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 20) {
            System.out.println("The number is in the range of 1 to 20.");
        } else if (num >= 21 && num <= 40) {
            System.out.println("The number is in the range of 21 to 40.");
        } else if (num >= 41 && num <= 60) {
            System.out.println("The number is in the range of 41 to 60.");
        } else if (num >= 61 && num <= 80) {
            System.out.println("The number is in the range of 61 to 80.");
        } else if (num >= 81 && num <= 100) {
            System.out.println("The number is in the range of 81 to 100.");
        } else {
            System.out.println("The number is out of range.");
        }

    }

}
