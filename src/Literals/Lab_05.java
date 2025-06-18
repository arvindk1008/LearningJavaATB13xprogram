package Literals;

public class Lab_05 {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Arvind Kulkarni");
        System.out.println("Arvind"+new_line+"Kulkarni");
        System.out.println("Arvind"+tab_line+"Kulkarni");
        System.out.println("Arvind"+back_space+"Kulkarni");
        System.out.println("Arvind is old"+carriage_return+"Kulkarni");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

    }
}
