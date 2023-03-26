package week8homework;

/**
 * 15. Display left angle triangle of * using nested for loops
 */
public class LeftAngleTriangle {

    public static void main(String args[]) {

       pattern();//Calling static method
    }

    /**#
     * This is static method use to print left angle triange
     */
    public static void pattern(){

        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 3; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
