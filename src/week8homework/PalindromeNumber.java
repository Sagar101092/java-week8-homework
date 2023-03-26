package week8homework;

import java.util.Scanner;

/**
 * 5. Palindrome Number
 */
public class PalindromeNumber {
    int sum = 0, r;

    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(number));//Printing the vaule true or false (Plaindrom or not)
    }

    /**
     * This method is use to reverse the number
     *
     * @param num
     * @return
     */
    private static int reverse(int num) {
        int res = 0;
        while (num != 0) {
            res = (res * 10) + (num % 10);
            num = num / 10;
        }
        return res;
    }

    /**
     * This mrthod is use to find num is palindrome or not
     *
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        if (num == 0) return false;
        return num == reverse(num);
    }


}

