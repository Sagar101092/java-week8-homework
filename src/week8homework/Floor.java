package week8homework;

public class Floor {
    // Declare instance variables
    double length;
    double width;

    // Constructor
    public Floor(double length, double width) {
        if (width < 0 && length > 0) {
            this.width = 0;
            this.length = length;

        } else if (width > 0 && length < 0) {

            this.width = width;
            this.length = 0;
        } else if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    // Get length
    public double getLength() {
        return length;
    }

    //Get width
    public double getWidth() {
        return width;
    }

    /**
     * This method returns area
     *
     * @return
     */
    public double getArea() {
        return this.length * this.width;
    }

}
