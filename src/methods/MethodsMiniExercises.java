package methods;

import java.util.Scanner;

public class MethodsMiniExercises {

        public static String enterInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter an input.");
            String stringInput = sc.nextLine();
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
 ///// MATTS EXAMPLE
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String stringInput = getInput("Please enter an input.", sc);
//        int intInput = getNum("Please enter an integer.", sc);
//        boolean numsMatch = matches(stringInput.length(), intInput);
//        print(getMessage(numsMatch));
//    }
//
//    public static int getNum(String message, Scanner sc) {
//        print(message);
//        return sc.nextInt();
//    }
//
//    public static String getInput(String message, Scanner sc){
//        print(message);
//        return sc.nextLine();
//    }
//
//    public static String getMessage(boolean doesItMatch) {
//        if (doesItMatch) {
//            return "That matches the length of the input!";
//        } else {
//            return "That doesn't match the length of the input!";
//        }
//    }
//
//    public static void print(String message) {
//        System.out.println(message);
//    }
//
//    public static boolean matches(int len, int num) {
//        return len == num;
//    }
}
