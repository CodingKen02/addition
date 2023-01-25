/*
Name: Kennedy Keyes
Date: February 18, 2021
Name of Program: Addition.java
Description: This program will ask the user to input two numbers and display the
sum.
 */
package addition;
import java.util.Scanner; // program uses class Scanner
/**
 *
 * @author codingken
 */
public class Addition {
// main method begins execution of Java Application
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first integer: "); // prompt
            int number1 = input.nextInt(); // read first number from user
            
            System.out.print("Enter second integer: "); // prompt
            int number2 = input.nextInt(); // read second number from user
            
            int sum = number1 + number2; // add numbers, then store total in sum
            
            System.out.printf("Sum is %d%n", sum); // display sum
        }
    } // end method main
    
} // end class Addition
