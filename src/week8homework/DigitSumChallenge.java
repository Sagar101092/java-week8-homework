package week8homework;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 */
public class DigitSumChallenge {
    int digit = 0;//Instance Variable

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        DigitSumChallenge obj = new DigitSumChallenge();
        System.out.println(obj.sumDigits(number));//Printing value from method sumDigits
    }

    /**
     * This method is use to find sum of digits
     *
     * @param number
     * @return
     */
    static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {


//executes until the condition becomes f
            while (number > 0) {
//finds the last digit from the number and add it to the variable sum
                sum = sum + number % 10;
//removes the last digit
                number = number / 10;
            }
//returns the sum
            return sum;
        } else
            return -1;
    }
    //driver code

}


