package Basics;

public class debugtry {
    public static void main(String[] args) {
        System.out.println("Starting Debugging...");
        int result = performCalculation(5, 3);
        System.out.println("Calculation Result: " + result);

        String message = generateMessage("Alice");
        System.out.println("Generated Message: " + message);
    }

    public static int performCalculation(int a, int b) {
        int sum = a + b;
        int product = a * b;
        return sum + product;  // Breakpoint here
    }

    public static String generateMessage(String name) {
        return "Hello, " + name + "!";  // Breakpoint here
    }
}