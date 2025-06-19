package Leapyear;
import java.util.Scanner;
public class leapyear_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter Year
        System.out.println("Enter a Year:");
        int year=sc.nextInt();
        //Check for entered year is leap or not
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year + " is a leap year.");
       } else
       {
           System.out.println(year + " is not a leap year.");
       }
        sc.close();
    }
}


