import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String yourName = myObject.nextLine();
        System.out.println("Enter your age: ");
        String age = myObject.nextLine();
        System.out.println("Which city do you reside? ");
        String city = myObject.nextLine();
        System.out.println("Which college do you attend? ");
        String college = myObject.nextLine();
        System.out.println("Whats your profession? ");
        String profession = myObject.nextLine();
        System.out.println("What is your pet's name? ");
        String petName = myObject.nextLine();
        System.out.println("There once was a person named " +  yourName + " who lived in " + city + ". At the age of " + age + ", " + yourName + " went to college at " + college + "." + yourName + " graduated and went to work as a " + profession + ". Then," + yourName + " adopted an animal named " + petName + ". They both lived happily ever after! ");
    }
}