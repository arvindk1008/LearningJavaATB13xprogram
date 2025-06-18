package Ternary_ifelse;

public class ifelse_07 {
    public static void main(String[] args) {
        //Find the maximum value between 3 numbers
        int n1=2;
        int n2=3;
        int n3=4;
        int max=(n1>n2) ?(n1>n3)? n1:n3 : (n2>n3) ? n2:n3;
System.out.print(max);
    }
}
