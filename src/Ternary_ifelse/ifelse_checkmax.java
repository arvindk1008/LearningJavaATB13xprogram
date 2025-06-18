package Ternary_ifelse;

public class ifelse_checkmax {
    public static void main(String[] args) {
        //? means “then”
        //→ It separates the condition from the result if the condition is true.
        //
        //: means “else”
        //→ It separates the result if the condition is false.
        int n1=9;
        int n2=10;
        int n3=11;
        int max=(n1>n2) ? (n1>n3) ? n1:n3:(n2>n3)?n2:n3;
        System.out.println(max);
        // max=(n1>n2) ? (n1>n3)? n1:n3 :(n2>n3)?n2:n3;
    }
}
