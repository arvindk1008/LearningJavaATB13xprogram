package Strings;

public class StringChallenge01 {
    public static void main(String[] args) {
        //Input String
        String input = "Hello World";
        // 1. Concatenation
        String greeting = input + " - Welcome!";
        System.out.println("Concatenated String: " + greeting);

        // 2. Length
        int length = input.length();
        System.out.println("Length of the String: " + length);

        // 3. Substring
        String sub = input.substring(0, 5); // Extract "Hello"
        System.out.println("Substring (0 to 5): " + sub);

        // 4. Character Extraction
        char ch = input.charAt(6); // 'W' in "World"
        System.out.println("Character at index 6: " + ch);
    }
}
