package Constructors;
//Student.Java file
class Student {
    void showDetails() { // default Access
        System.out.println("Students details displayed");

    }
}
//DefaultAccess java
public class DefaultAccess {
    public static void main(String[] args){
        Student s=new Student();
        s.showDetails();
    }
}
