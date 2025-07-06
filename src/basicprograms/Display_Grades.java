package basicprograms;
import java.util.*;
public class Display_Grades {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p,c,b;
        float avg=0;
        String name,gr="";
        System.out.println("Enter Name");
        name= in.nextLine();
        System.out.println("Enter Marks in Physics,Chemistry and Biology");
        p=in.nextInt();
        c=in.nextInt();
        b=in.nextInt();
        avg=(p+c+b)/3;
        if(avg>=80)
            gr="Distinction";
        if (avg>=60&&avg<80)
        gr="First Division";
        if(avg>=45&&avg<60)
            gr="Second Divison";
        if(avg>=40&&avg<45)
            gr="Pass";
        if (avg<40)
            gr="Promotion not granted";
        System.out.println("Name:"+name);
        System.out.println("Average Marks:"+avg);
        System.out.println("Grade:"+gr);
    }

}
