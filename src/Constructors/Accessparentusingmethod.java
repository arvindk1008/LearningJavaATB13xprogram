package Constructors;

class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        super.startEngine();  // Call the parent class method
        System.out.println("Car engine started with advanced system.");
    }
}
public class Accessparentusingmethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // Output both Vehicle and Car messages
    }
}