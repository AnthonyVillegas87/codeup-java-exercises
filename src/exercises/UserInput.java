package exercises;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sumOfNumbers = 0;


        while(true) {
            int order = counter + 1;
            System.out.println("Enter #" + order + ":" );

            boolean isValidNum = sc.hasNextInt();

            if(isValidNum) {
                int number = sc.nextInt();
                counter++;
                sumOfNumbers += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine(); // handle end of line enter key
        }
        System.out.println("The sum = " + sumOfNumbers + ".");
        sc.close();
    }
}
