import java.util.Locale;
import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing? ");
        String myAnswer = scanner.nextLine().toLowerCase();
        switch (myAnswer) {
            case "Great" -> System.out.println("Amazing to see the positivity!");
            case "Good" -> System.out.println("The day will only get better, stay positive!");
            case "Okay" -> System.out.println("Stay the course!");
            case "Not bad" -> System.out.println("Perhaps the day will get better.");
            case "Not good" -> System.out.println("What can we do to make it better?");
            case "Bad" -> System.out.println("Come see me today.");
            default -> System.out.println("We don't have that");
        }
    }
}
