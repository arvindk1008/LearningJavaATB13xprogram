package Constructors;
// Parent class
class Person {
    Person(String name) {
        System.out.println("Parent constructor: Name is " + name);
    }
}

// Child class
class Employee extends Person {
    Employee() {
        super("Arvind");  // Call parent constructor
        System.out.println("Child constructor: Employee created");
    }
}

// Main class
public class useofsuper {
    public static void main(String[] args) {
        Employee emp = new Employee();  // Create an Employee object
    }
}