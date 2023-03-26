package week8homework;

public class Cylinder extends Circle {

    //Instance variable
    private double height;

    // Counstructor
    public Cylinder(double radius, double h) {
        super(radius);
        if (height < 0) {
            h = 0;
        }
        height = h;
    }

    // Get value of height
    public double getHeight() {
        return height;
    }

    // Get value of Volume
    public double getVolume() {
        return super.getArea() * getHeight();
    }
}
