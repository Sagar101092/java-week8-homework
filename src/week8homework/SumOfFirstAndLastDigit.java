package week8homework;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class SumOfFirstAndLastDigit {
// Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        System.out.println(sumFirstAndLastDigit(number));// Printing Value
    }

    /**
     * This method is use to find sum of First number and last number
     * @param number
     * @return
     */
    public static int sumFirstAndLastDigit(int number) {
        int mod = 0;
        int firstdivide = 0;
        int seconddivide = 0;
        int sum = 0;

        if (number < 0) {
            return -1;
        } else if (number > 0 && number < 10) {
            return number + number;
        } else if (number >= 10 && number < 100) {
            mod = number % 10;
            firstdivide = number / 10;
            sum = mod + firstdivide;

            return sum;
        }

        while (number > 0) {
            mod = number % 10;
            firstdivide = number / 10;
            seconddivide = firstdivide / 10;
            sum = mod + seconddivide;

            break;
        }

        return sum;
    }
}
