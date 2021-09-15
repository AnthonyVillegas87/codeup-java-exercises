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
     */



}
