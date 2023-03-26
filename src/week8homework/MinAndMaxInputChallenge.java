package week8homework;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */
public class MinAndMaxInputChallenge {
    //Main method
    public static void main(String[] args) {
        operation();//Calling Static method
    }

    /**
     * This method is use to find min and max number form input value
     */
    public static void operation() {
        int currentMax = Integer.MIN_VALUE;
        int currentMin = Integer.MAX_VALUE;
        int intInput = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers");
        while (input.hasNextInt()) {
            intInput = input.nextInt();

            if (intInput < currentMin) currentMin = intInput;
            if (intInput > currentMax) currentMax = intInput;

        }
        System.out.println("currentmin is " + currentMin);
        System.out.println("currentmax is " + currentMax);

    }


}

