package Challenge;

public class Comparisiondemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean isAdult = true;
        boolean hasID = false;

        // Comparison Operators
        System.out.println("Comparison Operations:");
        System.out.println("a == b: " + (a == b));     // false
        System.out.println("a != b: " + (a != b));     // true
        System.out.println("a > b: " + (a > b));       // false
        System.out.println("a < b: " + (a < b));       // true
        System.out.println("a >= 10: " + (a >= 10));   // true
        System.out.println("b <= 15: " + (b <= 15));   // false

        // Logical Operators
        System.out.println("\nLogical Operations:");
        System.out.println("isAdult && hasID: " + (isAdult && hasID));   // false
        System.out.println("isAdult || hasID: " + (isAdult || hasID));   // true
        System.out.println("!isAdult: " + (!isAdult));                   // false
    }

}
