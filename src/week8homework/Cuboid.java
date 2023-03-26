package week8homework;

public class Cuboid extends Rectangle {
    // Instance Variables
    private double height;

    // Constructor
    public Cuboid(double w, double l, double h) {
        super(w, l);
        if (h < 0) {
            h = 0;
        }
        this.height = h;
    }

    // Instance method
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
