package week8homework;

public class SimpleCalculator {

    // Instance method
    private double firstNumber;
    private double SecondNumber;

    //Get firstnumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Set firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //Get second number
    public double getSecondNumber() {
        return SecondNumber;
    }

    // Set SECOND NUMBER
    public void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }

    //// This method is use to get ADDITION result
    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    // This method is use to get Substraction result
    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    // This method is use to get multiplication result
    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    // This method is use to get division
    public double getDivisionResult() {

        if (firstNumber == 0 || SecondNumber == 0) {
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }

    // main method
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }


}
