package week8homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 */
public class ReadingUserInputChallenge {
    //main method
    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.nextInt();//Calling instance method
    }

    /**
     * This is instance method use to count the sum of input number
     */
    public void nextInt() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myClassroom = new ArrayList<Integer>();
        int counter = 1;
//

        while (counter <= 10) {
            System.out.println("Enter the #" + counter + " number: ");
            while ((input.hasNextInt() == false)) {
                System.out.println("Enter valid integer");
                input.next();
            }
            sum += input.nextInt();
            counter++;
        }
        System.out.println(sum);
    }
}



