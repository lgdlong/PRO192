package Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_4 {

    // Method to calculate the sum of even numbers
    public static long sumOfEvenNumbers(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Method for input validation
    public static int getValidInput(Scanner sc) {
        int n = 0;
        while (true) {
            try {
                System.out.print("Enter n (n >= 20): ");
                n = sc.nextInt();
                if (n >= 20) {
                    break; // Valid input, break the loop
                } else {
                    System.out.println("Error: n must be at least 20. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                sc.next(); // Clear invalid input
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get a valid input from the user
        int n = getValidInput(sc);

        // Calculate and display the sum of even numbers
        long sum = sumOfEvenNumbers(n);
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
    }
}