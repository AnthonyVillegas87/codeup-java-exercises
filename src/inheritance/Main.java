package inheritance;

public class Main {

//    Inheritance
//
//    We can define classes that extend, or inherit from another class with the extends keyword in the class definition.
//    We call these subclasses, and the classes that are being inherited from / extended superclasses.
//
//    A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.


    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        //dog.walk();
        dog.run();

    }
}
