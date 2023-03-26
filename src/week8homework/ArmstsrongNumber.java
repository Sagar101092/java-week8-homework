package week8homework;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstsrongNumber {
    /**
     * This method is use to find armstrong number
     * @param n
     */
    static void isArmstrong(int n) {
        //int n = 153;
        int temp = n;
        int p = 0;

        /*function to calculate
          the sum of individual digits
         */
        while (n > 0) {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        /* condition to check whether
           the value of P equals
           to user input or not. */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong Number.");
        } else {
            System.out.println(
                    "No. It is not an Armstrong Number.");
        }
    }


    //Main method
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
//reads the limit from the user
        num = sc.nextInt();
        isArmstrong(num);

    }
}