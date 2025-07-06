package basicprograms;

public class Find_Area_of_Square {
    //Find Area,perimeter,Diagonal of a Square
    public static void main(String[] args) {
        int s, ar=0,p=0;
        double d=0.0;
        s=25;
        ar=s*s;
        p=4*s;
        d=Math.sqrt(2)*s;
        System.out.println("The Area of Square="+ar);
        System.out.println("The Perimeter of Square="+p);
        System.out.println("The Diagonal of Square="+d);

    }
}
