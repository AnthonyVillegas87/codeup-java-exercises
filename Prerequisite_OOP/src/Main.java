import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // SAYING HELLO
//        System.out.println("Hello world!");
//        Scanner myObject = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String yourName = myObject.nextLine();
//        System.out.println("Enter your age: ");
//        String age = myObject.nextLine();
//        System.out.println("Which city do you reside? ");
//        String city = myObject.nextLine();
//        System.out.println("Which college do you attend? ");
//        String college = myObject.nextLine();
//        System.out.println("Whats your profession? ");
//        String profession = myObject.nextLine();
//        System.out.println("What is your pet's name? ");
//        String petName = myObject.nextLine();
//        System.out.println("There once was a person named " +  yourName + " who lived in " + city + ". At the age of " + age + ", " + yourName + " went to college at " + college + "." + yourName + " graduated and went to work as a " + profession + ". Then," + yourName + " adopted an animal named " + petName + ". They both lived happily ever after! ");
//
                //// TWO DIGITS
//        Scanner myObject = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int yourNumber = myObject.nextInt();
//            if(yourNumber >= 10 && yourNumber <= 99) {
//                System.out.println("Two digits.");
//            } else {
//                System.out.println("More than two digits.");
//            }


            /// PAY CALCULATOR
        Scanner myObject = new Scanner(System.in);
        double regularPay;
        double overtime = 0;
        System.out.println("What is your hourly rate?");
        double hourlyRate = myObject.nextDouble();
        System.out.println("How many hours did you work?");
        double hoursWorked = myObject.nextDouble();
            if(hoursWorked <= 40) {
                regularPay = hoursWorked * hourlyRate;
                System.out.println("Hours worked this week: " + hoursWorked);
                System.out.println("Hourly pay: " + hourlyRate);
                System.out.println("Your total pay for this week is " + regularPay);
            } else if(hoursWorked >= 41) {
                regularPay = hoursWorked * hourlyRate;
                overtime = 1.5 * hourlyRate * (hoursWorked - 40);
                System.out.println("Hours worked this week: " + hoursWorked);
                System.out.println("Hourly pay: " + hourlyRate);
                System.out.println("Overtime pay:" + overtime);
                System.out.println("Your total pay is: " + (regularPay + overtime));
            }


    }
}