import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing? ");
        String myAnswer = scanner.nextLine();
        switch (myAnswer) {
            case "great" -> System.out.println("Amazing to see the positivity!");
            case "good" -> System.out.println("The day will only get better, stay positive!");
            case "okay" -> System.out.println("Stay the course!");
            case "not bad" -> System.out.println("Perhaps the day will get better.");
            case "not good" -> System.out.println("What can we do to make it better?");
            case "bad" -> System.out.println("Come see me today.");
            default -> System.out.println("We don't have that");
        }
    }
}
