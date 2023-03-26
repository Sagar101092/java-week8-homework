package week8homework;

public class Rectangle {

    //Instance Variable
    private double width;
    private double length;
    // Constructor

    public Rectangle(double width, double length) {

        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    //Instance method
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }


}
