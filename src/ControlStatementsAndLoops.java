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




        * */


    }
}
