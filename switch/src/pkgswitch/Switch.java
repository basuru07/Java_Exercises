/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter a Number (1-7) for the day of the week: ");
        int number = input.nextInt();
        
        switch(number){
            case 1: System.out.println("The day is Monday");
            break;
            
            case 2: System.out.println("The day is Tuesday");
            break;
            
            case 3: System.out.println("The day is Wednesday");
            break;
            
            case 4: System.out.println("The day is Thursday");
            break;
            
            case 5: System.out.println("The day is Friday");
            break;
            
            case 6: System.out.println("The day is Saturday");
            break;
            
            case 7: System.out.println("The day is Sunday");
            break;
            
            default: System.out.println("Invalid day.");
            break;
            
        }
    }
    
}
