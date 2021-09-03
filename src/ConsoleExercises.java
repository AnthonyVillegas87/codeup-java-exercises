import java.util.Arrays;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        // 1.
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: " + pi);

        Scanner scanner = new Scanner(System.in);
       // 2.
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();

//        System.out.print("Enter word one: ");
//        String firstWord = scanner.nextLine();
//        System.out.print("Enter word two: ");
//        String secondWord = scanner.nextLine();
//        System.out.print("Enter word three: ");
//        String thirdWord = scanner.nextLine();

//        System.out.print("Enter a sentence: ");
//        String aSentence = scanner.nextLine();
//        System.out.println("The sentence you entered: " + aSentence);

        //  3.
        System.out.print("Enter the length: ");
        int lengthInput = scanner.nextInt();
        System.out.print("Enter the width: ");
        int widthInput = scanner.nextInt();
        int userInput = 2 * (lengthInput + widthInput);
        System.out.println("Perimeter of Rectangle: " + userInput);
        int area = lengthInput * widthInput;
        System.out.println("Area of rectangle is: " + area );


//# Console IO Bonus Exercises
//
//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
//
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()

    }
}
