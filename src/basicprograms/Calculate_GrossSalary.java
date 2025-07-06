
package basicprograms;
import java.util.*;
public class Calculate_GrossSalary {
    /** Write a program in Java to input the name and basic salary of an employee.calculate and display
    gross salary and net salary when
     da=30% of basic
     hra=12.5% of basic
     pf=10% of basic
     gross=basic+da+hra
     net pay=gross-pf
          */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int basic;
        double da;
        double hra;
        double pf;
        double gp=0;
          double np=0;
          String name;
          System.out.println("Enter the name of employee");
          name=in.nextLine();
          System.out.println("Enter Basic Salary");
          basic=in.nextInt();
          da=basic*30.0/100.0;
          hra=basic*12.5/100.0;
          pf=basic*10.0/100.0;
          gp=basic+da+hra;
          np=gp-pf;
          System.out.println("Employee's Name:"+name);
          System.out.println("Gross Pay:Rs"+gp);
          System.out.println("Net pay:Rs"+np);

    }
}
