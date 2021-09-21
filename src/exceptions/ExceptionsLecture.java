package exceptions;
import java.util.Scanner;


public class ExceptionsLecture {

    public String couldBeInt = "42";
    public String noInt = "Hello";

    public void askForInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        String userInput = sc.nextLine();
        try {
            int userInt = Integer.parseInt(userInput);
            System.out.println("You entered " + userInt);
        } catch (NumberFormatException nfx) {
            System.out.println("Uh Oh " + nfx.getMessage() + "there is no Integer!");
        } finally {
            System.out.println("Thank you for your input.");
        }
    }

    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            //userInput = null;
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
        } catch (NullPointerException npx){
            System.out.println("Oops you didn't enter anything");
            npx.printStackTrace();
        } catch (IndexOutOfBoundsException iobx) {
            System.out.println("Oops your string wasn't long enough");
            iobx.printStackTrace();
        } catch (NumberFormatException nfx){
            System.out.println("No integer between chars 10 and 15");
            nfx.printStackTrace();
        } finally {
            System.out.println("That was useful wasn't it?");
        }
    }

}
