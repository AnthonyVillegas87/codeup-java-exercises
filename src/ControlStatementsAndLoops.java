public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        //Conditional branching
//        int x = 5;
//        if (x == 5){
//            System.out.println("x must be 5 to be running");
//        }
//        System.out.println("On the other hand, maybe not");

//        int y = 2;
//        y = 3;
//        if (y == 2){
//            System.out.println("this is true");
//        } else{
//            System.out.println("The result was false");
//        }
//        short y = -5;
//        y = 12;
//       y = 32450;
        // y = 33000; //incompatible types: possible lossy conversion from int to short
//        if (y < 0 ) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >=0 && y < 30000){
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

        String customerChoice = "vanilla";
        switch (customerChoice) {
            case "vanilla":
                System.out.println("One vanilla coming right up");
                break;
            case "chocolate":
                System.out.println("chocolate coming right up");
                break;
            case "strawberry":
                System.out.println("strawberry coming right up");
                break;
            default:
                System.out.println("We don't have that");
                break;
        }


        /*
        Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler before it is executed by the Java Virtual Machine on your computer.
        A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

        The compiling process catches mistakes before the computer runs our code.
        The Java compiler runs a series of checks while it transforms the code.
        Code that does not pass these checks will not be compiled.

        Java programs have at least one class and one main() method.
        Each class represents one real-world idea.
        The main() method runs the tasks of the program.

        Java is a compiled language.
        Compiling catches mistakes in our code.
        Compilers transform code into an executable class.


////============== CLASSES =============================//
        All Java programs are made of at least one class.
        The class name must match the file: our file is HelloWorld.java and our class is HelloWorld.
        We capitalize every word, a style known as pascal case.
        Java variables and methods are named in a similar style called camel case where every word after the first is capitalized.
        The curly braces, { and }, mark the scope of the class.
        Everything inside the curly braces is part of the class.


// ============== METHODS =============================//
    Every Java program must have a method called main().
    A method is a sequence of tasks for the computer to execute.
    This main() method holds all the instructions for our program.

// ============  STATEMENTS ======================//
    This code uses the method println() to send the text “Hello World!” to the terminal as output.
    println() comes from an object called out, which is responsible for various types of output.
    Objects are packages of state and behavior, and they’re often modeled on real-world things.
    out is located within System, which is another object responsible for representing our computer within the program!
    We can access parts of an object with a ., which is known as dot notation.
    This line of code is a statement, because it performs a single task.
    Statements always conclude with a semicolon.

//======== VARIABLES ===============//
    In Java, we specify the type of information we’re storing.
    Primitive datatypes are types of data built-in to the Java system.
    The three main primitive types we’ll cover are int, double, and boolean;
    this lesson will introduce these built-in types and more.
    // ints //
    In Java, whole numbers are stored in the int primitive data type.
    ints hold positive numbers, negative numbers, and zero.
    They do not store fractions or numbers with decimals in them.
    The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive.
    // int variable declaration
    int yearJavaWasCreated;
    // assignment
    yearJavaWasCreated = 1996;
    // declaration and assignment
    int numberOfPrimitiveTypes = 8;

    // doubles //
    What if we wanted to store the world’s population?
    That number would be larger than the int type can hold.
    double can hold decimals as well as very large and very small numbers.
    The maximum value is 1.797,693,134,862,315,7 E+308, which is approximately 17 followed by 307 zeros.
    The minimum value is 4.9 E-324, which is 324 decimal places!
    // doubles can have decimal places:
    double price = 8.99;
    // doubles can have values bigger than what an int could hold:
    double gdp = 12237700000;

    // booleans //
    Often our programs face questions that can only be answered with yes or no.
    We declare boolean variables by using the keyword boolean before the variable name.
    boolean javaIsACompiledLanguage = true;
    boolean javaIsACupOfCoffee = false;

    // char //
    The char data type can hold any character, like a letter, space, or punctuation mark.
    It must be surrounded by single quotes, '.
    char grade = 'A';
    char firstLetter = 'p';
    char punctuation = '!';

    // String //
    Our programs will also use Strings, which are objects, instead of primitives.
    Objects have built-in behavior.
    There are two ways to create a String object: using a String literal or calling the String class to create a new String object.
    Like primitive-type variables, we declare a String variable by specifying the type first:
    String greeting = "Hello World";
    We could also create a new String object by calling the String class when declaring a String like so:
    String salutations = new String("Hello World");

        * */


    }
}
