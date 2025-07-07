
// Abstract class
abstract class Animal {
    abstract void makeSound();
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

//Test
public class Abstractexamples {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Dog barks
        cat.makeSound(); // Cat meows
    }
}
