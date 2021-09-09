
import java.util.Scanner;

public class StringLecture {
    /*
    do not compare strings in Java with comparison operator
    use the comparison operator == for primitive variables
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String userInput = sc.next().toLowerCase();

        switch (userInput){
            case "Yes" -> System.out.println("Great!");
            case "No" -> System.out.println("Okie Dokes!");
            default -> System.out.println("Well...");
        }
    }

    /*
  //===================    Introduction to String Methods    ===================//

    In this lesson, we will go over several String methods:

    length()
    In Java, the length() string method returns the length — total number of characters — of a String.
    concat()
    The concat() method concatenates one string to the end of another string.
    Concatenation is the operation of joining two strings together.
    equals()
    With objects, such as Strings, we can’t use the primitive equality operator == to check for equality between two strings.
    To test equality with strings, we use a built-in method called equals().
     Side note,
    there’s also an equalsIgnoreCase() method that compares two strings without considering upper/lower cases.
    indexOf()
    If we want to know the index of the first occurence of a character in a string,
    we can use the indexOf() method on a string.
    charAt()
    The charAt() method returns the character located at a String‘s specified index
    substring()
    There may be times when we only want a part of a string.
    In such cases, we may want to extract a substring from a string.
    String line = "The Heav'ns and all the Constellations rung";

    System.out.println(line.substring(27, 33));
    When substring() is called with two arguments, the first argument is inclusive and the second is exclusive.
    This means the resulting substring will begin at index 27 and extend up to, but not including, index 33.
    toUpperCase() / toLowerCase()
    There will be times when we have a word in a case other than what we need it in. Luckily, Java has a couple String methods to help us out:

    toUpperCase(): returns the string value converted to uppercase
    toLowerCase(): returns the string value converted to lowercase

// ========== Access & Scope ==============///
    As our Java programs begin to get bigger and we begin to have multiple Objects and Classes that interact with each other,
     the concepts of access and scope come into play.

        Access
    The public and private keywords and how they relate to Classes, variables, constructors, and methods
    The concept of encapsulation
    Accessor methods, sometimes known as “getters”
    Mutator methods, sometimes known as “setters”

    Scope
    Local variables vs. instance variables
    The this keyword

   ====== The public Keyword =====
   These keywords are defining what parts of your code have access to other parts of your code.
   The way we declare something to be public is to use the public keyword in the declaration statement.

     */








}
