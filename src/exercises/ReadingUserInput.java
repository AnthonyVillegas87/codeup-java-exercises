package exercises;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you year of birth: ");

        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine(); // handle next line enter key

            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            int age = 2022 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year");
            }
        } else {
            System.out.println("Unable to parse year.");
        }



        sc.close();
    }
}
