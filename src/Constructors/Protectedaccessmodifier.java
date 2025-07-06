package Constructors;
class Animal {
    protected void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void doEat() {
        // Calling protected method of superclass
        eat();
    }
}

public class Protectedaccessmodifier {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.doEat();         // output will be Animal is eating
    }
}
