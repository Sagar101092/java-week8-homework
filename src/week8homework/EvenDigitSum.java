package week8homework;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        int result = getEvenDigitSum(number);
        System.out.println(result);// Printing sum of even numbers
    }

    /**
     * This method is used to find sum of even numbers
     *
     * @param number
     * @return
     */
    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int digit, sum = 0;
        boolean flag = false;
        if (number > 0) {
            while (number != 0) {
                digit = number % 10;

                if (digit % 2 == 0)
                    sum = sum + digit;

                number = number / 10;
            }
            return (sum);
        } else
            return -1;
    }
}
