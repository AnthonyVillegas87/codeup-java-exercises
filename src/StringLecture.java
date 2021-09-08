
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
}
