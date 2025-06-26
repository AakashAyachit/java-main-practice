package Basics;

public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i * i <= num; i++) { // Loop up to √num for efficiency
            if (num % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }

        return true; // No divisors found, number is prime
    }

    public static void main(String[] args) {
        int number = 29; // Change this to test different numbers

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
