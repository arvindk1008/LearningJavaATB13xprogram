package Strings;

public class StringComparision2 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // 1. Using == operator (compares references)
        System.out.println("Using == operator:");
        System.out.println("string1 == string2: " + (string1 == string2)); // false
        System.out.println("string1 == string3: " + (string1 == string3)); // true (string literals may point to same pool reference)

        // 2. Using equals() method (compares values - case-sensitive)
        System.out.println("\nUsing equals():");
        System.out.println("string1.equals(string2): " + string1.equals(string2)); // false
        System.out.println("string1.equals(string3): " + string1.equals(string3)); // true

        // 3. Using equalsIgnoreCase() method (compares values - case-insensitive)
        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("string1.equalsIgnoreCase(string2): " + string1.equalsIgnoreCase(string2)); // true

        // 4. Using compareTo() method (returns 0 if equal, negative if less, positive if greater)
        System.out.println("\nUsing compareTo():");
        System.out.println("string1.compareTo(string2): " + string1.compareTo(string2)); // negative (H < h)
        System.out.println("string1.compareTo(string3): " + string1.compareTo(string3)); // 0 (exact match)

    }
}
