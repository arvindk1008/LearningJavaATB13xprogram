package Abstract_Examples;

// Abstract class
abstract class Animal {
    abstract void makeSound();
}

// Abstract_Examples.Dog class extending Abstract_Examples.Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Abstract_Examples.Dog barks");
    }
}

// Abstract_Examples.Cat class extending Abstract_Examples.Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Abstract_Examples.Cat meows");
    }
}

//Test
public class Abstractexamples {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Abstract_Examples.Dog barks
        cat.makeSound(); // Abstract_Examples.Cat meows
    }
}
