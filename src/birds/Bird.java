package birds;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Tweet tweet");
    }

    public void move() {
        System.out.println("FLAP FLAP");
    }

    Bird(String name) {
       this.name = name;
    }

    /*
    Java incorporates the object-oriented programming principle of polymorphism.
    Polymorphism, which derives from Greek meaning “many forms”, allows a child class to share the information and behavior of its parent class while also incorporating its own functionality.

    The main advantages of polymorphic programming:

    Simplifying syntax
    Reducing cognitive overload for developers
    These benefits are particularly helpful when we want to develop our own Java packages for other developers to import and use.

    For example, the built-in operator + can be used for both doubles and ints. To the computer, the + means something like addDouble() for one and addInt() for the other, but the creators of Java (and of other languages) didn’t want to burden us as developers with recalling each individual method.

    Note that the reverse situation is not true; you cannot use a generic parent class instance where a child class instance is required. So an Orange can be used as a Fruit, but a Fruit cannot be used as an Orange.


        A Java class can inherit fields and methods from another class.
    Each Java class requires its own file, but only one class in a Java package needs a main() method.
    Child classes inherit the parent constructor by default, but it’s possible to modify the constructor using super() or override it completely.
    You can use protected and final to control child class access to parent class members.
    Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class, but also give it its own traits.
    You can override parent class methods in the child class, ideally using the @Override keyword.
    It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.
     */



}
