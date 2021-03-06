package exceptions;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
        String newSentence = String.join(" ", shorterList);
        System.out.println(newSentence);
    }

//    public void echoWord() throws IllegalArgumentException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hi, Im gumby and im green!");
//        String userInput = sc.nextLine();
//        if(userInput.equalsIgnoreCase("curses")) {
//            throw new IllegalArgumentException();
//        }
//        System.out.println(userInput);
//    }


    public void echoWord() throws CusswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Im gumby and im green!");
        String userInput = sc.nextLine();
        if(userInput.equalsIgnoreCase("curses")) {
            throw new CusswordException("We dont allow that behavior!");
        }
        System.out.println(userInput);
    }

}
