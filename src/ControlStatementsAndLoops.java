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

//        String customerChoice = "vanilla";
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We dont carry that");
//        }

//        int c = 0, d = 100, e = 50;
//        if( c == 0 && e++ < 100 )
//        {
//            d = 150;
//        }
//        System.out.println("e = " + e );

        int number =42;
        boolean exist = true;
        if(exist | number++ == 42) {
        }
        System.out.println(number);


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

    // final Keyword //
    what do we do with a variable that should never change its value?
    For example, the year we were born will always stay the same.
    To declare a variable with a value that cannot be manipulated, we need to use the final keyword. To use the final keyword, prepend final to a variable declaration like so:
    final int yearBorn = 1968;

/// ====================  As programmers, we can do something similar by transforming a value of one primitive data type to another using TYPE CASTING. ==========/////

    Numerical-Based Casting
    When we use casting to change the data type of number-based values, it can impact how much data the value holds.
    If there is less data in the value after casting, it’s considered narrow type casting. If the value contains more data after casting, it’s classified as widening type casting.
    In order to cast, we need to use a casting operator to alert the compiler that we want to create a temporary value that is a converted data type.
    Two casting operators we will focus on are (int) and (double).

   // Narrow Type Casting //
    To convert a double to an int, we would place the casting operator (int) in front of a value we would like to convert.

    For example:

    double numDouble = 12.99;
    System.out.println("Double value: " + numDouble);
    // convert a double to int
    int numInt = (int) doubleNum;
    System.out.println("Int value: " + numInt);
    This would output:

    Double value: 12.99
    Int value: 12

    When we convert a double to an int, the digits to the right of the decimal point are truncated.
    Of course, when we see a value like 12.99, we know that it’s numerically closer in value to 13 than it is to 12.
    Java does not automatically round the value.
    If we want to round our positive value to the nearest integer, we can use (int)(value + 0.5); in the case that our number is negative, we would instead use (int)(x - 0.5):
    double numDouble = 12.99;
    System.out.println("Double value: " + numDouble);
    // convert a double to an int rounded to nearest value
    int numInt = (int) (doubleNum + 0.5);
    System.out.println("Int value: " + numInt);

    This would output:

    Double value: 12.99
    Int value: 13


    It’s important to be aware that there are limitations to when working with whole number, or int, values in Java.
    There is a limited amount of data that can be stored in an int — 4 bytes. We can use Integer.MIN_VALUE and Integer.MAX_VALUE to find the minimum and maximum value of an int:

    System.out.println("Min: " + Integer.MIN_VALUE); // Prints: Min: -2147483648
    System.out.println("Max: " + Integer.MAX_VALUE); // Prints: Max: 2147483647


    If we created an expression that evaluated to a value outside of this range,
    we would be faced with an integer overflow, which could result in an error or having an incorrect value that’s within the allowed range.

 // ===========   Widening Type Casting   ============ //
    If we were to use casting to change an int value to a double, we’d need to implement the (double) casting operator in our code:

    int numInt = 9;
    System.out.println("Int value: " + numInt);
    // convert an int to a double
    System.out.println("Double value: " + (double)numInt);

    This will output:

    Int value: 9
    Double value: 9.0

    In the program above, we did not change the type of numInt in the second print statement; instead, we created a temporary value when we casted numInt as a double.
    If we wanted to permanently save that value, we could create a new variable like double newValue = (double)numInt.

    Unlike in narrow type casting, an int value can automatically get cast to a double value in Java code.
    For example, this occurrence can happen when we create an arithmetic expression that references a double and an int:

    System.out.println(100.0 / 5); // Prints: 20.0

    Java automatically cast the value as a double even though one of the values in the expression was an int.

    We can also cast the value of an expression as a double even if both values in the expression are ints.
    To do this, we’ll place (double) in front of an expression that is contained in its own set of parentheses like so:

    System.out.println((double)(100 / 5)); // Prints: 20.0

//    Converting Integer and String Values  //
    In Java, we can convert an int value to a String value and vice versa.
    This doesn’t count as casting because a String is not a primitive type value, but it can be useful to know how to perform this conversion.
    To change the value of an int into a String, we need to use the valueOf() method from the String class:

    int numInt = 15;
    System.out.println("Int value: " + numInt);
    // Convert int value to String
    String numString = String.valueOf(numInt);
    System.out.println("String value: " + numString);
    This will output:

    Int value: 15
    String value: 15
    Even though the output looks the same, the second output shows us a String value instead of an int value.

    If we wanted to turn a String value into an int, we would need to call the parseInt() method from the Integer class. In order to call this method, we will reference the class Integer and then call the method parseInt() by using the dot operator (.). All together, this call would look like this Integer.parseInt(argumentValue).

    Let’s see this in action by converting the String value "12" into an int:

    String numString = "12";
    // convert String to int
    int numInt = Integer.parseInt(numString);
    System.out.println("The int value: " + numInt); // Prints: The int value: 12
    // we can now use the value like any other int
     numInt++;
    System.out.println(numInt); // Prints: 13
    Note that the value in the String MUST contain a numerical value in order to convert it into an int. If we tried to run the code Integer.parseInt(“hello”);, we would receive an error.

 //// CONCLUSION ///
    Casting is the process of converting a value of one primitive data type to another.
    Narrow type casting occurs when the amount of data held a value decreases after conversion.
    To convert a double into an int, we must use the (int) casting operator.
    Narrow type casting does not automatically occur in Java and must be done manually by the programmer.
    Widening type casting occurs when a value increases how much data it holds after casting.
    To convert an int to a double, we need to use the (double) casting operator.
    Widening type casting can occur automatically in Java. String values can be converted to an int using the parseInt() method from the Integer class.
    An int value can be converted into a String using the valueOf() method from the String class.


 //   Applying DeMorgan’s Laws  //
    DeMorgan’s laws are a set of rules we can apply to boolean expressions in order to transform the expression without changing its overall value.

    DeMorgan’s first law explains that two expressions that are negated together (using !) and compared with AND (&&) are equivalent to two separately negated expressions compared with OR (||):

    !(exp1 && exp2) == !(exp1) || !(exp2)
    The second law proves that, on the opposite hand, two expressions that are negated together and compared with OR are equivalent to two individually negated expressions compared with AND:

    !(exp1 || exp2) == !(exp1) && !(exp2)
    Going back to our above example, let’s break down how we can use DeMorgan’s laws to simplify this expression:

    !(a > b && a == b)
    Using the information from the first law, we’ll move a > b and a == b into separate parentheses prepended with !.
    Then, we’ll change && to || which will give us the following expression:

    !(a > b) || !(a == b)


 //   Removing Negation with Opposite Operators  //
    We can eliminate NOT operators (!) from our expressions by changing all operators to their negated, or opposite, value.

    Let’s continue to simplify the expression !(a > b) || !(a == b) by rewriting it so that the expression doesn’t use !.
    We’ll start with the operand on the right: !(a > b). In order to remove ! without changing the expression’s value, we must change the > operator to its opposite value.

    We can use the following table to find an operator’s negated value:

    Operator	Negated Operator
    ==	            !=
    !=	            ==
    >	            <=
    <	            >=
    <=	            >
    >=	            <

    With this information, we know > will become <=, making our expression !(a > b) become a <= b.
    Now, we’ll convert the other part of the expression !(a == b) to a != b.

    Putting it all together, our final expression looks like this:

    a <= b || a != b
    Despite the expressions !(a > b && a == b) and a <= b || a != b looking different, they are equivalent boolean values.
    No matter what values we give a and b, the two expressions will result in the same value.

    DeMorgan’s Laws can be used to rewrite expressions.
    The first law states that two expressions that are negated together and compared using && is equivalent to two separately negated expressions compared with ||.
    The second law states that two expressions that are compared with || and are negated together are equivalent to two separately negated expressions compared with &&.
    To remove the NOT operator from an expression, we can replace an operator with its opposite operator value.
    A boolean expression created using these above methods are equivalent to their original expression. They will always produce the same truth value.

    We use operators for reference comparisons (location in memory), and .equals() for content comparison.
    More precisely, == checks if both objects point to the same memory location while .equals() evaluates the comparison of values in the objects.




        * */


    }
}
