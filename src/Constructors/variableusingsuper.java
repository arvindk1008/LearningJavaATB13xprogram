package Constructors;
class Parent {
    String message = "Hello from Parent!";
}

class Child extends Parent {
    String message = "Hello from Child!";

    void displayMessages() {
        System.out.println(super.message);  // Access parent variable
        System.out.println(this.message);   // Access child variable
    }
}


public class variableusingsuper {
    public static void main(String[] args) {
        Child c=new Child();
        c.displayMessages();
    }
}
