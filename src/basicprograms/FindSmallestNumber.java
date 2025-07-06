package basicprograms;
import java.util.*;
public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,d,p;
        System.out.println("Enter three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=Math.min(a,b);
        p=Math.min(c,d);
        System.out.println("Smallest Number ="+p);
    }
}
