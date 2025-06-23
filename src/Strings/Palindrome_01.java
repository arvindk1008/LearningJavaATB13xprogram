package Strings;
import java.util.Scanner;

public class Palindrome_01 {
    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
// Input the String
        System.out.print("Enter String or Number");
        String input =scanner.nextLine();
        //Convert to Lower case and remove spaces
        String cleanInput=input.replaceAll("\\s+","").toLowerCase();

        // Reverse the input
        String reversed=new StringBuilder(cleanInput).reverse().toString();
        //Check if given number is Palindrome or not
        if (cleanInput.equals(reversed)) {
            System.out.println(" Yes,it is a palindrome");
        } else {
            System.out.println("No,it is not a palindrome");
                    }
        scanner.close();
    }
}

