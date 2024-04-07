package org.example;

public class CalculatorApp {

    // Adds two integers.
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts one integer from another.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides one integer by another.
    // Throws IllegalArgumentException if b is zero.
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        CalculatorApp calculator = new CalculatorApp(); // Create an instance of the calculator

        // Example usage of the calculator
        System.out.println("Sum: " + calculator.add(5, 3));
        System.out.println("Difference: " + calculator.subtract(10, 4));
        System.out.println("Product: " + calculator.multiply(2, 6));
        System.out.println("Quotient: " + calculator.divide(10, 2));
    }
}


