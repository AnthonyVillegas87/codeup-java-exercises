package main;

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

   ====== The private Keyword and Encapsulation ===========
   sometimes restricting our code is actually useful from a design perspective. This is one of the core ideas behind encapsulation.
   By making our instance variables (and some methods) private, we encapsulate our code into nice little bundles of logic.

   For example, a Bank object doesn’t necessarily need to know the inner workings of a CheckingAccount object. It doesn’t need to know that the money is stored in a field named money, or that interest is added to an account by using a method named .addInterest().
   In fact, if it had access to those fields or methods, it’s possible that someone using a Bank object could change things in a CheckingAccount without realizing it.
   By limiting access by using the private keyword, we are able to segment, or encapsulate, our code into individual units.

    ========  Accessor and Mutator Methods   ==============
    When writing classes, we often make all of our instance variables private.
    However, we still might want some other classes to have access to them, we just don’t want those classes to know the exact variable name.
    To give other classes access to a private instance variable, we would write an accessor method (sometimes also known as a “getter” method).

    Even though the instance variable name is private, other classes could call the public method getName() which returns the value of that instance variable.
    Accessor methods will always be public, and will have a return type that matches the type of the instance variable they’re accessing.

    Similarly, private instance variables often have mutator methods (sometimes known as “setters”). These methods allow other classes to reset the value stored in private instance variables.
    Mutator methods, or “setters”, often are void methods — they don’t return anything, they just reset the value of an existing variable.
    Similarly, they often have one parameter that is the same type as the variable they’re trying to change.


    ========  Scope: The this Keyword  ===========
If we wanted to access the instance variable and not the local variable, we could use the this keyword.













     */








}
