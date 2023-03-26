package week8homework;

public class Circle {
    // Instance method
    private double radius;

    // Constructor
    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }

        this.radius = radius;
    }

    // Get value of radius
    public double getRadius() {
        return radius;
    }

    //Get area
    public double getArea() {
        return (radius * radius * 3.14);
    }
}
