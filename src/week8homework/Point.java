package week8homework;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 */
public class Point {
    // Instance variables
    int x;
    int y;

    // constructor without parameters
    public Point() {
        this.x = x;
    }

    //Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get value of x
    public int getX() {
        return x;
    }

    // get value of y
    public int getY() {
        return y;
    }

    //set value of x
    public void setX(int x) {
        this.x = x;
    }

    //set value of y
    public void setY(int y) {
        this.y = x;
    }


    /**
     * This method returns distance
     *
     * @return
     */
    public double distance() {
        return distance(0, 0);
    }

    /**
     * This method returns distance
     *
     * @param x
     * @param y
     * @return
     */
    public double distance(int x, int y) {
        //  System.out.println("this.x and this.y " + this.x + " " + this.y);

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    /**
     * This method returns distance
     *
     * @param secondPoint
     * @return
     */
    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }

    //main method
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }


}
