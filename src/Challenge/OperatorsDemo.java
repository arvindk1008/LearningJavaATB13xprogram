package Challenge;

public class OperatorsDemo {
    public static void main(String[] args) {

                int a = 10;
                int b = 3;

                // Arithmetic Operators
                System.out.println("Arithmetic Operations:");
                System.out.println("a + b = " + (a + b));  // Addition
                System.out.println("a - b = " + (a - b));  // Subtraction
                System.out.println("a * b = " + (a * b));  // Multiplication
                System.out.println("a / b = " + (a / b));  // Integer Division
                System.out.println("a % b = " + (a % b));  // Modulus

                // Assignment Operators
                int x = 5;
                System.out.println("\nAssignment Operations:");

                System.out.println("Initial x = " + x);

                x += 2; // x = x + 2
                System.out.println("x += 2 -> " + x);

                x -= 1; // x = x - 1
                System.out.println("x -= 1 -> " + x);

                x *= 3; // x = x * 3
                System.out.println("x *= 3 -> " + x);

                x /= 2; // x = x / 2
                System.out.println("x /= 2 -> " + x);

                x %= 4; // x = x % 4
                System.out.println("x %= 4 -> " + x);
            }
        }

