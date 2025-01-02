/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your Full Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        
        // Consume the leftover newline character after nextInt()
        input.nextLine(); 
        
        System.out.print("Enter Your Favorite Color: ");
        String color = input.nextLine();
        
        
        System.out.println("\n");
        System.out.println("-------- OUTPUT -------");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color);
    }
}
