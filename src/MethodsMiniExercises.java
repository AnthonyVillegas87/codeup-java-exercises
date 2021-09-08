import java.util.Scanner;

public class MethodsMiniExercises {

        public static String enterInput() {
            Scanner sc = new Scanner(System.in);
            String stringInput = sc.nextLine();
            System.out.println("Please enter an input.");
            return stringInput;
        }

        public static int integerInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter an integer.");
            int intInput = sc.nextInt(); // assume the user will enter a valid integer
            return intInput;

        }
        // TODO: break the following code apart into a few methods
        public static void main(String[] args) {
            String myString = enterInput();
            int integer = integerInput();
            if (myString.length() == integer) {
                System.out.println("That matches the length of the input!");
            } else {
                System.out.println("That doesn't match the length of the input!");
            }



        }


}
