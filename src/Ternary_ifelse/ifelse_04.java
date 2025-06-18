package Ternary_ifelse;

public class ifelse_04 {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
