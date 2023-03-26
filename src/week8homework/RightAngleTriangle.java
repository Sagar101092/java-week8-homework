package week8homework;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class RightAngleTriangle {
    // Mian method
    public static void main(String[] args) {
        triangle();//Calling Static method
    }

    /**
     * This method is use to print right angle triangle
     */
    public static void triangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
