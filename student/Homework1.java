package student;

public class Homework1 {

    public double shippingCalculator(int n) {
        if (n <= 0) {
            return 0; // No items, no shipping charge.
        }
        double firstItemCost = 10.95;
        double subsequentItemCost = 2.95;
        return firstItemCost + (n - 1) * subsequentItemCost; // First item + additional items.
    }

    // Problem 2: Valid Triangle
    public boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Problem 3: Prime Number Check
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and below are not prime numbers.
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself.
            }
        }
        return true; // Prime if not divisible by any number up to sqrt(number).
    }

    // Problem 4: Hexadecimal to Decimal Conversion
    public int hex2int(String hex) {
        if (hex == null || hex.length() != 1) {
            return -1; // Invalid input.
        }
        char ch = hex.toUpperCase().charAt(0);
        if (ch >= '0' && ch <= '9') {
            return ch - '0'; // Convert 0-9 to integers.
        } else if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10; // Convert A-F to integers.
        }
        return -1; // Invalid hexadecimal character.
    }

    // Problem 4: Decimal to Hexadecimal Conversion
    public String int2hex(int value) {
        if (value < 0 || value > 15) {
            return "-1"; // Invalid input.
        }
        if (value < 10) {
            return Integer.toString(value); // 0-9 as strings.
        } else {
            return Character.toString((char) ('A' + (value - 10))); // Convert 10-15 to A-F.
        }
    }
}
