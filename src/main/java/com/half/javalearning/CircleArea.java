package com.half.javalearning;
    
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A simple class to calculate the area of a circle based on user input.
 */
public class CircleArea {

    // Scanner for reading user input
    private final Scanner scanner;

    /**
     * Constructor that initializes the Scanner with System.in
     */
    public CircleArea() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main method that handles the circle area calculation process
     */
    public void go() {
        System.out.println("We will calculate area of circle for a given radius!");

        double radius = getValidRadius();

        if (Double.isNaN(radius)) {
            return; // Exit if invalid input was provided
        }

        // Calculate the area using the formula: π × r²
        double area = calculateCircleArea(radius);

        // Display the result with formatted output
        System.out.printf("Result area: %.4f!%n", area);
    }

    /**
     * Gets a valid radius from user input with proper error handling
     * @return the radius as a double, or NaN if input was invalid
     */
    private double getValidRadius() {
        System.out.print("You need to enter radius (positive number): ");
        try {
            double input = scanner.nextDouble();

            // Check if radius is positive
            if (input <= 0) {
                System.err.println("Radius must be positive! Please try again next time.");
                return Double.NaN;
            }

            return input;
        } catch (InputMismatchException e) {
            System.err.println("That is not a valid number! Please enter digits only!");
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
            return Double.NaN;
        } finally {
            // Consume the rest of the line to prevent scanner issues
            scanner.nextLine();
        }
    }

    /**
     * Calculates the area of a circle
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    private double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Closes the scanner when done with the calculation
     * Should be called when finished using this class
     */
    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea();
        circleArea.go();
        circleArea.closeScanner();
    }
}
