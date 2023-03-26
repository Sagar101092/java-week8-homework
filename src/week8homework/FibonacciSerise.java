package week8homework;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciSerise {
    // Main method
    public static void main(String[] args) {
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.println("How many numbers you want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        logic(maxNumber);
    }

    /**
     * This method is used to find Fibonacci series
     *
     * @param maxNumber
     */
    public static void logic(int maxNumber) {
        int previousNumber = 0;
        int nextNumber = 1;
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
