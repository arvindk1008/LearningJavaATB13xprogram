import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to handle uppercase letters too
        ch = Character.toLowerCase(ch);

        // Check if it's a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }

        scanner.close();

    }
}
